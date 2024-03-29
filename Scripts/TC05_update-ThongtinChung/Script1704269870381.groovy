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

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/HosoCanhan_page/a_ThongtinChung'))

WebUI.delay(2)

WebUI.clearText(findTestObject('HosoCanhan_page/input_name'))

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_name'), 'Bảo Quyên')

WebUI.delay(2)

WebUI.clearText(findTestObject('HosoCanhan_page/input_noisinh'))

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_noisinh'), 'TP. Hồ Chí Minh')

WebUI.delay(1)

WebUI.clearText(findTestObject('HosoCanhan_page/input_phone'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_phone'), '12345')

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(2)

WebUI.clearText(findTestObject('HosoCanhan_page/input_phone'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_phone'), '1234554321')

WebUI.delay(1)

WebUI.clearText(findTestObject('HosoCanhan_page/input_diachi'))

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_diachi'), 'Q. Bình Thạnh')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(2)

