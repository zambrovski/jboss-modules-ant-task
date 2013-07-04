package com.osi.ant.types;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.junit.Test;

/**
 * Test for JBoss Module.
 * 
 * @author Simon Zambrovski
 * 
 */
public class JBossModuleTest {

	@Test
	public void shouldParseModuleString() {
		String moduleList = "de\\holisticon\\other\\main;de\\holisticon\\simple\\1.0;de\\holisticon\\simple\\main";
		List<JBossModuleDependency> parseDependencies = JBossModule.parseDependencies(moduleList, File.pathSeparator);
		assertEquals(3, parseDependencies.size());
	}
}
