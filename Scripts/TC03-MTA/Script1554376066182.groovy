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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.waitForJQueryLoad(5)

WebUI.click(findTestObject('TC03-MTA/PolicyRecord'))

WebUI.waitForJQueryLoad(5)

not_run: WebUI.setText(findTestObject('TC03-MTA/SearchFields'), GlobalVariable.PolicyNo_Global)

WebUI.setText(findTestObject('TC03-MTA/SearchFields'), MTA_PolicyNo)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC03-MTA/SearchFields'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('TC03-MTA/ClickEdit'))

WebUI.delay(2)

WebUI.click(findTestObject('TC03-MTA/MTA TAB'))

WebUI.waitForJQueryLoad(5)

WebUI.click(findTestObject('TC03-MTA/GO BUTTON'))

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('TC03-MTA/MTA Resons Type'), 'Reason Description MTA', false)

WebUI.setText(findTestObject('TC03-MTA/MTAReasonTextArea'), 'Only For Testing Purpose.')

WebUI.delay(5)

WebUI.click(findTestObject('TC03-MTA/MTAResonsSaveButton'))

WebUI.delay(4)

WebUI.click(findTestObject('TC03-MTA/EditRiskItemListing'))

WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/RiskDetails/Type'), 'Duplex', false)

WebUI.clearText(findTestObject('TC-CreatePolicy/RiskDetails/SumInsurreTextBox'))

WebUI.setText(findTestObject('TC-CreatePolicy/RiskDetails/SumInsurreTextBox'), '4000')

WebUI.clearText(findTestObject('TC-CreatePolicy/RiskDetails/RoomNo'))

WebUI.setText(findTestObject('TC-CreatePolicy/RiskDetails/RoomNo'), '2')

WebUI.clearText(findTestObject('TC-CreatePolicy/RiskDetails/ContentSumInsure'))

WebUI.setText(findTestObject('TC-CreatePolicy/RiskDetails/ContentSumInsure'), '2000')

WebUI.click(findTestObject('TC03-MTA/MTASaveButton'))

WebUI.waitForJQueryLoad(5)

WebUI.delay(5)

APRPValue = WebUI.getAttribute(findTestObject('TC03-MTA/APandRPValue'), 'value')

System.out.println(APRPValue)

not_run: WebUI.click(findTestObject('TC03-MTA/EmailQuoteButtonClick'))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('TC03-MTA/Complete'))

WebUI.delay(5)

WebUI.click(findTestObject('TC-CreatePolicy/PaymentDetails/PaymentMethods'))

WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/PaymentDetails/SelectNoOfInstallment'), '1', false)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC-CreatePolicy/PaymentDetails/ConfirmPaymentType'))

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('TC-CreatePolicy/PaymentDetails/EmailText'), 'dipak.das@mailinator.com')

WebUI.scrollToElement(findTestObject('TC03-MTA/SendEmail'), 5)

WebUI.delay(4)

WebUI.click(findTestObject('TC03-MTA/SendEmail'))

WebUI.delay(5)

log.logInfo(GlobalVariable.PolicyNo_Global)

