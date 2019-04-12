package com.login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginStep {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to the Login Page")
	def InavigatetoLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.offshoresoftwaresolutions.net/markit_coreV2/Sites/CoreTest/login/admin_display')
		WebUI.maximizeWindow()
	}

	@When('I enter user name as "(.*)" and password as "(.*)"')
	def I_Enter_username_password(String username,String password) {
		WebUI.setText(findTestObject('Object Repository/TC-LoginApplication/Page_Markit core new  Login/input_Login to your account_username'),
				username)

		WebUI.setText(findTestObject('Object Repository/TC-LoginApplication/Page_Markit core new  Login/input_Login to your account_password'),
				password)
	}

	@Then("I click the Login Button")
	def I_click_Login_Button() {
		
		WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/TC-LoginApplication/Page_Markit core new  Login/button_Login'))
	}
	@Then("I Should see the homePage")
	def I_should_see_the_homepage(){
	}
}