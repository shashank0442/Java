package extraprograms;

// this was the program asked in PayTM interview on 8/10/2021 and later when i have tried i was able to write it by myself
public class fabonacci {
    public static void main(String[] args) {
        // Desired output would be 0,1,1,2,3,5...
        int first = 0;
        int second = 1;
        int value;

        System.out.print(first+", "+second+", ");
        for(int i=0;i<10;i++){
            value= first+second;
            System.out.print(value+" , ");
            first=second;
            second=value;
        }
    }
}
