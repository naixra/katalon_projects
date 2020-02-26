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
import java.io.File
KeywordLogger log = new KeywordLogger()

// Init
def testCase="C943"
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
WebUI.setText(findTestObject('Page_login/email_address'), 'claire.obscur@test.com')
WebUI.setEncryptedText(findTestObject('Page_login/Mdp'), '+/gwaW8KTeoibrDOC2zTrg==')
WebUI.click(findTestObject('Page_login/Bouton_login'))

// Expectations
result = WebUI.getText(findTestObject('Object Repository/Page_login/login_Message'))
output.append(result)
