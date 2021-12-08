package StringPrograms;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Shashank Kelkar";
        String reversedString = "";
        String[] arrString = str.split("\\s");
        char c;

        for (String s : arrString) {
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                reversedString = c + reversedString;
            }
            reversedString = " " + reversedString;
        }
        System.out.println("reversedString= " + reversedString);
    }
}
