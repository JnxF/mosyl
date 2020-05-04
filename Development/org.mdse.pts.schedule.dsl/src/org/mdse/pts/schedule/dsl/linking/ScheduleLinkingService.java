package org.mdse.pts.schedule.dsl.linking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.mdse.pts.common.util.EcoreIOUtil;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.TrainSchedule;

import depot.Depot;
import depot.Train;
import network.Station;

public class ScheduleLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node)
			throws IllegalNodeException {
		
		// Network in Schedule
		if (context instanceof Schedule && reference == SchedulePackage.eINSTANCE.getSchedule_Network()) {
			return getNetworkOfSchedule((Schedule) context, node);
		}
		
		// Depots in Schedule
		else if (context instanceof Schedule && reference == SchedulePackage.eINSTANCE.getSchedule_Depots()) {
			return getDepotsOfSchedule((Schedule) context, node);
		}
		
		// Train reference
		else if (context instanceof TrainSchedule && reference == SchedulePackage.eINSTANCE.getTrainSchedule_Train()) {
			return getTrainOfTrainSchedule((TrainSchedule) context, node);
		}
		
		// Station reference on Spots
		else if (context instanceof Spot && reference == SchedulePackage.eINSTANCE.getSpot_Station()) {
			return getStationOfSpot((Spot) context, node);
		}

		return super.getLinkedObjects(context, reference, node);
	}

	private List<EObject> getStationOfSpot(Spot context, INode node) {
		EObject root = EcoreUtil.getRootContainer(context);
		
		if (!(root instanceof Schedule)) {
			System.err.println("Root element is not a Schedule");
			return null;
		}
		
		Schedule schedule = (Schedule) root;
		ArrayList<EObject> result = new ArrayList<>();
		for (Station s : schedule.getNetwork().getStations()) {
			if (s.getName().equals(getCrossRefNodeAsString(node))) {
				result.add(s);
				return result;
			}
		}
		
		return Collections.emptyList();
	}

	private List<EObject> getTrainOfTrainSchedule(TrainSchedule context, INode node) {
		EObject root = EcoreUtil.getRootContainer(context);
		
		if (!(root instanceof Schedule)) {
			System.err.println("Root element is not a Schedule");
			return null;
		}
		
		EList<Depot> depots = ((Schedule) root).getDepots();
		ArrayList<EObject> result = new ArrayList<>();
		
		for (Depot d : depots) {
			for (Train t : d.getTrains()) {
				if (t.getName().equals(getCrossRefNodeAsString(node))) {
					result.add(t);
					return result;
				}
			}
		}
		
		return Collections.emptyList();
	}

	private List<EObject> getDepotsOfSchedule(Schedule context, INode node) {
		String inputName = getCrossRefNodeAsString(node);

		try {
			IFile file = findFileInSameFolder(context, inputName + ".depot");
			EObject n = EcoreIOUtil.loadModel(file);
			ArrayList<EObject> depots = new ArrayList<>();
			depots.add(n);
			return depots;
		} catch (Exception e) {
			return Collections.emptyList();
		}
	} 

	private List<EObject> getNetworkOfSchedule(Schedule context, INode node) {
		String inputName = getCrossRefNodeAsString(node);

		try {
			IFile file = findFileInSameFolder(context, inputName + ".network");
			EObject n = EcoreIOUtil.loadModel(file);
			ArrayList<EObject> networks = new ArrayList<>();
			networks.add(n);
			return networks;
		} catch (Exception e) {
			return Collections.emptyList();
		}
	}

	protected static IFile findFileInSameFolder(EObject eObject, String fileName) {
		Resource resource = eObject.eResource();
		URI resourceURI = resource.getURI();

	 	URI accompanyingFileURI = resourceURI.trimSegments(1).appendSegment(fileName);

		String fileURIString = null;

		if (accompanyingFileURI.isFile()) {
			fileURIString = accompanyingFileURI.toFileString();
		} else if (resourceURI.isPlatform()) {
			fileURIString = accompanyingFileURI.toPlatformString(true);
		}

		if (fileURIString == null) {
			return null;
		}

		IPath relativeFilePath = new Path(fileURIString);

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();

		return workspaceRoot.getFile(relativeFilePath);
	}
}
