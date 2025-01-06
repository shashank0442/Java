package extraprograms;

public class Palindrome {
    public static void main(String args[]) {
        int remainder, sum = 0, tempValue;
        int number = 454;//It is the number variable to be checked for palindrome

        tempValue = number;
        while (number > 0) {
            remainder = number % 10;  //getting remainder
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (tempValue == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
