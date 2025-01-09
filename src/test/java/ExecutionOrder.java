import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecutionOrder {

    // Use Assert testNG.. in this method ..actualResult compare between[AR & ER]

    // priority  .. change default behavior for execution two method ..
    @Test (priority = 0)
    public void b () {
        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa.Kimo");
        Assert.assertEquals(actualResult, ExpectedResult);

        System.out.println("Our second test NG test case 2");
    }

    // incase run one testcase then .. click on one test case
    @Test (priority = 1)
    public void a () {

        String ExpectedResult = "User";
        String actualResult = Name.checkName("Asmaa@kimo");
        Assert.assertEquals(actualResult, ExpectedResult);
        System.out.println("Our thread test NG test case 3");
    }
}
