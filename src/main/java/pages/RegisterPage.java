package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends TestData{

    String registerUrl = "mercuryregister.php";

    @FindBy(xpath = "//tr//tr//tr//tr[1]//td[1]//img[1]")
    public WebElement registerImage;

    @FindBy(xpath = "//font[contains(text(),'Contact ')]")
    public WebElement contactInformation;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='userName']")
    public WebElement email;

    @FindBy(xpath = "//font[contains(text(),'Mailing ')]")
    public WebElement mailingInformation;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement adress1;

    @FindBy(xpath = "//input[@name='address2']")
    public WebElement adress2;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='postalCode']")
    public WebElement postalCode;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement country;

    @FindBy(xpath = "//font[contains(text(),'User ')]")
    public WebElement userInformation;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='register']")
    public WebElement submitButton;



    public void fillContactInformation(String First_name, String Last_name, String Phone_number, String Email_adress){
        firstName.clear();
        firstName.sendKeys(First_name);
        lastName.clear();
        lastName.sendKeys(Last_name);
        phone.clear();
        phone.sendKeys(Phone_number);
        email.clear();
        email.sendKeys(Email_adress);
    }

    public void fillMailingInformation(String Adress1, String Adress2, String City, String State, String PostalCode){
        adress1.clear();
        adress1.sendKeys(Adress1);
        adress2.clear();
        adress2.sendKeys(Adress2);
        city.clear();
        city.sendKeys(City);
        state.clear();
        state.sendKeys(State);
        postalCode.clear();
        postalCode.sendKeys(PostalCode);
    }

    public void selectCountry(String Country){
        country.sendKeys(Country);
    }

    public void fillUserInformation(String User_name, String Password, String Confirm_password){
        userName.clear();
        userName.sendKeys(User_name);
        password.clear();
        password.sendKeys(Password);
        confirmPassword.clear();
        confirmPassword.sendKeys(Confirm_password);
    }

}
