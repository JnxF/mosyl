/*
 * generated by Xtext 2.21.0
 */
package org.mdse.pts.schedule.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ScheduleGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ScheduleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.Schedule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScheduleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cForKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNetworkAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cNetworkNetworkCrossReference_2_0 = (CrossReference)cNetworkAssignment_2.eContents().get(0);
		private final RuleCall cNetworkNetworkIDTerminalRuleCall_2_0_1 = (RuleCall)cNetworkNetworkCrossReference_2_0.eContents().get(1);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDepotsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDepotsDepotCrossReference_4_0 = (CrossReference)cDepotsAssignment_4.eContents().get(0);
		private final RuleCall cDepotsDepotIDTerminalRuleCall_4_0_1 = (RuleCall)cDepotsDepotCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDepotsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cDepotsDepotCrossReference_5_1_0 = (CrossReference)cDepotsAssignment_5_1.eContents().get(0);
		private final RuleCall cDepotsDepotIDTerminalRuleCall_5_1_0_1 = (RuleCall)cDepotsDepotCrossReference_5_1_0.eContents().get(1);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTrainSchedulesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTrainSchedulesTrainScheduleParserRuleCall_7_0 = (RuleCall)cTrainSchedulesAssignment_7.eContents().get(0);
		
		//Schedule:
		//	"schedule" "for" network=[network::Network] "with" depots+=[depot::Depot] ("," depots+=[depot::Depot])* ":"
		//	trainSchedules+=TrainSchedule*;
		@Override public ParserRule getRule() { return rule; }
		
		//"schedule" "for" network=[network::Network] "with" depots+=[depot::Depot] ("," depots+=[depot::Depot])* ":"
		//trainSchedules+=TrainSchedule*
		public Group getGroup() { return cGroup; }
		
		//"schedule"
		public Keyword getScheduleKeyword_0() { return cScheduleKeyword_0; }
		
		//"for"
		public Keyword getForKeyword_1() { return cForKeyword_1; }
		
		//network=[network::Network]
		public Assignment getNetworkAssignment_2() { return cNetworkAssignment_2; }
		
		//[network::Network]
		public CrossReference getNetworkNetworkCrossReference_2_0() { return cNetworkNetworkCrossReference_2_0; }
		
		//ID
		public RuleCall getNetworkNetworkIDTerminalRuleCall_2_0_1() { return cNetworkNetworkIDTerminalRuleCall_2_0_1; }
		
		//"with"
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//depots+=[depot::Depot]
		public Assignment getDepotsAssignment_4() { return cDepotsAssignment_4; }
		
		//[depot::Depot]
		public CrossReference getDepotsDepotCrossReference_4_0() { return cDepotsDepotCrossReference_4_0; }
		
		//ID
		public RuleCall getDepotsDepotIDTerminalRuleCall_4_0_1() { return cDepotsDepotIDTerminalRuleCall_4_0_1; }
		
		//("," depots+=[depot::Depot])*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//depots+=[depot::Depot]
		public Assignment getDepotsAssignment_5_1() { return cDepotsAssignment_5_1; }
		
		//[depot::Depot]
		public CrossReference getDepotsDepotCrossReference_5_1_0() { return cDepotsDepotCrossReference_5_1_0; }
		
		//ID
		public RuleCall getDepotsDepotIDTerminalRuleCall_5_1_0_1() { return cDepotsDepotIDTerminalRuleCall_5_1_0_1; }
		
		//":"
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//trainSchedules+=TrainSchedule*
		public Assignment getTrainSchedulesAssignment_7() { return cTrainSchedulesAssignment_7; }
		
		//TrainSchedule
		public RuleCall getTrainSchedulesTrainScheduleParserRuleCall_7_0() { return cTrainSchedulesTrainScheduleParserRuleCall_7_0; }
	}
	public class TrainScheduleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.TrainSchedule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTrainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTrainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTrainTrainCrossReference_1_0 = (CrossReference)cTrainAssignment_1.eContents().get(0);
		private final RuleCall cTrainTrainIDTerminalRuleCall_1_0_1 = (RuleCall)cTrainTrainCrossReference_1_0.eContents().get(1);
		private final Keyword cOnKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTimeDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTimeDescriptionTimeDescriptionParserRuleCall_3_0 = (RuleCall)cTimeDescriptionAssignment_3.eContents().get(0);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRouteAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRouteRouteParserRuleCall_5_0 = (RuleCall)cRouteAssignment_5.eContents().get(0);
		
		//TrainSchedule:
		//	"train" train=[depot::Train]
		//	"on" timeDescription=TimeDescription ":"
		//	route=Route;
		@Override public ParserRule getRule() { return rule; }
		
		//"train" train=[depot::Train] "on" timeDescription=TimeDescription ":" route=Route
		public Group getGroup() { return cGroup; }
		
		//"train"
		public Keyword getTrainKeyword_0() { return cTrainKeyword_0; }
		
		//train=[depot::Train]
		public Assignment getTrainAssignment_1() { return cTrainAssignment_1; }
		
		//[depot::Train]
		public CrossReference getTrainTrainCrossReference_1_0() { return cTrainTrainCrossReference_1_0; }
		
		//ID
		public RuleCall getTrainTrainIDTerminalRuleCall_1_0_1() { return cTrainTrainIDTerminalRuleCall_1_0_1; }
		
		//"on"
		public Keyword getOnKeyword_2() { return cOnKeyword_2; }
		
		//timeDescription=TimeDescription
		public Assignment getTimeDescriptionAssignment_3() { return cTimeDescriptionAssignment_3; }
		
		//TimeDescription
		public RuleCall getTimeDescriptionTimeDescriptionParserRuleCall_3_0() { return cTimeDescriptionTimeDescriptionParserRuleCall_3_0; }
		
		//":"
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//route=Route
		public Assignment getRouteAssignment_5() { return cRouteAssignment_5; }
		
		//Route
		public RuleCall getRouteRouteParserRuleCall_5_0() { return cRouteRouteParserRuleCall_5_0; }
	}
	public class TimeDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.TimeDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDateTimesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDateTimesDateTimeParserRuleCall_0_0 = (RuleCall)cDateTimesAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Keyword cCommaKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cDateTimesAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cDateTimesDateTimeParserRuleCall_1_0_1_0 = (RuleCall)cDateTimesAssignment_1_0_1.eContents().get(0);
		private final Keyword cAndKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cDateTimesAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cDateTimesDateTimeParserRuleCall_1_2_0 = (RuleCall)cDateTimesAssignment_1_2.eContents().get(0);
		
		//TimeDescription:
		//	dateTimes+=DateTime (("," dateTimes+=DateTime)* "and" dateTimes+=DateTime)?;
		@Override public ParserRule getRule() { return rule; }
		
		//dateTimes+=DateTime (("," dateTimes+=DateTime)* "and" dateTimes+=DateTime)?
		public Group getGroup() { return cGroup; }
		
		//dateTimes+=DateTime
		public Assignment getDateTimesAssignment_0() { return cDateTimesAssignment_0; }
		
		//DateTime
		public RuleCall getDateTimesDateTimeParserRuleCall_0_0() { return cDateTimesDateTimeParserRuleCall_0_0; }
		
		//(("," dateTimes+=DateTime)* "and" dateTimes+=DateTime)?
		public Group getGroup_1() { return cGroup_1; }
		
		//("," dateTimes+=DateTime)*
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//","
		public Keyword getCommaKeyword_1_0_0() { return cCommaKeyword_1_0_0; }
		
		//dateTimes+=DateTime
		public Assignment getDateTimesAssignment_1_0_1() { return cDateTimesAssignment_1_0_1; }
		
		//DateTime
		public RuleCall getDateTimesDateTimeParserRuleCall_1_0_1_0() { return cDateTimesDateTimeParserRuleCall_1_0_1_0; }
		
		//"and"
		public Keyword getAndKeyword_1_1() { return cAndKeyword_1_1; }
		
		//dateTimes+=DateTime
		public Assignment getDateTimesAssignment_1_2() { return cDateTimesAssignment_1_2; }
		
		//DateTime
		public RuleCall getDateTimesDateTimeParserRuleCall_1_2_0() { return cDateTimesDateTimeParserRuleCall_1_2_0; }
	}
	public class DateTimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.DateTime");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWeekdayAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cWeekdayWeekDaysEnumRuleCall_0_0 = (RuleCall)cWeekdayAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cWeekdayAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cWeekdayWeekDaysEnumRuleCall_1_1_0 = (RuleCall)cWeekdayAssignment_1_1.eContents().get(0);
		private final Keyword cAtKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTimeTimeParserRuleCall_3_0 = (RuleCall)cTimeAssignment_3.eContents().get(0);
		
		//DateTime:
		//	weekday+=WeekDays ("," weekday+=WeekDays)*
		//	"at" time=Time;
		@Override public ParserRule getRule() { return rule; }
		
		//weekday+=WeekDays ("," weekday+=WeekDays)* "at" time=Time
		public Group getGroup() { return cGroup; }
		
		//weekday+=WeekDays
		public Assignment getWeekdayAssignment_0() { return cWeekdayAssignment_0; }
		
		//WeekDays
		public RuleCall getWeekdayWeekDaysEnumRuleCall_0_0() { return cWeekdayWeekDaysEnumRuleCall_0_0; }
		
		//("," weekday+=WeekDays)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//weekday+=WeekDays
		public Assignment getWeekdayAssignment_1_1() { return cWeekdayAssignment_1_1; }
		
		//WeekDays
		public RuleCall getWeekdayWeekDaysEnumRuleCall_1_1_0() { return cWeekdayWeekDaysEnumRuleCall_1_1_0; }
		
		//"at"
		public Keyword getAtKeyword_2() { return cAtKeyword_2; }
		
		//time=Time
		public Assignment getTimeAssignment_3() { return cTimeAssignment_3; }
		
		//Time
		public RuleCall getTimeTimeParserRuleCall_3_0() { return cTimeTimeParserRuleCall_3_0; }
	}
	public class TimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.Time");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHoursAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHoursINTTerminalRuleCall_0_0 = (RuleCall)cHoursAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinutesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMinutesINTTerminalRuleCall_2_0 = (RuleCall)cMinutesAssignment_2.eContents().get(0);
		
		//Time:
		//	hours=INT ":" minutes=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//hours=INT ":" minutes=INT
		public Group getGroup() { return cGroup; }
		
		//hours=INT
		public Assignment getHoursAssignment_0() { return cHoursAssignment_0; }
		
		//INT
		public RuleCall getHoursINTTerminalRuleCall_0_0() { return cHoursINTTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//minutes=INT
		public Assignment getMinutesAssignment_2() { return cMinutesAssignment_2; }
		
		//INT
		public RuleCall getMinutesINTTerminalRuleCall_2_0() { return cMinutesINTTerminalRuleCall_2_0; }
	}
	public class RouteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.Route");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSpotsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSpotsStartSpotParserRuleCall_0_0 = (RuleCall)cSpotsAssignment_0.eContents().get(0);
		private final Assignment cSpotsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpotsMiddleSpotParserRuleCall_1_0 = (RuleCall)cSpotsAssignment_1.eContents().get(0);
		private final Assignment cSpotsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpotsFinalSpotParserRuleCall_2_0 = (RuleCall)cSpotsAssignment_2.eContents().get(0);
		
		//Route:
		//	spots+=StartSpot
		//	spots+=MiddleSpot*
		//	spots+=FinalSpot;
		@Override public ParserRule getRule() { return rule; }
		
		//spots+=StartSpot spots+=MiddleSpot* spots+=FinalSpot
		public Group getGroup() { return cGroup; }
		
		//spots+=StartSpot
		public Assignment getSpotsAssignment_0() { return cSpotsAssignment_0; }
		
		//StartSpot
		public RuleCall getSpotsStartSpotParserRuleCall_0_0() { return cSpotsStartSpotParserRuleCall_0_0; }
		
		//spots+=MiddleSpot*
		public Assignment getSpotsAssignment_1() { return cSpotsAssignment_1; }
		
		//MiddleSpot
		public RuleCall getSpotsMiddleSpotParserRuleCall_1_0() { return cSpotsMiddleSpotParserRuleCall_1_0; }
		
		//spots+=FinalSpot
		public Assignment getSpotsAssignment_2() { return cSpotsAssignment_2; }
		
		//FinalSpot
		public RuleCall getSpotsFinalSpotParserRuleCall_2_0() { return cSpotsFinalSpotParserRuleCall_2_0; }
	}
	public class StartSpotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.StartSpot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAtKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStationStationCrossReference_2_0 = (CrossReference)cStationAssignment_2.eContents().get(0);
		private final RuleCall cStationStationIDTerminalRuleCall_2_0_1 = (RuleCall)cStationStationCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cOnKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cPlatformKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cPlatformAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cPlatformSTRINGTerminalRuleCall_3_2_0 = (RuleCall)cPlatformAssignment_3_2.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDriveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cViaKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cLegAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cLegLegCrossReference_4_2_0 = (CrossReference)cLegAssignment_4_2.eContents().get(0);
		private final RuleCall cLegLegIDTerminalRuleCall_4_2_0_1 = (RuleCall)cLegLegCrossReference_4_2_0.eContents().get(1);
		
		//StartSpot Spot:
		//	"start" "at" station=[network::Station] ("on" "platform" platform=STRING)? ("drive" "via" leg=[network::Leg])?;
		@Override public ParserRule getRule() { return rule; }
		
		//"start" "at" station=[network::Station] ("on" "platform" platform=STRING)? ("drive" "via" leg=[network::Leg])?
		public Group getGroup() { return cGroup; }
		
		//"start"
		public Keyword getStartKeyword_0() { return cStartKeyword_0; }
		
		//"at"
		public Keyword getAtKeyword_1() { return cAtKeyword_1; }
		
		//station=[network::Station]
		public Assignment getStationAssignment_2() { return cStationAssignment_2; }
		
		//[network::Station]
		public CrossReference getStationStationCrossReference_2_0() { return cStationStationCrossReference_2_0; }
		
		//ID
		public RuleCall getStationStationIDTerminalRuleCall_2_0_1() { return cStationStationIDTerminalRuleCall_2_0_1; }
		
		//("on" "platform" platform=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//"on"
		public Keyword getOnKeyword_3_0() { return cOnKeyword_3_0; }
		
		//"platform"
		public Keyword getPlatformKeyword_3_1() { return cPlatformKeyword_3_1; }
		
		//platform=STRING
		public Assignment getPlatformAssignment_3_2() { return cPlatformAssignment_3_2; }
		
		//STRING
		public RuleCall getPlatformSTRINGTerminalRuleCall_3_2_0() { return cPlatformSTRINGTerminalRuleCall_3_2_0; }
		
		//("drive" "via" leg=[network::Leg])?
		public Group getGroup_4() { return cGroup_4; }
		
		//"drive"
		public Keyword getDriveKeyword_4_0() { return cDriveKeyword_4_0; }
		
		//"via"
		public Keyword getViaKeyword_4_1() { return cViaKeyword_4_1; }
		
		//leg=[network::Leg]
		public Assignment getLegAssignment_4_2() { return cLegAssignment_4_2; }
		
		//[network::Leg]
		public CrossReference getLegLegCrossReference_4_2_0() { return cLegLegCrossReference_4_2_0; }
		
		//ID
		public RuleCall getLegLegIDTerminalRuleCall_4_2_0_1() { return cLegLegIDTerminalRuleCall_4_2_0_1; }
	}
	public class MiddleSpotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.MiddleSpot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAtKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStationStationCrossReference_2_0 = (CrossReference)cStationAssignment_2.eContents().get(0);
		private final RuleCall cStationStationIDTerminalRuleCall_2_0_1 = (RuleCall)cStationStationCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cOnKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cPlatformKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cPlatformAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cPlatformSTRINGTerminalRuleCall_3_2_0 = (RuleCall)cPlatformAssignment_3_2.eContents().get(0);
		private final Keyword cForKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cWaitingTimeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cWaitingTimeINTTerminalRuleCall_5_0 = (RuleCall)cWaitingTimeAssignment_5.eContents().get(0);
		private final Keyword cMinKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cAndKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cTurnStationAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final Keyword cTurnStationTurnKeyword_7_1_0 = (Keyword)cTurnStationAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDriveKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cViaKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cLegAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final CrossReference cLegLegCrossReference_8_2_0 = (CrossReference)cLegAssignment_8_2.eContents().get(0);
		private final RuleCall cLegLegIDTerminalRuleCall_8_2_0_1 = (RuleCall)cLegLegCrossReference_8_2_0.eContents().get(1);
		
		//MiddleSpot Spot:
		//	"stop" "at" station=[network::Station] ("on" "platform" platform=STRING)?
		//	"for" waitingTime=INT "min" ("and" turnStation?="turn")? ("drive" "via" leg=[network::Leg])?;
		@Override public ParserRule getRule() { return rule; }
		
		//"stop" "at" station=[network::Station] ("on" "platform" platform=STRING)? "for" waitingTime=INT "min" ("and"
		//turnStation?="turn")? ("drive" "via" leg=[network::Leg])?
		public Group getGroup() { return cGroup; }
		
		//"stop"
		public Keyword getStopKeyword_0() { return cStopKeyword_0; }
		
		//"at"
		public Keyword getAtKeyword_1() { return cAtKeyword_1; }
		
		//station=[network::Station]
		public Assignment getStationAssignment_2() { return cStationAssignment_2; }
		
		//[network::Station]
		public CrossReference getStationStationCrossReference_2_0() { return cStationStationCrossReference_2_0; }
		
		//ID
		public RuleCall getStationStationIDTerminalRuleCall_2_0_1() { return cStationStationIDTerminalRuleCall_2_0_1; }
		
		//("on" "platform" platform=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//"on"
		public Keyword getOnKeyword_3_0() { return cOnKeyword_3_0; }
		
		//"platform"
		public Keyword getPlatformKeyword_3_1() { return cPlatformKeyword_3_1; }
		
		//platform=STRING
		public Assignment getPlatformAssignment_3_2() { return cPlatformAssignment_3_2; }
		
		//STRING
		public RuleCall getPlatformSTRINGTerminalRuleCall_3_2_0() { return cPlatformSTRINGTerminalRuleCall_3_2_0; }
		
		//"for"
		public Keyword getForKeyword_4() { return cForKeyword_4; }
		
		//waitingTime=INT
		public Assignment getWaitingTimeAssignment_5() { return cWaitingTimeAssignment_5; }
		
		//INT
		public RuleCall getWaitingTimeINTTerminalRuleCall_5_0() { return cWaitingTimeINTTerminalRuleCall_5_0; }
		
		//"min"
		public Keyword getMinKeyword_6() { return cMinKeyword_6; }
		
		//("and" turnStation?="turn")?
		public Group getGroup_7() { return cGroup_7; }
		
		//"and"
		public Keyword getAndKeyword_7_0() { return cAndKeyword_7_0; }
		
		//turnStation?="turn"
		public Assignment getTurnStationAssignment_7_1() { return cTurnStationAssignment_7_1; }
		
		//"turn"
		public Keyword getTurnStationTurnKeyword_7_1_0() { return cTurnStationTurnKeyword_7_1_0; }
		
		//("drive" "via" leg=[network::Leg])?
		public Group getGroup_8() { return cGroup_8; }
		
		//"drive"
		public Keyword getDriveKeyword_8_0() { return cDriveKeyword_8_0; }
		
		//"via"
		public Keyword getViaKeyword_8_1() { return cViaKeyword_8_1; }
		
		//leg=[network::Leg]
		public Assignment getLegAssignment_8_2() { return cLegAssignment_8_2; }
		
		//[network::Leg]
		public CrossReference getLegLegCrossReference_8_2_0() { return cLegLegCrossReference_8_2_0; }
		
		//ID
		public RuleCall getLegLegIDTerminalRuleCall_8_2_0_1() { return cLegLegIDTerminalRuleCall_8_2_0_1; }
	}
	public class FinalSpotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.FinalSpot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTerminateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAtKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStationStationCrossReference_2_0 = (CrossReference)cStationAssignment_2.eContents().get(0);
		private final RuleCall cStationStationIDTerminalRuleCall_2_0_1 = (RuleCall)cStationStationCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cOnKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cPlatformKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cPlatformAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cPlatformSTRINGTerminalRuleCall_3_2_0 = (RuleCall)cPlatformAssignment_3_2.eContents().get(0);
		
		//FinalSpot Spot:
		//	"terminate" "at" station=[network::Station] ("on" "platform" platform=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"terminate" "at" station=[network::Station] ("on" "platform" platform=STRING)?
		public Group getGroup() { return cGroup; }
		
		//"terminate"
		public Keyword getTerminateKeyword_0() { return cTerminateKeyword_0; }
		
		//"at"
		public Keyword getAtKeyword_1() { return cAtKeyword_1; }
		
		//station=[network::Station]
		public Assignment getStationAssignment_2() { return cStationAssignment_2; }
		
		//[network::Station]
		public CrossReference getStationStationCrossReference_2_0() { return cStationStationCrossReference_2_0; }
		
		//ID
		public RuleCall getStationStationIDTerminalRuleCall_2_0_1() { return cStationStationIDTerminalRuleCall_2_0_1; }
		
		//("on" "platform" platform=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//"on"
		public Keyword getOnKeyword_3_0() { return cOnKeyword_3_0; }
		
		//"platform"
		public Keyword getPlatformKeyword_3_1() { return cPlatformKeyword_3_1; }
		
		//platform=STRING
		public Assignment getPlatformAssignment_3_2() { return cPlatformAssignment_3_2; }
		
		//STRING
		public RuleCall getPlatformSTRINGTerminalRuleCall_3_2_0() { return cPlatformSTRINGTerminalRuleCall_3_2_0; }
	}
	
	public class WeekDaysElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.WeekDays");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMONDAYEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMONDAYMondayKeyword_0_0 = (Keyword)cMONDAYEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTUESDAYEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTUESDAYTuesdayKeyword_1_0 = (Keyword)cTUESDAYEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cWEDNESDAYEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cWEDNESDAYWednesdayKeyword_2_0 = (Keyword)cWEDNESDAYEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cTHURSDAYEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cTHURSDAYThursdayKeyword_3_0 = (Keyword)cTHURSDAYEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cFRIDAYEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cFRIDAYFridayKeyword_4_0 = (Keyword)cFRIDAYEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cSATURDAYEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cSATURDAYSaturdayKeyword_5_0 = (Keyword)cSATURDAYEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cSUNDAYEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cSUNDAYSundayKeyword_6_0 = (Keyword)cSUNDAYEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum WeekDays:
		//	MONDAY="Monday" | TUESDAY="Tuesday" | WEDNESDAY="Wednesday" | THURSDAY="Thursday" |
		//	FRIDAY="Friday" | SATURDAY="Saturday" | SUNDAY="Sunday";
		public EnumRule getRule() { return rule; }
		
		//MONDAY="Monday" | TUESDAY="Tuesday" | WEDNESDAY="Wednesday" | THURSDAY="Thursday" | FRIDAY="Friday" |
		//SATURDAY="Saturday" | SUNDAY="Sunday"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MONDAY="Monday"
		public EnumLiteralDeclaration getMONDAYEnumLiteralDeclaration_0() { return cMONDAYEnumLiteralDeclaration_0; }
		
		//"Monday"
		public Keyword getMONDAYMondayKeyword_0_0() { return cMONDAYMondayKeyword_0_0; }
		
		//TUESDAY="Tuesday"
		public EnumLiteralDeclaration getTUESDAYEnumLiteralDeclaration_1() { return cTUESDAYEnumLiteralDeclaration_1; }
		
		//"Tuesday"
		public Keyword getTUESDAYTuesdayKeyword_1_0() { return cTUESDAYTuesdayKeyword_1_0; }
		
		//WEDNESDAY="Wednesday"
		public EnumLiteralDeclaration getWEDNESDAYEnumLiteralDeclaration_2() { return cWEDNESDAYEnumLiteralDeclaration_2; }
		
		//"Wednesday"
		public Keyword getWEDNESDAYWednesdayKeyword_2_0() { return cWEDNESDAYWednesdayKeyword_2_0; }
		
		//THURSDAY="Thursday"
		public EnumLiteralDeclaration getTHURSDAYEnumLiteralDeclaration_3() { return cTHURSDAYEnumLiteralDeclaration_3; }
		
		//"Thursday"
		public Keyword getTHURSDAYThursdayKeyword_3_0() { return cTHURSDAYThursdayKeyword_3_0; }
		
		//FRIDAY="Friday"
		public EnumLiteralDeclaration getFRIDAYEnumLiteralDeclaration_4() { return cFRIDAYEnumLiteralDeclaration_4; }
		
		//"Friday"
		public Keyword getFRIDAYFridayKeyword_4_0() { return cFRIDAYFridayKeyword_4_0; }
		
		//SATURDAY="Saturday"
		public EnumLiteralDeclaration getSATURDAYEnumLiteralDeclaration_5() { return cSATURDAYEnumLiteralDeclaration_5; }
		
		//"Saturday"
		public Keyword getSATURDAYSaturdayKeyword_5_0() { return cSATURDAYSaturdayKeyword_5_0; }
		
		//SUNDAY="Sunday"
		public EnumLiteralDeclaration getSUNDAYEnumLiteralDeclaration_6() { return cSUNDAYEnumLiteralDeclaration_6; }
		
		//"Sunday"
		public Keyword getSUNDAYSundayKeyword_6_0() { return cSUNDAYSundayKeyword_6_0; }
	}
	
	private final ScheduleElements pSchedule;
	private final TrainScheduleElements pTrainSchedule;
	private final TimeDescriptionElements pTimeDescription;
	private final DateTimeElements pDateTime;
	private final TimeElements pTime;
	private final RouteElements pRoute;
	private final StartSpotElements pStartSpot;
	private final MiddleSpotElements pMiddleSpot;
	private final FinalSpotElements pFinalSpot;
	private final WeekDaysElements eWeekDays;
	private final TerminalRule tLETTER;
	private final TerminalRule tDIGIT;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final TerminalRule tSTRING;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public ScheduleGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pSchedule = new ScheduleElements();
		this.pTrainSchedule = new TrainScheduleElements();
		this.pTimeDescription = new TimeDescriptionElements();
		this.pDateTime = new DateTimeElements();
		this.pTime = new TimeElements();
		this.pRoute = new RouteElements();
		this.pStartSpot = new StartSpotElements();
		this.pMiddleSpot = new MiddleSpotElements();
		this.pFinalSpot = new FinalSpotElements();
		this.eWeekDays = new WeekDaysElements();
		this.tLETTER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.LETTER");
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.DIGIT");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.INT");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.STRING");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.mdse.pts.schedule.dsl.Schedule.WS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.mdse.pts.schedule.dsl.Schedule".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Schedule:
	//	"schedule" "for" network=[network::Network] "with" depots+=[depot::Depot] ("," depots+=[depot::Depot])* ":"
	//	trainSchedules+=TrainSchedule*;
	public ScheduleElements getScheduleAccess() {
		return pSchedule;
	}
	
	public ParserRule getScheduleRule() {
		return getScheduleAccess().getRule();
	}
	
	//TrainSchedule:
	//	"train" train=[depot::Train]
	//	"on" timeDescription=TimeDescription ":"
	//	route=Route;
	public TrainScheduleElements getTrainScheduleAccess() {
		return pTrainSchedule;
	}
	
	public ParserRule getTrainScheduleRule() {
		return getTrainScheduleAccess().getRule();
	}
	
	//TimeDescription:
	//	dateTimes+=DateTime (("," dateTimes+=DateTime)* "and" dateTimes+=DateTime)?;
	public TimeDescriptionElements getTimeDescriptionAccess() {
		return pTimeDescription;
	}
	
	public ParserRule getTimeDescriptionRule() {
		return getTimeDescriptionAccess().getRule();
	}
	
	//DateTime:
	//	weekday+=WeekDays ("," weekday+=WeekDays)*
	//	"at" time=Time;
	public DateTimeElements getDateTimeAccess() {
		return pDateTime;
	}
	
	public ParserRule getDateTimeRule() {
		return getDateTimeAccess().getRule();
	}
	
	//Time:
	//	hours=INT ":" minutes=INT;
	public TimeElements getTimeAccess() {
		return pTime;
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
	}
	
	//Route:
	//	spots+=StartSpot
	//	spots+=MiddleSpot*
	//	spots+=FinalSpot;
	public RouteElements getRouteAccess() {
		return pRoute;
	}
	
	public ParserRule getRouteRule() {
		return getRouteAccess().getRule();
	}
	
	//StartSpot Spot:
	//	"start" "at" station=[network::Station] ("on" "platform" platform=STRING)? ("drive" "via" leg=[network::Leg])?;
	public StartSpotElements getStartSpotAccess() {
		return pStartSpot;
	}
	
	public ParserRule getStartSpotRule() {
		return getStartSpotAccess().getRule();
	}
	
	//MiddleSpot Spot:
	//	"stop" "at" station=[network::Station] ("on" "platform" platform=STRING)?
	//	"for" waitingTime=INT "min" ("and" turnStation?="turn")? ("drive" "via" leg=[network::Leg])?;
	public MiddleSpotElements getMiddleSpotAccess() {
		return pMiddleSpot;
	}
	
	public ParserRule getMiddleSpotRule() {
		return getMiddleSpotAccess().getRule();
	}
	
	//FinalSpot Spot:
	//	"terminate" "at" station=[network::Station] ("on" "platform" platform=STRING)?;
	public FinalSpotElements getFinalSpotAccess() {
		return pFinalSpot;
	}
	
	public ParserRule getFinalSpotRule() {
		return getFinalSpotAccess().getRule();
	}
	
	//enum WeekDays:
	//	MONDAY="Monday" | TUESDAY="Tuesday" | WEDNESDAY="Wednesday" | THURSDAY="Thursday" |
	//	FRIDAY="Friday" | SATURDAY="Saturday" | SUNDAY="Sunday";
	public WeekDaysElements getWeekDaysAccess() {
		return eWeekDays;
	}
	
	public EnumRule getWeekDaysRule() {
		return getWeekDaysAccess().getRule();
	}
	
	//terminal fragment LETTER:
	//	'a'..'z' | 'A'..'Z';
	public TerminalRule getLETTERRule() {
		return tLETTER;
	}
	
	//terminal fragment DIGIT:
	//	'0'..'9';
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	}
	
	//terminal ID:
	//	'^'? ('_' | LETTER) ('_' | LETTER | DIGIT)*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt:
	//	DIGIT+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"';
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
}
