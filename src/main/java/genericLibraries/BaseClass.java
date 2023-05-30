package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomClasses.ContactUsPage;
import pomClasses.SeleniumTrainingPage;
import pomClasses.SkillraryDemoAppPage;
import pomClasses.SkillraryHomePage;
import pomClasses.TestingPageInSkillrarayApp;




public class BaseClass {
	
	protected PropertiesUtility property;
	protected  ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriverUtility web;
	protected WebDriver driver;
	
	protected ContactUsPage contact;
	protected SeleniumTrainingPage selenium;
	protected SkillraryDemoAppPage demoapp;
	protected SkillraryHomePage home;
	protected TestingPageInSkillrarayApp testing;
	
	
	//@BeforesSuite	
	//@BeforeTest
	
	@BeforeClass
	public void classConfig() {
		property= new  PropertiesUtility();
		excel = new ExcelUtility();
		jutil = new JavaUtility();      
		web = new WebDriverUtility();   
		
		property.PropertiesInit(IConstantPath.PROPERTIES_PATH);
		excel.excelInit(IConstantPath.EXCEL_PATH);
	}
	@BeforeMethod
	public void methodConfig() {
		driver = web.lanchBrowser(property.readDataFromProperties("browser"));
		web.maximizeBrowser();
		web.navigateToApp(property.readDataFromProperties("url"));
		web.waitUntilElementFound(Long.parseLong(property.readDataFromProperties("time")));
		
		home = new SkillraryHomePage(driver);
		demoapp= new SkillraryDemoAppPage(driver);
		selenium = new SeleniumTrainingPage(driver);
		testing = new TestingPageInSkillrarayApp(driver);
		contact = new ContactUsPage(driver);	
	}
	@AfterMethod
	public void methodTearDown() {
		web.quitAllWindows();
	}
	@AfterClass
	public void classTearDown() {
	  excel.closeExcel();
	}
	//@AfterTest
	//@Aftersuite
}
