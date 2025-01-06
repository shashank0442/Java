package tobecompleted;

public class SumOfTwoArray {
    // Sprinklr Interview Question
    // Question : Write a program to sum two array and print the 2 values whose sum is grater then 9
    public static void main(String args[]){
        int A[]={1,7,4,5,6};
        int B[]={1,2,4,5,3};

        for(int i=0;i<= A.length-1;i++) {
            if (A[i]+B[i]>=9){
                System.out.println("A[i]="+A[i]+" and B[i]="+B[i]+" sum are greater then 9");
            }
        }
    }
}