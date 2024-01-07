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

WebUI.openBrowser('https://cqsystem.fionaprodev.com/login')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login_page/login_email'), 'temp.tranngoctam@gmail.com')

WebUI.setText(findTestObject('Login_page/login_password'), '12345678')

WebUI.click(findTestObject('Login_page/checkbox_remember'))

WebUI.click(findTestObject('Login_page/button_DangNhap'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/button_dkTNHD'))

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/link_dk-TNHD'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Taking New Mission/select_main-VU'), 
    '4', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Taking New Mission/select_main-BAN'), 
    '13', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Taking New Mission/select_main-ViTri'), 
    '6', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/buttondata_hasKiemNhiem'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_add-KiemNhiem'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Taking New Mission/select_sub-VU'), '5', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Taking New Mission/select_sub-BAN'), '7', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Taking New Mission/select_sub-VITRI'), '18', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_add-KiemNhiem'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_sub-Xoa'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_noisinh'), 
    'Bến Tre')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_diachi'), 
    'Q. Tân Phú, TP. HCM')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_ngaynhapmon'), 
    'năm 2000')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_trinhdohocvan'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_phone'), 
    3)

WebUI.setText(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_phone'), 
    '90909')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_noinhapmon'), 
    'TT Bến Tre')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_traikyhientai'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_kynangtinhoc'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_traikyhientai_tunam'), 
    3)

WebUI.setText(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_traikyhientai_tunam'), 
    '2010')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_phone'), 
    3)

WebUI.setText(findTestObject('Object Repository/DK_TNHD_page/inputdata_dkTNHD_phone'), 
    '9090909090')

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_QuayLai'))

WebUI.scrollToElement(findTestObject('Object Repository/DK_TNHD_page/button_dkTNHD_KyNang'), 
    3)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dkTNHD_KyNang'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_TiepTuc'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/DK_TNHD_page/button_dk-TNHD_DangKy'))

WebUI.closeBrowser()

