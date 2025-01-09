import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTwo {
    // Array of string
    @Test (groups = {"regression" ,"sanity"}) // take two parameter
    public void C () {
        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa.Kimo");
        Assert.assertEquals(actualResult, ExpectedResult);

        System.out.println("Our second test NG test case 2");
    }

    @Test (groups = "regression") // take one parameter
    public void d () {
        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa.Kimo");
        Assert.assertEquals(actualResult, ExpectedResult);

        System.out.println("Our second test NG test case 2");
    }


    @Test (groups = "regression")
    public void e () {
        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa.Kimo");
        Assert.assertEquals(actualResult, ExpectedResult);

        System.out.println("Our second test NG test case 2");
    }
}
