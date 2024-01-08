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

WebUI.click(findTestObject('HosoCanhan_page/a_ThongtinGiadinh'))

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_AddFamiliar'))

WebUI.waitForElementVisible(findTestObject('HosoCanhan_page/button_Ngi thn hin l nhn vin C Quan_data.userfamiliar.9e8fe47a-4f77-4799-a0a3-84ca0c648b8c.is_cq_staff'), 
    2)

WebUI.click(findTestObject('HosoCanhan_page/button_Ngi thn hin l nhn vin C Quan_data.userfamiliar.9e8fe47a-4f77-4799-a0a3-84ca0c648b8c.is_cq_staff'))

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/div_MoiQuanHe'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('HosoCanhan_page/div_ChaMAnh traiCh giEm traiEm gi'), 2)

WebUI.delay(3)

WebUI.click(findTestObject('HosoCanhan_page/div_Me'))

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/div_TimKiemtudsNhanVien'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('HosoCanhan_page/timkiemNV_nhapTen'), 'Xuân Mai')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('HosoCanhan_page/timkiemNV_nhapTen'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('HosoCanhan_page/button_LuuThayDoi'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(4)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/a_ThongtinGiadinh'))

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_AddFamiliar'))

WebUI.delay(2)

WebUI.delay(1)

WebUI.setText(findTestObject('Page_HosoCaNhan/input__data.userfamiliar_hoten'), 'Trần Ngọc Sỹ')

WebUI.delay(2)

WebUI.click(findTestObject('Page_HosoCaNhan/div_chonMoiQuanHe'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Page_HosoCaNhan/div_downListChaMeAnhChiEm'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Page_HosoCaNhan/div_Cha'))

WebUI.click(findTestObject('Page_HosoCaNhan/input__data.userfamiliar_Ngaysinh'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_HosoCaNhan/select_thng 1thng 2thng 3thng 4thng 5thng 6thng 7thng 8thng 9thng 10thng 11thng 12'), 
    '9', true)

WebUI.delay(1)

WebUI.clearText(findTestObject('Page_HosoCaNhan/input__w-16 border-none bg-transparent p-0 text-right text-sm text-gray-950 focusring-0 darktext-white'))

WebUI.setText(findTestObject('Page_HosoCaNhan/input__w-16 border-none bg-transparent p-0 text-right text-sm text-gray-950 focusring-0 darktext-white'), 
    '1960')

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Page_HosoCaNhan/div_birthday-Days'), 3)

WebUI.click(findTestObject('Page_HosoCaNhan/div_userfamiliar_birthday-4'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_HosoCaNhan/input__data.userfamiliar_Phone'), 2)

WebUI.setText(findTestObject('Page_HosoCaNhan/input_data.userfamiliar_Diachi'), 'Quan 7, TP.HCM')

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_HosoCaNhan/input__data.userfamiliar_Phone'), '12345')

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Page_HosoCaNhan/input__data.userfamiliar_Phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_HosoCaNhan/input__data.userfamiliar_Phone'), '0912903332')

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/a_ThongtinGiadinh'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_HosoCaNhan/button_userfamiliar_Xoa'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_HosoCaNhan/button_userfamiliar_XacNhan'))

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/button_LuuThayDoi'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('HosoCanhan_page/a_ThongtinGiadinh'))

WebUI.delay(2)

WebUI.closeBrowser()

