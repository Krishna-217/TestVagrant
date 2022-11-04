package common.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbPage_OR {

	@FindBy(xpath = "//input[@id='suggestion-search']")
	public WebElement txt_Search;
	@FindBy(xpath = "//button[@id='suggestion-search-button']")
	public WebElement btn_Sreach;
	@FindBy(xpath = "//a[contains(text(),'Pushpa: The Rise - Part 1')]")
	public WebElement lnk_Pushpa;
	@FindBy(xpath = "//a[contains(text(),'December 17, 2021 (United States)')]")
	public WebElement lnk_ReleaseDate;
	@FindBy(xpath = "//tbody/tr[6]/td[2]")
	public WebElement releaseDate;
	@FindBy(xpath = "//a[contains(text(),'India')]")
	public WebElement country;

	public ImdbPage_OR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void movieSearch(String moviename) {
		txt_Search.sendKeys(moviename);
		btn_Sreach.click();
		lnk_Pushpa.click();
		lnk_ReleaseDate.click();

	}

}
