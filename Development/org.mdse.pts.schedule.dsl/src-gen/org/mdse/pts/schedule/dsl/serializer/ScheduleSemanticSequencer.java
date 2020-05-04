/*
 * generated by Xtext 2.21.0
 */
package org.mdse.pts.schedule.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.mdse.pts.schedule.DateTime;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.Spot;
import org.mdse.pts.schedule.Time;
import org.mdse.pts.schedule.TimeDescription;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;

@SuppressWarnings("all")
public class ScheduleSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ScheduleGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SchedulePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SchedulePackage.DATE_TIME:
				sequence_DateTime(context, (DateTime) semanticObject); 
				return; 
			case SchedulePackage.ROUTE:
				sequence_Route(context, (Route) semanticObject); 
				return; 
			case SchedulePackage.SCHEDULE:
				sequence_Schedule(context, (Schedule) semanticObject); 
				return; 
			case SchedulePackage.SPOT:
				if (rule == grammarAccess.getFinalSpotRule()) {
					sequence_FinalSpot(context, (Spot) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMiddleSpotRule()) {
					sequence_MiddleSpot(context, (Spot) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getStartSpotRule()) {
					sequence_StartSpot(context, (Spot) semanticObject); 
					return; 
				}
				else break;
			case SchedulePackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case SchedulePackage.TIME_DESCRIPTION:
				sequence_TimeDescription(context, (TimeDescription) semanticObject); 
				return; 
			case SchedulePackage.TRAIN_SCHEDULE:
				sequence_TrainSchedule(context, (TrainSchedule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DateTime returns DateTime
	 *
	 * Constraint:
	 *     (weekday+=WeekDays weekday+=WeekDays* time=Time)
	 */
	protected void sequence_DateTime(ISerializationContext context, DateTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FinalSpot returns Spot
	 *
	 * Constraint:
	 *     (station=[Station|ID] platform=STRING?)
	 */
	protected void sequence_FinalSpot(ISerializationContext context, Spot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MiddleSpot returns Spot
	 *
	 * Constraint:
	 *     (station=[Station|ID] platform=STRING? waitingTime=INT turnStation?='turn'? leg=[Leg|ID]?)
	 */
	protected void sequence_MiddleSpot(ISerializationContext context, Spot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Route returns Route
	 *
	 * Constraint:
	 *     (spots+=StartSpot spots+=MiddleSpot* spots+=FinalSpot)
	 */
	protected void sequence_Route(ISerializationContext context, Route semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Schedule returns Schedule
	 *
	 * Constraint:
	 *     (network=[Network|ID] depots+=[Depot|ID] depots+=[Depot|ID]* trainSchedules+=TrainSchedule*)
	 */
	protected void sequence_Schedule(ISerializationContext context, Schedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StartSpot returns Spot
	 *
	 * Constraint:
	 *     (station=[Station|ID] platform=STRING? leg=[Leg|ID]?)
	 */
	protected void sequence_StartSpot(ISerializationContext context, Spot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeDescription returns TimeDescription
	 *
	 * Constraint:
	 *     (dateTimes+=DateTime (dateTimes+=DateTime* dateTimes+=DateTime)?)
	 */
	protected void sequence_TimeDescription(ISerializationContext context, TimeDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     (hours=INT minutes=INT)
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.TIME__HOURS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.TIME__HOURS));
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.TIME__MINUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.TIME__MINUTES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getHoursINTTerminalRuleCall_0_0(), semanticObject.getHours());
		feeder.accept(grammarAccess.getTimeAccess().getMinutesINTTerminalRuleCall_2_0(), semanticObject.getMinutes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TrainSchedule returns TrainSchedule
	 *
	 * Constraint:
	 *     (train=[Train|ID] timeDescription=TimeDescription route=Route)
	 */
	protected void sequence_TrainSchedule(ISerializationContext context, TrainSchedule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.TRAIN_SCHEDULE__TRAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.TRAIN_SCHEDULE__TRAIN));
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.TRAIN_SCHEDULE__TIME_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.TRAIN_SCHEDULE__TIME_DESCRIPTION));
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.TRAIN_SCHEDULE__ROUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.TRAIN_SCHEDULE__ROUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTrainScheduleAccess().getTrainTrainIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SchedulePackage.Literals.TRAIN_SCHEDULE__TRAIN, false));
		feeder.accept(grammarAccess.getTrainScheduleAccess().getTimeDescriptionTimeDescriptionParserRuleCall_3_0(), semanticObject.getTimeDescription());
		feeder.accept(grammarAccess.getTrainScheduleAccess().getRouteRouteParserRuleCall_5_0(), semanticObject.getRoute());
		feeder.finish();
	}
	
	
}
