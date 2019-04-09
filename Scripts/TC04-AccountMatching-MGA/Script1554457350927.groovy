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

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('TC04-AccountMatching-MGA/AccountManagement'), 5)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/AccountManagement'))

WebUI.delay(3)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/AccountMatchingLink'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('TC04-AccountMatching-MGA/EntityType'), 'MGA', false)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC04-AccountMatching-MGA/Entity'), 'NEW MGA', false)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/ClickGoButton'))

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('TC04-AccountMatching-MGA/SelectAccount'), 'ComissionOnly -- Allocated -- NEW MGA CommAccount -- USD', 
    false)

WebUI.delay(5)

WebUI.setText(findTestObject('TC04-AccountMatching-MGA/Acc_Matching_PolicyNo_TextBox'), MTA_Policy_No)

WebUI.sendKeys(findTestObject('TC04-AccountMatching-MGA/Acc_Matching_PolicyNo_TextBox'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

