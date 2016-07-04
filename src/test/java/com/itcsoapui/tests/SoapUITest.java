package com.itcsoapui.tests;

import org.testng.annotations.Test;

import com.eviware.soapui.SoapUIProTestCaseRunner;

public class SoapUITest {

	@Test
	public void run() throws Exception {

		SoapUIProTestCaseRunner runner = new SoapUIProTestCaseRunner();
		runner.setProjectFile("../itcsoapui/src/test/resources/TestSuite/ZAP-mail-project-soapui-project.xml");
		runner.setPrintReport(true);
		runner.setJUnitReport(true);
		runner.setExportAll(true);
		runner.setOutputFolder("target/reports");
		runner.setIgnoreError(true);
		runner.run();
	}
}
