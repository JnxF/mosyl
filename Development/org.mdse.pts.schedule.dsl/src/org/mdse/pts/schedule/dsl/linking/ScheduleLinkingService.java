package org.mdse.pts.schedule.dsl.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.mdse.pts.common.util.EcoreIOUtil;
import org.mdse.pts.depot.Train;
import org.mdse.pts.network.Network;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;


public class ScheduleLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) throws IllegalNodeException {
		// Network
		if (reference.equals(SchedulePackage.eINSTANCE.getSchedule_Network())) {
			final String crossRefNode = getCrossRefNodeAsString(node);
			Network network = loadModelFromSameFolder(context, crossRefNode + ".network");
			if (network != null) {
				return Collections.singletonList(network);
			} 
		} 
		
		// Depot
		if (reference.equals(SchedulePackage.eINSTANCE.getSchedule_Depots())) {
			final String crossRefNode = getCrossRefNodeAsString(node);
			org.mdse.pts.depot.Depot depot = loadModelFromSameFolder(context, crossRefNode + ".depot");
			if (depot != null) {
				return Collections.singletonList(depot);
			}
		}
		
		// Train
		if (reference.equals(SchedulePackage.eINSTANCE.getTrainSchedule_Train())) {
			EObject root = EcoreUtil.getRootContainer(context);
			if (!(root instanceof Schedule)) {
				System.err.println("Root element is not a Schedule");
				return null;
			}
			for (org.mdse.pts.depot.Depot d : ((Schedule) root).getDepots()) {
				for (Train t : d.getTrains()) {
					if (t.getName().equalsIgnoreCase(getCrossRefNodeAsString(node))) {
						return Collections.singletonList(t);
					}
				}
			}
		}
		
		// City
		if (reference.equals(SchedulePackage.eINSTANCE.getSpot_Station())) {
			EObject root = EcoreUtil.getRootContainer(context);
			if (!(root instanceof Schedule)) {
				System.err.println("Root element is not a Schedule");
				return null;
			}
			Network network = ((Schedule) root).getNetwork();
			for (Station station : network.getStations()) {
				if (station.getName().equalsIgnoreCase(getCrossRefNodeAsString(node))) {
					return Collections.singletonList(station);
				}
			}
		}
		
		return super.getLinkedObjects(context, reference, node);
	}

	protected <T> T loadModelFromSameFolder(EObject modelElement, String fileName) {
		IFile originalFile = EcoreIOUtil.resolveRelativeFileFromEObject(modelElement);
		IFile accompanyingFile = getFileInSameFolder(originalFile, fileName);
		
		if (accompanyingFile == null || !accompanyingFile.exists()) {
			return null;
		}
		
		return EcoreIOUtil.loadModel(accompanyingFile);
	}

	protected IFile getFileInSameFolder(IFile originalFile, String filename) {
		IContainer parent = originalFile.getParent();
		IPath path = new Path(filename);
		return parent.getFile(path);
	}
}
