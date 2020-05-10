/*
 * generated by Xtext 2.21.0
 */
package org.mdse.pts.schedule.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.mdse.pts.schedule.dsl.ide.contentassist.antlr.internal.InternalScheduleParser;
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;

public class ScheduleParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ScheduleGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ScheduleGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getWeekDayAccess().getAlternatives(), "rule__WeekDay__Alternatives");
			builder.put(grammarAccess.getScheduleAccess().getGroup(), "rule__Schedule__Group__0");
			builder.put(grammarAccess.getScheduleAccess().getGroup_5(), "rule__Schedule__Group_5__0");
			builder.put(grammarAccess.getTrainScheduleAccess().getGroup(), "rule__TrainSchedule__Group__0");
			builder.put(grammarAccess.getTimeDescriptionAccess().getGroup(), "rule__TimeDescription__Group__0");
			builder.put(grammarAccess.getTimeDescriptionAccess().getGroup_1(), "rule__TimeDescription__Group_1__0");
			builder.put(grammarAccess.getTimeDescriptionAccess().getGroup_1_0(), "rule__TimeDescription__Group_1_0__0");
			builder.put(grammarAccess.getDateTimeAccess().getGroup(), "rule__DateTime__Group__0");
			builder.put(grammarAccess.getDateTimeAccess().getGroup_1(), "rule__DateTime__Group_1__0");
			builder.put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
			builder.put(grammarAccess.getRouteAccess().getGroup(), "rule__Route__Group__0");
			builder.put(grammarAccess.getStartSpotAccess().getGroup(), "rule__StartSpot__Group__0");
			builder.put(grammarAccess.getStartSpotAccess().getGroup_3(), "rule__StartSpot__Group_3__0");
			builder.put(grammarAccess.getStartSpotAccess().getGroup_4(), "rule__StartSpot__Group_4__0");
			builder.put(grammarAccess.getMiddleSpotAccess().getGroup(), "rule__MiddleSpot__Group__0");
			builder.put(grammarAccess.getMiddleSpotAccess().getGroup_3(), "rule__MiddleSpot__Group_3__0");
			builder.put(grammarAccess.getMiddleSpotAccess().getGroup_7(), "rule__MiddleSpot__Group_7__0");
			builder.put(grammarAccess.getMiddleSpotAccess().getGroup_8(), "rule__MiddleSpot__Group_8__0");
			builder.put(grammarAccess.getFinalSpotAccess().getGroup(), "rule__FinalSpot__Group__0");
			builder.put(grammarAccess.getFinalSpotAccess().getGroup_3(), "rule__FinalSpot__Group_3__0");
			builder.put(grammarAccess.getScheduleAccess().getNetworkAssignment_2(), "rule__Schedule__NetworkAssignment_2");
			builder.put(grammarAccess.getScheduleAccess().getDepotsAssignment_4(), "rule__Schedule__DepotsAssignment_4");
			builder.put(grammarAccess.getScheduleAccess().getDepotsAssignment_5_1(), "rule__Schedule__DepotsAssignment_5_1");
			builder.put(grammarAccess.getScheduleAccess().getTrainSchedulesAssignment_7(), "rule__Schedule__TrainSchedulesAssignment_7");
			builder.put(grammarAccess.getTrainScheduleAccess().getTrainAssignment_1(), "rule__TrainSchedule__TrainAssignment_1");
			builder.put(grammarAccess.getTrainScheduleAccess().getTimeDescriptionAssignment_3(), "rule__TrainSchedule__TimeDescriptionAssignment_3");
			builder.put(grammarAccess.getTrainScheduleAccess().getRouteAssignment_5(), "rule__TrainSchedule__RouteAssignment_5");
			builder.put(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_0(), "rule__TimeDescription__DateTimesAssignment_0");
			builder.put(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_1_0_1(), "rule__TimeDescription__DateTimesAssignment_1_0_1");
			builder.put(grammarAccess.getTimeDescriptionAccess().getDateTimesAssignment_1_2(), "rule__TimeDescription__DateTimesAssignment_1_2");
			builder.put(grammarAccess.getDateTimeAccess().getWeekdaysAssignment_0(), "rule__DateTime__WeekdaysAssignment_0");
			builder.put(grammarAccess.getDateTimeAccess().getWeekdaysAssignment_1_1(), "rule__DateTime__WeekdaysAssignment_1_1");
			builder.put(grammarAccess.getDateTimeAccess().getTimeAssignment_3(), "rule__DateTime__TimeAssignment_3");
			builder.put(grammarAccess.getTimeAccess().getHoursAssignment_0(), "rule__Time__HoursAssignment_0");
			builder.put(grammarAccess.getTimeAccess().getMinutesAssignment_2(), "rule__Time__MinutesAssignment_2");
			builder.put(grammarAccess.getRouteAccess().getSpotsAssignment_0(), "rule__Route__SpotsAssignment_0");
			builder.put(grammarAccess.getRouteAccess().getSpotsAssignment_1(), "rule__Route__SpotsAssignment_1");
			builder.put(grammarAccess.getRouteAccess().getSpotsAssignment_2(), "rule__Route__SpotsAssignment_2");
			builder.put(grammarAccess.getStartSpotAccess().getStationAssignment_2(), "rule__StartSpot__StationAssignment_2");
			builder.put(grammarAccess.getStartSpotAccess().getPlatformAssignment_3_2(), "rule__StartSpot__PlatformAssignment_3_2");
			builder.put(grammarAccess.getStartSpotAccess().getLegAssignment_4_2(), "rule__StartSpot__LegAssignment_4_2");
			builder.put(grammarAccess.getMiddleSpotAccess().getStationAssignment_2(), "rule__MiddleSpot__StationAssignment_2");
			builder.put(grammarAccess.getMiddleSpotAccess().getPlatformAssignment_3_2(), "rule__MiddleSpot__PlatformAssignment_3_2");
			builder.put(grammarAccess.getMiddleSpotAccess().getWaitingTimeAssignment_5(), "rule__MiddleSpot__WaitingTimeAssignment_5");
			builder.put(grammarAccess.getMiddleSpotAccess().getTurnStationAssignment_7_1(), "rule__MiddleSpot__TurnStationAssignment_7_1");
			builder.put(grammarAccess.getMiddleSpotAccess().getLegAssignment_8_2(), "rule__MiddleSpot__LegAssignment_8_2");
			builder.put(grammarAccess.getFinalSpotAccess().getStationAssignment_2(), "rule__FinalSpot__StationAssignment_2");
			builder.put(grammarAccess.getFinalSpotAccess().getPlatformAssignment_3_2(), "rule__FinalSpot__PlatformAssignment_3_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ScheduleGrammarAccess grammarAccess;

	@Override
	protected InternalScheduleParser createParser() {
		InternalScheduleParser result = new InternalScheduleParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ScheduleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ScheduleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
