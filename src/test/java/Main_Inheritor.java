import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Main_Inheritor {

    // need run method 2&3 be-four other method .. use annotation

    //this run twice  .. because have two other method
    //Open Browser
    @BeforeMethod
    public void beforeMethod() {

        System.out.println("I am inside the before method ..main Class");

    }
// Close browser
    @AfterMethod
    public void AfterMethod() {

        System.out.println("I am inside the after method ..Main class");
    }

    //User before Class & After Class .. this executes one Only
    @BeforeClass
    public void beforeClass() {

        System.out.println("I am inside the  before Class ..main class");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("I am inside the After Class ..main class");

    }


}
