package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends TestData{

    @FindBy(xpath = "//img[@src='/images/nav/logo.gif']")
    public WebElement logoMercuryTours;

    @FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
    public WebElement signOn;

    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
    public WebElement register;

    @FindBy(xpath = "//a[contains(text(),'SUPPORT')]")
    public WebElement support;

    @FindBy(xpath = "//a[contains(text(),'CONTACT')]")
    public WebElement contact;

}
