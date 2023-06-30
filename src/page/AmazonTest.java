package page;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import test.BaseClass;

public class AmazonTest extends BaseClass {

    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        AmazonPage page = new AmazonPage(driver);
        page.enterSearchText("Laptop");
        page.clickSearchButton();
        page.clickCartIcon();
        page.clickSignInButton();
        page.enterEmail("xyx@gmaa.com");
        page.clickContinueButton();
        driver.navigate().back();
        driver.navigate().back();
        page.clickDepartmentsMenu();
        page.clickOpenMenuLink();
        page.clickCloseMenuLink();
        page.openTodaysDeals();
        
    }
}
