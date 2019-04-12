import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://dev.offshoresoftwaresolutions.net/markit_coreV2/Sites/CoreTest/login/admin_display')

WebUI.setText(findTestObject('Object Repository/TC-LoginApplication/Page_Markit core new  Login/input_Login to your account_username'), 
    'dDasTester')

WebUI.setText(findTestObject('Object Repository/TC-LoginApplication/Page_Markit core new  Login/input_Login to your account_password'), 
    'Czybm6R*')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/TC-LoginApplication/Page_Markit core new  Login/button_Login'))

not_run: KeywordLogger log = new KeywordLogger()

not_run: log.logInfo(“Dipak”)

