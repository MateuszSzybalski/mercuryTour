package pages;

import org.openqa.selenium.WebElement;


public class TestData {

    public void checkElementIsDisplayed(WebElement WebElement){
        if (WebElement.isDisplayed()){
        } else {
            System.out.println("Element is not displayed");
        }
    }

    public void clickElement(WebElement WebElement){
        WebElement.click();
    }


}
