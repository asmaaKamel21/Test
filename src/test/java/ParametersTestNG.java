import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {

    //13- parameters in testNG ..this parameter go to xml file search about
    // this Para and get value it then assign to "browser" argument in method
    // mut be executed Run from Xml file !!!!

//    @Parameters ( "Browser") // this one argument
//    @Test
//    public void a( String browser) {
//
//        System.out.println(" Open 99 " + browser  +" Browser");
//    }

    @Parameters({"Browser", "Version"}) // this Two argument
    @Test
    public void h(String browser, String version) {

        System.out.println(" Open 77 " + browser + " Browser with Version " + version);
    }


    // Note Don Run Code from XML file !!!2025
    @Parameters("Browser") // this One argument
    @Test
    public void K(String browser) {

        System.out.println(" Open 99 " + browser + " Browser with Version ");
    }

    @Parameters({"Browser2", "Version2"})
    @Test
    public void firefox(String bro, String ver) {
        System.out.println("Open 88" + bro + "Browser with version " + ver);
    }

}
