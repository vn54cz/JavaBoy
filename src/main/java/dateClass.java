package src.main.java;

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
    }
}