package org.mdse.pts.timetable;

import java.util.Comparator;

import shared.Time;

public class DateTimeComparator implements Comparator<DateTime> {
	@Override
	public int compare(DateTime o1, DateTime o2) {
		// TODO Auto-generated method stub
		if (o1.getDay() == o2.getDay()) {
			Time t1 = o1.getTime();
			Time t2 = o2.getTime();
			if (t2.getHours() == t2.getHours()) {
				return t1.getMinutes().compareTo(t2.getMinutes());
			}
			return t1.getHours().compareTo(t2.getHours());
		}
		return o1.getDay().compareTo(o2.getDay());
	}

}
