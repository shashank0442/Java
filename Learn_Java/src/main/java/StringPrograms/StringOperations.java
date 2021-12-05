package StringPrograms;

public class StringOperations {

    public static String stringReplace(String str){
        str =str.replaceAll("S","s");
        return str;
    }

    public static String cuttingString(String str){
        str =str.substring(0,8);
        return str;
    }

    public static String [] stringSeperationUsingSpace(String str){
        String [] arrayOfString =str.split("\\s");
        return arrayOfString;
    }

    public static void main(String[] args) {
        String str = "Shashank is Senior Software Engineer";
//        System.out.println(stringReplace(str));
//        System.out.println(cuttingString(str));
        String arr[] =stringSeperationUsingSpace(str);
        for (String array:arr) {
            System.out.println(array);
        }
    }
}
