import org.junit.Test;

public class MainPage extends BaseTest{

    @Test
    public void openMainPage() {
        mainPage.checkElementIsDisplayed(mainPage.logoMercuryTours);
        mainPage.checkElementIsDisplayed(mainPage.signOn);
        mainPage.checkElementIsDisplayed(mainPage.register);
        mainPage.checkElementIsDisplayed(mainPage.support);
        mainPage.checkElementIsDisplayed(mainPage.contact);
    }

}
