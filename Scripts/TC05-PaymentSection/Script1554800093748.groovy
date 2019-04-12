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

WebUI.scrollToElement(findTestObject('TC05-PaymentSection/Payments'), 3)

WebUI.click(findTestObject('TC05-PaymentSection/Payments'))

WebUI.delay(5)

WebUI.click(findTestObject('TC05-PaymentSection/Cash and Cheque Payments'))

WebUI.delay(5)

WebUI.setText(findTestObject('TC05-PaymentSection/PolicyNoSearchBox'), Policy_No_Search)

WebUI.sendKeys(findTestObject('TC05-PaymentSection/PolicyNoSearchBox'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('TC05-PaymentSection/EditPaymentListing'))

WebUI.setText(findTestObject('TC05-PaymentSection/Note'), 'This is Testing Only')

WebUI.selectOptionByLabel(findTestObject('TC05-PaymentSection/TransactionStatus'), 'Paid', false)

WebUI.click(findTestObject('TC05-PaymentSection/SaveButton'))

WebUI.delay(5)

