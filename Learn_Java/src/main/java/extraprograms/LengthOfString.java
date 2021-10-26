package extraprograms;

// TechM Asked to Write an program to find length of the string.
public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(getLengthOfStringWithCharArray("Shashank"));
        System.out.println(getLengthOfString("Kelkar"));
    }

    public static int getLengthOfStringWithCharArray(String str) {
        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            length++;
        }
        return length;
    }

    //  This below is the example with indexoutofbounceException
    public static int getLengthOfString(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("String Length is " + i);
        }
        return i;
    }


}
