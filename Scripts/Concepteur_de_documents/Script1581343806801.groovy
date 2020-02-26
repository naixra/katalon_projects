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

def testCase="Cxxx"

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Page_login/email_address'), 'dom.hinault@test.com')

WebUI.setEncryptedText(findTestObject('Page_login/Mdp'), 'M29s0YFanbtV44BEnXcPFA==')

WebUI.click(findTestObject('Page_login/Bouton_login'))

WebUI.waitForPageLoad(10)

WebUI.navigateToUrl('https://v2.immo-facile.com/catalog/admin-v2/home.php?add_tab=docgenerator.php')
WebUI.waitForPageLoad(10)
WebUI.delay(5)



// Expectations
WebUI.takeScreenshot(GlobalVariable.OUTPUT_PATH + testCase + '/step1.png')

