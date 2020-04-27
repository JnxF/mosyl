/*
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.SituatedSpotWithConnection;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class ScheduleScopeProvider extends AbstractScheduleScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context instanceof Schedule && reference == SchedulePackage.eINSTANCE.getSchedule_Network()) {
			return getSchedule_Network_Scope((Schedule) context);
		}
		
		else if (context instanceof Schedule && reference == SchedulePackage.eINSTANCE.getSchedule_Depots()) {
			return getSchedule_Depots_Scope((Schedule) context);
		}
		
		else if (context instanceof SituatedSpotWithConnection&& reference == SchedulePackage.eINSTANCE.getSituatedSpotWithConnection_Leg()) {
			return getSituatedSpotWithConnection_Leg_Scope((SituatedSpotWithConnection) context);
		}
		
		return super.getScope(context, reference);
	}
	
	// TODO: implement
	private IScope getSchedule_Network_Scope(Schedule context) {
		return IScope.NULLSCOPE;
	}

	// TODO: implement
	private IScope getSchedule_Depots_Scope(Schedule schedule) {
		return IScope.NULLSCOPE;
	}
	
	// TODO: implement
	private IScope getSituatedSpotWithConnection_Leg_Scope(SituatedSpotWithConnection schedule) {
		return IScope.NULLSCOPE;
	}
}
