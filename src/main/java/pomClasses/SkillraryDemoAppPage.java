package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericLibraries.WebDriverUtility;

/**
 * This class contains elements and respective business libraries of skillrary demo App page
 * @author Nani
 *
 */

public class SkillraryDemoAppPage {
	//declaration
	
		@FindBy(xpath="//div[@class='navbar_header']")
		private WebElement pageHeader;

		@FindBy(id="course")
		private WebElement courseTab;
		
		@FindBy(xpath="//span/a[text()='Selenium Training']")
		private WebElement seleniumTrainingLink;
		
		@FindBy(name="addresstype")
		private WebElement categoryDD;
		
		@FindBy(xpath="//a[text()=' Contact Us']")
		private WebElement contactUslink;
		
		//Initialization
		public SkillraryDemoAppPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		/**
		 * This method returns page header text
		 * @return
		 */
		
		//utilization
		public String getpageHeader()
		{
			return pageHeader.getText();
			
		}
		
		/**
		 * This method is used to mouse hover to course tab
		 * @param web
		 */
		public void mouseHoverToCourse(WebDriverUtility web) {
			web.mouseHover(courseTab);
		}
		
		/**
		 * This method is used to click on selenium training
		 */
		public void clickSeleniumTraining() {
			seleniumTrainingLink.click();
		}
		/**
		 * This method is used to select category
		 * @param web
		 * @param index
		 */
		public void selectCategory(WebDriverUtility web,int index) {
			web.dropDown(categoryDD, index);
		}
		
		/**
		 * This method returns contact us link
		 * @return
		 */
		public WebElement getcontactUslink() {
			return contactUslink;	
		}
		
		/**
		 * This method is used click on contact us link
		 */
		public void clickContactUs() {
			contactUslink.click();
		}
}
	


