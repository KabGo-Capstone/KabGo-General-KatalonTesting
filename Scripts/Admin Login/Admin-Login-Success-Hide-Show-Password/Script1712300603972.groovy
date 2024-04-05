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

//WebUI.acceptAlert()
// Mở trình duyệt và truy cập vào URL đã cho
WebUI.openBrowser('https://admin-panel.kabgo.mtech.id.vn')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Admin_Login_Page/input_EmailAddress'), 'giahuy200203@gmail.com')

WebUI.setText(findTestObject('Admin_Login_Page/input_Password'), 'aB123789#')

// Test Hide Password
password = WebUI.getText(findTestObject('Admin_Login_Page/input_Password'))
WebUI.verifyEqual(password, '')

// Test Show Password
WebUI.click(findTestObject('Admin_Login_Page/button_ShowPassword'))
password = WebUI.getAttribute(findTestObject('Admin_Login_Page/input_Password'), 'value')
// WebUI.verifyEqual(password, 'aB123789#')

WebUI.click(findTestObject('Admin_Login_Page/button_Continue'))

WebUI.closeBrowser()