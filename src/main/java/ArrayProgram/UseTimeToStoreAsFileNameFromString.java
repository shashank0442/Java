package ArrayProgram;

public class UseTimeToStoreAsFileNameFromString {

    /*
    Write a program to extract the time from date and time array
    * */

    public static String[] dateTime = {"2023-08-15 10:30:25", "2024-08-15 04:30:02",
            "2023-08-10 10:30:10"};

    public static void main(String[] args) {

        for (int i = 0; i < dateTime.length; i++) {
            dateTime[i] = dateTime[i].substring(10, 19);
            dateTime[i] = dateTime[i].replaceAll(":", "");

            System.out.println(dateTime[i]);
        }

    }
}
