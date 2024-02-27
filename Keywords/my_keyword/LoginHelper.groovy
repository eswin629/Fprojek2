package my_keyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginHelper {
	@Keyword
	def login() {
		def testData = findTestData('Data Files/LoginData')
		def userName = testData.getObjectValue('Username', 1)
		def password = testData.getObjectValue('Password', 1)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Demo App by Applitools/label_Username'), 0)


		//Call test case using WebUI Class
		WebUI.callTestCase(findTestCase("Test Case ID"), [("Username"):userName], FailureHandling.OPTIONAL)


		//		WebUI.setText(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Username_username'), userName)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Demo App by Applitools/label_Password'), 0)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Password_password'), password)

		WebUI.click(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Remember Me_form-check-input'))

		WebUI.click(findTestObject('Object Repository/Page_ACME Demo App by Applitools/a_Sign in'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME demo app/div_Jack Gomez                             _a718da'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME demo app/div_Add AccountMake Payment                _8c7c14'),
				0)
	}
}
