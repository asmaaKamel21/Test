import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

    WebDriver driver; // initial driver for all class

    // 2025 .. total Test run = [any Method With "@test"..only
    //Note : testNG by default when run Test case .. appear in result "Default Suite"

    @BeforeTest //Check it run once only in before test
    public void OpenURL() {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        System.out.println(" the website url is open here // I run only one time before test  ");
    }

    @Test(priority = 1)
    public void UserCanLogin() {
        String UrlGet = driver.getCurrentUrl();
        System.out.println(" User login Method" + UrlGet);

    }


    @Test(priority = 2)
    public void UserCanBuyFromWebsite() {
        String TitleName = driver.getTitle();
        Assert.assertEquals(TitleName ,"Google"); // assert ER =AR
        System.out.println(" User Buy things " + TitleName);
    }

    // Note .. Enabled=false => mean this method not execute through Running Class
    @Test(enabled = false)
    public void UserRegistration() {
        System.out.println(" Disable Method ");

    }

    @AfterTest //Check it run once only after test
    public void UserCloseWebsite() {

        driver.quit();
        System.out.println(" Good Morning !!! I run only one time After test");
    }
}
