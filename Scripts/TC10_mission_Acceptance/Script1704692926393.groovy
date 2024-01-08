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

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Danh sch Nhn vin C Quan - H thng ni b _31750c/button_Notification'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Danh sch Nhn vin C Quan - H thng ni b _31750c/a_Xem'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_Taking New Mission - H thng ni b C Quan PTGL/button_MOTHONGBAO'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Taking New Mission - H thng ni b C Quan PTGL/button_DaDOC'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Taking New Mission - H thng ni b C Quan PTGL/button_DONG'))

WebUI.delay(3)

WebUI.click(findTestObject('Account_menu/img_user-avatar'))

WebUI.click(findTestObject('Account_menu/button_DangXuat'))

WebUI.delay(2)

WebUI.closeBrowser()

