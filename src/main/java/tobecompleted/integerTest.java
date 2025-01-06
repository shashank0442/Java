package tobecompleted;

public class integerTest {
    public static void main(String[] args) {

        int number = 10;
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

//        if number%2==0 ? "Even Number" :"Odd Number";


//        String str="Shashank";
//        char ch;
//        String reversedString="";
//
//        for(int i=0 ;i<str.length();i++){
//            ch=str.charAt(i);
//            reversedString =ch+reversedString;
//        }
//
//        System.out.println(reversedString);


        String str = "India needs 56 runs in 23 balls";

        String arr[] = str.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("\\s", " ");
            System.out.println("i=" + arr[i]);
        }

//
//        char ch;
//        String reversedString="";
//
//        for(int i=0 ;i<str.length();i++){
//            ch=str.charAt(i);
//            reversedString =ch+reversedString;
//        }
//
//        System.out.println(reversedString);


    }
}
