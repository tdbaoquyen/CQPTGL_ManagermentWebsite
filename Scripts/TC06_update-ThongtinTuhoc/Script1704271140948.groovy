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

WebUI.click(findTestObject('HosoCanhan_page/a_ThongtinTuhoc'))

WebUI.delay(2)

WebUI.clearText(findTestObject('HosoCanhan_page/input_ngaynhapmon'))

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_ngaynhapmon'), 'năm 2000')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HosoCanhan_page/input_BoiDuongGiaoLy-Cap1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/HosoCanhan_page/input_traiky-ThapTrai'))

WebUI.delay(1)

WebUI.clearText(findTestObject('HosoCanhan_page/input_traikyhientai_tunam'))

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_traikyhientai_tunam'), '2010')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HosoCanhan_page/button_ThemTraiKy'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('HosoCanhan_page/button_LuuThayDoi'), 0)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('HosoCanhan_page/input_traiky-ThapTrai'), 2)

WebUI.clearText(findTestObject('HosoCanhan_page/input_traikyhientai_tunam'))

WebUI.setText(findTestObject('Object Repository/HosoCanhan_page/input_traikyhientai_tunam'), '2020')

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_XoaBo'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/HosoCanhan_page/button_XacNhan'))

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/a_ThongtinTuhoc'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('HosoCanhan_page/input_traiky-ThapTrai'), 2)

WebUI.delay(2)

WebUI.refresh()

