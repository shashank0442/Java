package extraprograms;

public class printSumOfNumbers {
    public static void main(String[] args) {
        int number = 143;
        int sum = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;    //finds the last digit of the given number
            sum = sum + digit;      //adds last digit to the variable sum
            number = number / 10;   //removes the last digit from the number
        }
        System.out.println(sum);
    }
}
