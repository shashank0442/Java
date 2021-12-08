package extraprograms;

public class printingAverageOfNumbers {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        long averageOfNumbers, sumOfnumber = 0;
        int arrayLength = number.length;
        for (int i = 0; i < arrayLength; i++) {
            sumOfnumber = sumOfnumber + number[i];
        }
        System.out.println("Sumofnumber= " + sumOfnumber);
        averageOfNumbers = sumOfnumber / arrayLength;
        System.out.println("Average of Numbers= " + averageOfNumbers);
    }
}
