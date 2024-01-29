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

Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')

//
Windows.setText(findWindowsObject('Object Repository/Sign In/Edit'), 'muhammad.mubeen+1@epicgames.quixel.com')

////
Windows.setText(findWindowsObject('Object Repository/Sign In/Edit(1)'), 'Mubeen@123')

////
Windows.click(findWindowsObject('Object Repository/Sign In/Text'))

////
def verifySignIn = Windows.getText(findWindowsObject('Object Repository/Sign In/Text(1)'))

////
assert verifySignIn == 'TRIPS'


Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/ImportButton'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/Edit'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/AssetType'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/ImportFrom'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/SelectFolder'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/CopyToPath'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/PathButton1'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/PathButton2'))

Windows.doubleClick(findWindowsObject('Object Repository/Left Penal - Import/New import/PathButton2'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/SelectFolder2'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/ImportButton'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/AssetSelectionCheckBox'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Import/New import/FinalImportButton'))

