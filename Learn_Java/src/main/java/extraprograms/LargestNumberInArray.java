package extraprograms;
//Write a program for gratest number in Array
public class LargestNumberInArray {
    public static void main(String[] args) {
        int arr[]= {5,2,9,8,10};
        int currentVal=arr[0];
        for(int i =0;i<5;i++){
            if(currentVal < arr[i]){
                currentVal = arr[i];
                System.out.println("Value="+arr[i]);
            }
        }
        System.out.println(currentVal);
    }
}
