package common.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage_OR {

	@FindBy(xpath = "//input[@id='searchInput']")
	public WebElement txt_Search;
	@FindBy(xpath = "//form[@id='search-form']/fieldset/button/i")
	public WebElement btn_Search;
	@FindBy(xpath = "//a[contains(.,'Pushpa: The Rise')]")
	public WebElement lnk_Pushpa;
	@FindBy(xpath = "//li[contains(.,'17 December 2021')]")
	public WebElement txt_releaseDate;
	@FindBy(xpath = "//tr[14]/td")
	public WebElement country;

	public WikiPage_OR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void movieSearch(String movieName) {
		txt_Search.sendKeys(movieName);
		btn_Search.click();
		lnk_Pushpa.click();
	}

}
