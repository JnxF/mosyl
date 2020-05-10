package org.mdse.pts.timetable;

import java.util.Comparator;

public class StationTrainComparator implements Comparator<StationTrain> {
	boolean arrival;
	public StationTrainComparator(boolean arrival) {
		this.arrival = arrival;
	}
	
	@Override
	public int compare(StationTrain o1, StationTrain o2) {
		DateTimeComparator dtc = new DateTimeComparator();
		if (arrival) {
			return dtc.compare(o1.getArrival().getArrDepTime(), o2.getArrival().getArrDepTime());
		}
		return dtc.compare(o1.getDeparture().getArrDepTime(), o2.getDeparture().getArrDepTime());
	}
	
}
