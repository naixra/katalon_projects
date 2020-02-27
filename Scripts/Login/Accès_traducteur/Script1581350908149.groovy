import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.configuration.RunConfiguration

import org.openqa.selenium.Capabilities
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.RemoteWebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import java.awt.*

KeywordLogger log = new KeywordLogger()


 Init
def testCase="C942"
GlobalVariable.testCase=testCase
String casePath = GlobalVariable.pathSuite + "/" + testCase
File directory = new File(casePath)
directory.mkdirs();
output = new File(casePath + '/runtest-output.txt')
GlobalVariable.runtest_info = new File(casePath + '/runtest-info.txt')

//---------
// STEP 1
//---------
// Actions
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.setText(findTestObject('Page_login/email_address'), 'john.citron@test.com')
WebUI.setEncryptedText(findTestObject('Page_login/Mdp'), 'yGr0tcfSKt6n/DLYoH4Z3Q==')
WebUI.click(findTestObject('Page_login/Bouton_login'))

// Expectations
WebUI.waitForPageLoad(10)
WebUI.delay(5)
//CustomKeywords.'kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot'(casePath + '/step1.png',135, 40, FailureHandling.OPTIONAL)
//result = ("Step 1 : Snapshot :"+testCase + '/step1.png')
//output.append(result)
WebUI.comment("ca marche")
