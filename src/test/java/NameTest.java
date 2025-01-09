import org.testng.Assert;
import org.testng.annotations.*;

// in case need run all test case then run this method
// Note ..TestNG the best form Junit ..because it has more than annotation
public class NameTest {
//    public static void main(String[] args) {
//
//        // note .. main method use to execute code .. but now i use testNG because run cote by it
//
//
//    }

// Note if uses before method OR after in this class .. then execute it ..number of test case in this class

    // testng 1- use annotation for create test case.. & define function
    @Test
    public void should_return_user_if_the_user_name_contains_special_character() {
        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa"); //
        System.out.println(actualResult);

        System.out.println("Our first test NG test case");
    }

    @Test // Use Assert testNG.. in this method ..actualResult compare between[AR & ER]
    public void shoud_return_user_if_the_user_name_contains_spacial_Character2() {
        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa.");
        Assert.assertEquals(actualResult, ExpectedResult);

        System.out.println("Our second test NG test case");
    }

    // incase run one testcase then .. click on one test case
    @Test
    public void shoud_return_user_if_the_user_name_contains_spacial_Character3() {

        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa@");
        Assert.assertEquals(actualResult, ExpectedResult);
        System.out.println("Our thread test NG test case");
    }
}
