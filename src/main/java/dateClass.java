package src.main.java;

import java.util.Date;

public class dateClass {
    public static void main(String[] args){
        Date date = new Date();
        //toString: Gives current date in string format.
        System.out.println(date.toString());
        //getTime: Gives milliseconds from 1 Jan 1970 to current Time
        System.out.println(date.getTime());
        //getDate: Returns Current date
        System.out.println(date.getDate());
        //System.out.println(date.);

    }
}
