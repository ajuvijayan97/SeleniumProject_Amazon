package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPage {
     WebDriver driver;
      By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
      By searchButton = By.xpath("//input[@type='submit']");
      By cartIcon = By.xpath("//a[@id='nav-cart']");
      By signInButton = By.xpath("//*[@id='nav-tools']/a[2]");
      By emailField = By.xpath("//input[@id='ap_email']");
      By continueButton = By.xpath("//input[@id='continue']");
      By departmentsMenu = By.xpath("//*[@id='nav-xshop']/a[8]");
      By openMenuLink = By.xpath("//a[@aria-label='Open Menu']");
      By closeMenuLink = By.xpath("//*[@id=\"hmenu-canvas-background\"]/div");
      By todaysDeal = By.xpath("//*[@id=\"nav-xshop\"]/a[5]");
      
      
    public AmazonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchText(String searchText) {
        driver.findElement(searchBox).sendKeys(searchText);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void clickDepartmentsMenu() {
        driver.findElement(departmentsMenu).click();
    }

    public void clickOpenMenuLink() {
        driver.findElement(openMenuLink).click();
    }
    
    public void clickCloseMenuLink() {
    	driver.findElement(closeMenuLink).click();
    }
    
    public void openTodaysDeals() {
    	driver.findElement(todaysDeal).click();
    }
    
    
}
