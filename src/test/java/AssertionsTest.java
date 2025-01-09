import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {


    @Test
    public void assearto() {

        // Note :- if any line in code fail ..will execution cod "not complete" then use softAssert
        // soft Assert .. use it in case line code fail .. done execute all code
        SoftAssert softAssert = new SoftAssert(); // create object from softAssert ..Step 1
        System.err.println(" Open the Website");
        boolean actualResult = false;
//        Assert.assertTrue(actualResult); // for example .. if logo is fisable then return true
        softAssert.assertTrue(actualResult); // use softAssert object in it .. step 2
        System.out.println(" Close the Browser");

    }
}
