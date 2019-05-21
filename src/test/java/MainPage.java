import org.junit.Assert;
import org.junit.Test;

public class MainPage extends BaseTest{

    @Test
    public void openMainPage() {
        mainPage.checkElementIsDisplayed(mainPage.logoMercuryTours);
        Assert.assertEquals(BASE_URL , driver.getCurrentUrl());
        mainPage.checkElementIsDisplayed(mainPage.signOn);
        mainPage.checkElementIsDisplayed(mainPage.register);
        mainPage.checkElementIsDisplayed(mainPage.support);
        mainPage.checkElementIsDisplayed(mainPage.contact);
        mainPage.clickElement(mainPage.support);
        supportPage.checkElementIsDisplayed(supportPage.back_button);
        supportPage.clickElement(supportPage.back_button);
        mainPage.checkElementIsDisplayed(mainPage.logoMercuryTours);
    }

}
