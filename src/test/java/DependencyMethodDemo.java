import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class DependencyMethodDemo {

    WebDriver driver;
    @BeforeTest //Check it run once only in before test
    public void OpenURL() {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        System.out.println(" the website url is open here // I run only one time before test  ");
    }

    // Use Multiple parameter ..Udemy
    @Test(priority = 1 , alwaysRun = true, enabled = true)
    public void UserCanLogin() {
        String UrlGet = driver.getCurrentUrl();
        System.out.println(" User login Method" + UrlGet);

    }

    //this method depend on first method  && then Use Multiple Parameter & array of String
    @Test(priority = 2 ,dependsOnMethods = {"UserCanLogin"})
    public void UserCanBuyFromWebsite() {
        String TitleName = driver.getTitle();

        System.out.println(" User Buy things " + TitleName);
    }

    //

    @Test(priority = 0 , dependsOnMethods = {"UserCanBuyFromWebsite"})
    public void UserRegistration() {
        System.out.println(" Disable Method ");

    }


    @AfterTest //Check it run once only after test
    public void UserCloseWebsite() {

        driver.quit();
        System.out.println(" Good Morning !!! I run only one time After test");
    }


}

