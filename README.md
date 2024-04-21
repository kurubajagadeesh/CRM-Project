 # Selenium Framework
 This is a test framework which uses Selenium for browser automation uses other dependencies:

TestNG - used for testing framework
Selenium API
Apache Commons
Jackson
Extent Reports
Maven
Maven profiling integration
Java
Setup for framework - uses Page Object Model for Design Pattern

Each page for the application has its class (pages package)
Utils package is used which has following classes - i) ExtentReportHelper - used to create the extent report object (single object is created and used for multiple test scenarios) ii) ListenerHelper - uses ITestListener - which helps in creating the report as per different functions iii) PropertyReaderHelper - helps to read the global config file
Base package is used which has following classes -
i) SetupDriver - this helps to different drivers like chrome.firefox and edge which will trigger using browserType key.

ii) CustomWaits - I have convereted Thread.sleep into a easy to use function (can be used similarly for Explicit and Implicit wait)

iii) Commons - This is used to setup the Json data file for test scenarios

TestConfiguration package - BaseTest - used for setting up before and after functions.

TestData package - for setting up the json file which contains the testData

TestNG - priority, description, dataProvider, groups are covered

 

 

