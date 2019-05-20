import org.junit.Test;
import pages.TestData;

public class RegisterUser extends BaseTest {

    @Test
    public void registerUser() throws InterruptedException {
        mainPage.checkElementIsDisplayed(mainPage.register);
        mainPage.clickElement(mainPage.register);
        registerPage.checkElementIsDisplayed(registerPage.registerImage);
        registerPage.checkElementIsDisplayed(registerPage.contactInformation);
        registerPage.checkElementIsDisplayed(registerPage.firstName);
        registerPage.checkElementIsDisplayed(registerPage.lastName);
        registerPage.checkElementIsDisplayed(registerPage.phone);
        registerPage.checkElementIsDisplayed(registerPage.email);
        registerPage.fillContactInformation("Tester", "Testowy", "601789654", "tester12@test.pl");
        registerPage.fillMailingInformation("Teststreet69", "TestTest", "Lodz", "Lodzkie", "90-550");
        registerPage.selectCountry("Poland");
        registerPage.checkElementIsDisplayed(registerPage.userInformation);
        registerPage.fillUserInformation("Tester12", "Test1234", "Test1234");
        registerPage.checkElementIsDisplayed(registerPage.submitButton);
        registerPage.clickElement(registerPage.submitButton);
        Thread.sleep(2000);
    }

}
