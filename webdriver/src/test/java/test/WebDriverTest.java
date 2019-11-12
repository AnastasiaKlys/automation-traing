package test;

import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.ResultPage;

public class WebDriverTest {
    public WebDriver driver;

    public static String ALERT_MESSAGE_REGISTRATION = "У вас уже есть аккаунт на Airbnb?";
    public static String CITY_DESTINATION = "Milan";



    @BeforeMethod(alwaysRun = true)
    public void setUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "D:/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public void checkCorrectData(){
        String flatCityName = new HomePage(driver)
                .correctSearch(CITY_DESTINATION,"2019-11-12","2019-11-13")
                .openInformation()
                .cityName();
        Assert.assertEquals(CITY_DESTINATION, flatCityName);
    }

    @Test
    public void likeOnlyRegistrationUser(){
        String messageRegistration = new HomePage(driver)
                .correctSearch(CITY_DESTINATION,"2019-11-12","2019-11-13")
                .likeFlat();
        Assert.assertEquals(ALERT_MESSAGE_REGISTRATION,messageRegistration);

    }
    @AfterMethod(alwaysRun = true)
    public void tearDownBrowser(){
        driver.quit();
        driver = null;
    }



}
