/*
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mdse.pts.schedule.Schedule

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ScheduleGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//TODO: Generate
		var schedule = resource.contents.get(0) as Schedule;
		//TODO: Use interpreter
		//TODO: Add timetables to HTML files
	}
}
