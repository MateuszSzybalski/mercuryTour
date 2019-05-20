import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import pages.RegisterPage;
import pages.SupportPage;
import pages.TestData;

public class BaseTest extends TestData{
    WebDriver driver;
    String BASE_URL = "http://newtours.demoaut.com/";
    MainPage mainPage;
    TestData testData;
    RegisterPage registerPage;
    SupportPage supportPage;

    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/mateuszszybalski/Documents/automaty/testy/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        System.out.println("Browser is opened");
        driver.get(BASE_URL);
        System.out.println(BASE_URL + " is opened");
        mainPage = PageFactory.initElements(driver, MainPage.class);
        testData = PageFactory.initElements(driver, TestData.class);
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        supportPage = PageFactory.initElements(driver, SupportPage.class);
    }

    @After
    public void tearDown(){
        driver.quit();
        System.out.println("Browser is closed");
    }

}
