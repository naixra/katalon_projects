import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger


class End {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseStatus()
		GlobalVariable.runtest_info.append(GlobalVariable.testCaseName)
		GlobalVariable.runtest_info.append("\n"+GlobalVariable.testCase)
		// Test duration
		int endTime = System.currentTimeMillis()
		int RunTime =  endTime - GlobalVariable.startTime
		GlobalVariable.runtest_info.append("\nTest duration : "+(RunTime)/1000)
		GlobalVariable.driverVersion = DriverFactory.getBrowserVersion(DriverFactory.getWebDriver())
		GlobalVariable.runtest_info.append("\n"+GlobalVariable.driverVersion+"\n")
		WebUI.closeBrowser()
		GlobalVariable.TestSuite_TC.append(GlobalVariable.testCaseName)
		GlobalVariable.TestSuite_TC.append(";"+GlobalVariable.testCase)
		GlobalVariable.TestSuite_TC.append(";"+GlobalVariable.Reseau)
		GlobalVariable.TestSuite_TC.append(";"+GlobalVariable.driverVersion.substring(0,7)+"\n")
	}
}