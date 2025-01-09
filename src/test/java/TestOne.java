import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {

    //Include and exclude in TestNG .. this class & Class two use this Method in xml file add it method name


    @Test (groups = "sanity")
    public void b () {
        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa.Kimo");
        Assert.assertEquals(actualResult, ExpectedResult);

        System.out.println("Our second test NG test case 2");
    }

    // incase run one testcase then .. click on one test case
    //12- Use Groups for execute set of Test case .. may be uses it in regression && sanity test
    @Test (groups = "regression")
    public void a () {

        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa@kimo");
        Assert.assertEquals(actualResult, ExpectedResult);
        System.out.println("Our thread test NG test case 3");
    }

    @Test (groups = "live")
    public void UserCanUseCreditcart() {

        System.out.println("Our thread test NG test case 3");
    }
}
