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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.typing.com/')

WebUI.click(findTestObject('Object Repository/typing.com/Page_Learn to Type  Free Typing Tut/a_Student Login'))

WebUI.setText(findTestObject('Object Repository/typing.com/Page_Log In - Typing.com/input_Username or Email_userna'), 'test')

WebUI.click(findTestObject('Object Repository/typing.com/Page_Log In - Typing.com/button_Next'))

WebUI.waitForElementClickable(findTestObject('typing.com/Page_Log In - Typing.com/input_Password_password'), 5)

WebUI.setEncryptedText(findTestObject('Object Repository/typing.com/Page_Log In - Typing.com/input_Password_password'), 
    'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/typing.com/Page_Log In - Typing.com/button_Next'))

WebUI.verifyElementVisible(findTestObject('typing.com/Page_Log In - Typing.com/p_Incorrect password'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

