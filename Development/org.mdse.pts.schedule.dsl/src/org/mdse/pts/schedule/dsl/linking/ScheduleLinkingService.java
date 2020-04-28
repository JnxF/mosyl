package org.mdse.pts.schedule.dsl.linking;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Spot;

public class ScheduleLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) throws IllegalNodeException {
		
	
		if (context instanceof Schedule && reference == SchedulePackage.eINSTANCE.getSchedule_Network()) {
			return getSchedule_Network_Scope((Schedule) context);
		}
		
		else if (context instanceof Schedule && reference == SchedulePackage.eINSTANCE.getSchedule_Depots()) {
			return getSchedule_Depots_Scope((Schedule) context);
		}
		
		else if (context instanceof Spot && reference == SchedulePackage.eINSTANCE.getSpot_Leg()) {
			return getSpot_Leg_Scope((Spot) context);
		}
		
		return super.getLinkedObjects(context, reference, node);
	}

	private List<EObject> getSpot_Leg_Scope(Spot context) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<EObject> getSchedule_Depots_Scope(Schedule context) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<EObject> getSchedule_Network_Scope(Schedule context) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
