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
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.click(findTestObject('TC03-MTA/PolicyRecord'))

WebUI.setText(findTestObject('TC03-MTA/SearchFields'), Doc_PolicyNo)

WebUI.sendKeys(findTestObject('TC03-MTA/SearchFields'), Keys.chord(Keys.ENTER))

WebUI.delay(6)

WebUI.click(findTestObject('TC03-MTA/ClickEdit'))

WebUI.delay(4)

WebUI.click(findTestObject('TC06-Document/Documents'))

WebUI.waitForJQueryLoad(5)

WebUI.click(findTestObject('TC06-Document/ADDDocument'))

WebUI.delay(4)

WebUI.setText(findTestObject('TC06-Document/DocumentName'), 'Automation Testing Document Upload')

WebUI.click(findTestObject('TC06-Document/DocumentPath'))

WebUI.uploadFile(findTestObject('TC06-Document/DocumentPath'), 'C:\\Users\\dipak\\Documents\\Testing Doc\\VAT_Teting_DocVer.pdf')

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('TC06-Document/Type'), 'Letters', false)

WebUI.click(findTestObject('TC06-Document/Upload'))

WebUI.delay(5)

