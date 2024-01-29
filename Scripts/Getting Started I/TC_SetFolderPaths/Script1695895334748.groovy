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

import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def filePath = "C:\\Users\\Quixel\\AppData\\Roaming\\Quixel Tracker staging3\\settings.json"
def jsonContent = new File(filePath).text

// Parse the JSON content
def json = new JsonSlurper().parseText(jsonContent)

// Update the specific variable (change "variableName" and "newValue" as needed)
json.importFrom = "C:\\Users\\Quixel\\Desktop\\Raw"
json.copyTo = "C:\\Users\\Quixel\\Desktop\\Destination"
json.dataPath = "C:\\Users\\Quixel\\Desktop\\Destination"
json.lrPath = "C:\\Users\\Quixel\\Desktop\\Destination"
json.rcPath = "C:\\Users\\Quixel\\Desktop\\Destination"
json.qaDirectory = "C:\\Users\\Quixel\\Desktop\\Destination"
json.importDestPath = "C:\\Users\\Quixel\\Desktop\\Destination"
json.importFromPath = "C:\\Users\\Quixel\\Desktop\\Raw"

// Convert the updated JSON back to a string
def updatedJsonString = JsonOutput.toJson(json)

// Write the updated JSON back to the file
new File(filePath).text = updatedJsonString


// Optionally, print the updated JSON
println("Updated JSON:\n$updatedJsonString")