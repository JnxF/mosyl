/*
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mdse.pts.schedule.Schedule
import org.mdse.pts.timetable.ScheduleTransformation
import org.mdse.pts.timetable.edit.Timetable2HTML

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ScheduleGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		System.out.println("Does it generate?")
		var schedule = resource.contents.get(0) as Schedule;
		var timetables = ScheduleTransformation.staticScheduleToTimetables(schedule);
		var timetable2html = Timetable2HTML.create("");
		for (timetable : timetables) {
			var name = timetable.getStationName();
			var htmlString = timetable2html.generate(timetable);
			fsa.generateFile("../../Runtime/PTSFiles/timetables/" + name + ".html", htmlString);
		}
	}
}
