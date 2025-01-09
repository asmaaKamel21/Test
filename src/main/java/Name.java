public class Name {

    // crate function then import it from other class
    // 3- Build name function
    //Note:- add static .. bacause use this class without crate from it "Object"

    public static String checkName(String name) {
        if(name.contains("@") || name.contains("."))
        {
            return"User";
        }else{
            return name;
        }

    }

}
