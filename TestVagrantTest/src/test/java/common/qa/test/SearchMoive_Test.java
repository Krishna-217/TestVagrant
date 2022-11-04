package common.qa.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.qa.config.DriverClass;
import common.qa.pages.ImdbPage_OR;
import common.qa.pages.WikiPage_OR;

public class SearchMoive_Test extends DriverClass {

	String imbdPage_Date;
	String imbdPage_Country;
	String wikiPage_Date;
	String wikiPage_Country;

	@Test(priority = 1)
	public void testIMBDPAge() {
		// Load web page
		driver.get(imbdPage_URL);
		ImdbPage_OR imd = new ImdbPage_OR(driver);
		// Searching movie
		imd.movieSearch("Pushpa:The Rise");
		// Verify release date
		assertTrue(imd.releaseDate.isDisplayed());
		imbdPage_Date = imd.releaseDate.getText();
		// Verify country
		assertTrue(imd.country.isDisplayed());
		imbdPage_Country = imd.country.getText();

	}

	@Test(priority = 2)
	public void testWikiPage() {
		// Load web page
		driver.get(wikiPage_URL);
		WikiPage_OR wiki = new WikiPage_OR(driver);
		// Searching movie
		wiki.movieSearch("Pushpa:The Rise");
		// Verify release date
		assertTrue(wiki.txt_releaseDate.isDisplayed());
		wikiPage_Date = wiki.txt_releaseDate.getText();
		System.out.println("Release Date:" + wikiPage_Date);
		// Verify country
		assertTrue(wiki.country.isDisplayed());
		wikiPage_Country = wiki.country.getText();

	}

	@Test(priority = 3)
	public void testValidateMoviewDeatils() throws Exception {
		assertEquals(imbdPage_Country, wikiPage_Country);
		assertEquals(imbdPage_Date, wikiPage_Date);


	}
}
