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

WebUI.openBrowser('https://cqsystem.fionaprodev.com/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_page/login_email'), 'temp.vothihanh@gmail.com')

WebUI.setText(findTestObject('Login_page/login_password'), '12345678')

WebUI.click(findTestObject('Login_page/checkbox_remember'))

WebUI.click(findTestObject('Login_page/button_DangNhap'))

WebUI.delay(2)

WebUI.click(findTestObject('ThongtinNhanVien_page/button_dkTNHD'))

WebUI.click(findTestObject('ThongtinNhanVien_page/link_dk-TNHD'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_main-VU'), '4', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_main-BAN'), '13', true)

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_main-ViTri'), '6', true)

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/buttondata_hasKiemNhiem'))

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.click(findTestObject('DK_TNHD_page/button_add-KiemNhiem'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_sub_VU_475321_1'), '5', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_sub_ViTri_593b8e_1'), '7', true)

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_sub_BAN_82ec2e'), '17', true)

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/button_sub-Xoa'))

WebUI.delay(2)

WebUI.click(findTestObject('DK_TNHD_page/button_add-KiemNhiem'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_sub_VU_475321_1'), '5', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_sub_BAN_82ec2e'), '18', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('DK_TNHD_page/select_sub_ViTri_593b8e_1'), '7', true)

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(3)

WebUI.waitForPageLoad(3)

WebUI.waitForElementPresent(findTestObject('DK_TNHD_page/inputdata_dkTNHD_noisinh'), 3)

WebUI.setText(findTestObject('DK_TNHD_page/inputdata_dkTNHD_noisinh'), 'Bến Tre')

WebUI.delay(1)

WebUI.setText(findTestObject('DK_TNHD_page/inputdata_dkTNHD_diachi'), 'Tân Phú, TP.HCM')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/inputdata_dkTNHD_diachi'), 0)

WebUI.setText(findTestObject('DK_TNHD_page/inputdata_dkTNHD_ngaynhapmon'), 'năm 2000')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/inputdata_dkTNHD_traikyhientai_tunam'), 3)

WebUI.click(findTestObject('DK_TNHD_page/inputdata_dkTNHD_trinhdohocvan'))

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/inputdata_dkTNHD_kynangtinhoc'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'), 3)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/inputdata_dkTNHD_noisinh'), 3)

WebUI.setText(findTestObject('DK_TNHD_page/inputdata_dkTNHD_phone'), '90909')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/inputdata_dkTNHD_diachi'), 3)

WebUI.setText(findTestObject('DK_TNHD_page/inputdata_dkTNHD_noinhapmon'), 'TT Bến Tre')

WebUI.delay(1)

WebUI.click(findTestObject('DK_TNHD_page/inputdata_dkTNHD_traikyhientai'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/inputdata_dkTNHD_noinhapmon'), 3)

WebUI.setText(findTestObject('DK_TNHD_page/inputdata_dkTNHD_traikyhientai_tunam'), '2010')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'), 3)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/inputdata_dkTNHD_noisinh'), 3)

WebUI.setText(findTestObject('DK_TNHD_page/inputdata_dkTNHD_phone'), '0996669029')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'), 3)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.waitForPageLoad(3)

WebUI.waitForElementPresent(findTestObject('DK_TNHD_page/button_dkTNHD_KyNang'), 3)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/button_dk-TNHD_QuayLai'), 3)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_QuayLai'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'), 3)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.waitForPageLoad(3)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/button_dkTNHD_KyNang'), 3)

WebUI.click(findTestObject('DK_TNHD_page/button_dkTNHD_KyNang'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'), 3)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.click(findTestObject('DK_TNHD_page/button_dk-TNHD_DangKy'))

WebUI.delay(50)

WebUI.navigateToUrl('https://cqsystem.fionaprodev.com/')

