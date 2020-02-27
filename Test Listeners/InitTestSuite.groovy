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

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

class InitTestSuite {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
		String TestSuiteId = testSuiteContext.getTestSuiteId()
		GlobalVariable.testSuiteName = TestSuiteId.substring((TestSuiteId.lastIndexOf("/").toInteger()) + 1)
		// Retrieve environment
		GlobalVariable.HostName = RunConfiguration.getHostName()
		GlobalVariable.OS = RunConfiguration.getOS()
		GlobalVariable.driver = DriverFactory.getExecutedBrowser().getName()
		Date today = new Date()
		//formattedDate = mydate.format("MMddyyy")
		//dateHour = mydate.format("HHmmss")
		String todaysDate = today.format("ddMMyyy")
		String todaysHour = today.format("HHmmss")
		GlobalVariable.ExecutionDirectory = todaysDate+"-"+todaysHour+"/"
		//String pathRun = System.getenv('AUTOTESTS_HOME') + System.getenv('AUTOTESTS_BASELINE')+"-"+todaysDate
		String pathRun = "/test/" + "/Results/" + "/base/"
		File directory = new File(pathRun)
		directory.mkdirs();
		GlobalVariable.pathSuite = pathRun + "/" + GlobalVariable.driver + "/" + GlobalVariable.Reseau
		File directorySuite = new File(GlobalVariable.pathSuite)
		directorySuite.mkdirs();
		GlobalVariable.TestSuite_Info = new File(pathRun + "/" + GlobalVariable.testSuiteName + "_Info.txt")
		GlobalVariable.TestSuite_Info.append(GlobalVariable.testSuiteName)
		GlobalVariable.TestSuite_Info.append(";"+GlobalVariable.ExecutionDirectory)
		GlobalVariable.TestSuite_Info.append(";"+GlobalVariable.Reseau)
		GlobalVariable.TestSuite_Info.append(";"+GlobalVariable.OS)
		GlobalVariable.TestSuite_Info.append(";"+GlobalVariable.HostName)
		GlobalVariable.TestSuite_Info.append(";"+GlobalVariable.driver+"\n")
		GlobalVariable.TestSuite_TC = new File(pathRun + "/" + GlobalVariable.testSuiteName + "_ListeTC.txt")
	}
}
