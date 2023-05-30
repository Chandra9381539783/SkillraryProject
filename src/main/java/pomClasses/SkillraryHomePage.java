package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//Declaration
	
	@FindBy(xpath="//img[@alt='skillray']")
	private WebElement logo;
	
	@FindBy(xpath="//ul[contains(@class,'home_menu')]/li[1]")
	private WebElement languageIcons;
	
	@FindBy(xpath="//ul[contains(@class,'home_menu')]/descendant::a[text()=' English']")
	private WebElement english;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRay Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	//Initialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	/*
	 * This method returns logo
	 * @return
	 */
	public WebElement getLogo() {
		return logo;
	}
	
	/*
	 * This method is used to select English as default language
	 */
	
	public void chooseEnglish() {
		languageIcons.click();
		english.click();
	}
	
	/*
	 * This method is used to click on gears tab
	 */
	
	public void clickGearsTab() {
		gearsTab.click();
	}
	
	/*
	 * This method is used to click on Skillrary demo app link
	 */
	
	public void clickSkillraryDemoAppLink() {
		skillraryDemoAppLink.click();
	}
}
