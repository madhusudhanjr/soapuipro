package com.itcsoapui.tests;

import org.testng.annotations.Test;

import com.eviware.soapui.SoapUIProTestCaseRunner;

public class SoapUITest {

	@Test
	public void run() throws Exception {

		System.out.println("START OF TESTCASE:: ZAP MAIL SERVICE TEST");

		SoapUIProTestCaseRunner runner = new SoapUIProTestCaseRunner();
		runner.setProjectFile("/src/test/resources/TestSuite/ZAP-mail-project-soapui-project.xml");
		runner.setPrintReport(true);
		runner.setJUnitReport(true);
		runner.setExportAll(true);
		runner.setOutputFolder("target/reports");
		runner.setIgnoreError(true);
		runner.run();

		System.out.println("END OF TESTCASE:: ZAP MAIL SERVICE TEST");
	}
}
