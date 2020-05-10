package org.mdse.pts.timetable.edit;

import java.util.Set;

import org.mdse.pts.timetable.Timetable;

public class Main {
	public static void main(String[] args) {
		Set<Timetable> tt = org.mdse.pts.timetable.Main.makeTimetablesFromExampleSchedule();
		for (Timetable t : tt) {
			Timetable2HTML t2h = Timetable2HTML.create("");
			System.out.println(t2h.generate(t));
		}
	}

}
