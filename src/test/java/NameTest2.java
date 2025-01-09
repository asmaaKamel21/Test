import org.testng.annotations.*;

public class NameTest2 extends Main_Inheritor{

    //7- Build a generic before and after method and class

    @Test
    public void should_return_user_if_the_user_name_contains_special_character(){
        String ExpectedResult= "User";
        String actualResult = Name.checkName("Asmaa");
        System.out.println(actualResult);

        System.out.println("Our first test NG test case in other class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am inside the before Test");

    }
    @AfterTest
    public void AfterTest(){
        System.out.println("I am inside the After Test");

    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am inside the before Suite");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("I am inside the After Suite");


    }
}
