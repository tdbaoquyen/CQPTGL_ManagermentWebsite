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

WebUI.enableSmartWait()

WebUI.setText(findTestObject('Login_page/login_email'), 'lekhanhhcmvn@hotmail.com')

WebUI.setText(findTestObject('Login_page/login_password'), '12345678')

WebUI.click(findTestObject('Login_page/checkbox_remember'))

WebUI.click(findTestObject('Login_page/button_DangNhap'))

WebUI.delay(2)

WebUI.click(findTestObject('Account_menu/img_user-avatar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account_menu/button_DangXuat'))

WebUI.delay(1)

WebUI.setText(findTestObject('Login_page/login_email'), 'chithat1964@gmail.com')

WebUI.setText(findTestObject('Login_page/login_password'), '12345678')

WebUI.click(findTestObject('Login_page/checkbox_remember'))

WebUI.click(findTestObject('Login_page/button_DangNhap'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/a_QuanLyVu'))

WebUI.click(findTestObject('ThongtinNhanVien_page/a_manager-QuanLyBan'))

WebUI.delay(2)

WebUI.click(findTestObject('Account_menu/img_user-avatar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account_menu/button_DangXuat'))

WebUI.delay(2)

WebUI.setText(findTestObject('Login_page/login_email'), 'azalea@gmail.com')

WebUI.setText(findTestObject('Login_page/login_password'), 'abc12345')

WebUI.click(findTestObject('Login_page/checkbox_remember'))

WebUI.click(findTestObject('Login_page/button_DangNhap'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/a_QuanLyVu'))

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/a_NhanVienNamX'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/a_QuanLyVu'))

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/a_NhanVienHangNam'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/a_QuanLyVu'))

WebUI.click(findTestObject('Object Repository/ThongtinNhanVien_page/a_admin-QuanLyBan'))

WebUI.delay(2)

WebUI.click(findTestObject('Account_menu/img_user-avatar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Account_menu/button_DangXuat'))

WebUI.delay(1)

WebUI.closeBrowser()

