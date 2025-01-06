package extraprograms;
// Write a program for Factorial of 5 would be 5*4*3*2*1 =120
public class FactorialProgram {
    public static void main(String[] args) {
        int val = 5;
        double finalVal = 1;

        for (int i = 1; i <= val; i++) {
            finalVal = i * finalVal;
        }
        System.out.println(finalVal);
    }
}
