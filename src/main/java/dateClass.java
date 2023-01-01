package src.main.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateClass {
    public static void main(String[] args){
        Date date, date1, date2, date3;
        date = new Date();
        //toString: Gives current date in string format.
        System.out.println("Print date in general format with time and timezone"+date.toString());
        //getTime: Gives milliseconds from 1 Jan 1970 to current Time
        System.out.println("Print time in millisecond from 1st Jan 1970"+date.getTime());
        //getDate: Returns Current date
        System.out.println("Print current date"+date.getDate());

        //Comparing dates
        date1 = new Date(2000, 11, 21);
        date2 = new Date();
        date3 = new Date(2010, 1, 3);
        //Comparing two dates and returns boolean value
        boolean a = date3.after(date1);
        System.out.println("Date date3 comes after " +
                "date date1: " + a);

        boolean b = date3.before(date2);
        System.out.println("Date d3 comes before "+
                "date d2: " + b);

        // Return -1, 0 and 1 based on comparison
        //0 if equal
        // -1 if date1 is before date3
        // 1 if date1 is after date3
        int c = date3.compareTo(date3);
        System.out.println("Returning "+c);
        c = date1.compareTo(date3);
        System.out.println("Returning "+c);
        c = date3.compareTo(date1);
        System.out.println("Returning "+c);

        // For more details visit https://docs.oracle.com/javase/7/docs/api/java/util/Date.html

        //Formatting dates in a definite format this is handled by SimpleDateFormat class of Java
        // For more details on SDF visit https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#:~:text=SimpleDateFormat%20is%20a%20concrete%20class,patterns%20for%20date%2Dtime%20formatting.
        // Use letter as per mentioned in the webpage to avoid garbage value
        SimpleDateFormat sdf, sdf1, sdf2, sdf3, sdf4, sdf5;
                sdf = new SimpleDateFormat("MM/dd/yyyy");
                sdf1 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                sdf2 = new SimpleDateFormat("G");
                sdf3 = new SimpleDateFormat("y");
                sdf4 = new SimpleDateFormat("Y");
                sdf5 = new SimpleDateFormat("z:Z");
        System.out.println("Formatting date "+sdf.format(date));
        System.out.println("Formatting date with time "+sdf1.format(date));
        System.out.println("Era "+sdf2.format(01/01/1960));
        System.out.println("Year "+sdf3.format(date));
        System.out.println("Week year "+sdf4.format(date));
        System.out.println("Time Zone "+sdf5.format(date));
    }
}