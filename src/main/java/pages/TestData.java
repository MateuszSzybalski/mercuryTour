package pages;

import org.openqa.selenium.WebElement;


public class TestData {

    public void checkElementIsDisplayed(WebElement webElement){
        if (webElement.isDisplayed()){
        } else {
            System.out.println("Element is not displayed");
        }
    }

    public void clickElement(WebElement webElement) {
        webElement.click();
    }


}
