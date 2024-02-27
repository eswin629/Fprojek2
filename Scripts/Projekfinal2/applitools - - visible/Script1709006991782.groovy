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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Projekfinal2/applitools - LoginCalltest'), [('Username_username') : 'win123', ('Password_password') : 'ZQGcCapffVE='], 
    FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'my_keyword.LoginHelper.login'()
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Demo App by Applitools/label_Username'), 0)
//
////WebUI.setText(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Username_username'), userName)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Demo App by Applitools/label_Password'), 0)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Password_password'), password)
//
//WebUI.click(findTestObject('Object Repository/Page_ACME Demo App by Applitools/input_Remember Me_form-check-input'))
//
//WebUI.click(findTestObject('Object Repository/Page_ACME Demo App by Applitools/a_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME demo app/div_Jack Gomez                             _a718da'),
	0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME demo app/div_Add AccountMake Payment                _8c7c14'),
	0)

	WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ACME demo app/a_Add Account'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ACME demo app/a_Make Payment'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ACME demo app/h6_Financial Overview'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ACME demo app/h6_Recent Transactions'))
	

//if(notCheck == true) {
//	WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ACME demo app/a_Add Account'))
////	WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_ACME demo app/a_Add Account'))
//	WebUI.verifyElementVisible(findTestObject('Object Repository/Page_ACME demo app/a_Make Payment'))
////	WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_ACME demo app/a_Make Payment'))
//}

WebUI.closeBrowser()
