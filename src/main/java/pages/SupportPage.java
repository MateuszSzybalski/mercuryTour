package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportPage extends TestData{

    @FindBy(xpath = "//*[@src='/images/forms/home.gif']")
    public WebElement back_button;


}
