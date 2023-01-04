package DatePrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class DateSorting {


    public static void main(String[] args) throws ParseException {
        ArrayList<Date> dates = new ArrayList<>();
        Date tempDate;
        String str = "10/11/1990, 15/9/2000, 30/06/2021, 14/9/2000, 03/07/1800";
        str = str.replaceAll(" ", "");
        String[] dateArray = str.split(",");
        for (int i = 0; i < dateArray.length; i++) {
            tempDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateArray[i]);
            dates.add(tempDate);
        }
        Collections.sort(dates);
        for (Date sortedDates :
                dates) {
            System.out.println(sortedDates);
        }
    }
}