package com.company;

import java.util.*;

public class DateActivity {
    public static void main(String[] args) {

        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "Aug", "Sep", "Oct", "Nov", "Dec"};

        int year;

        // Create a Gregorian calender with a particular date
        // Year must be a four digit integer
        // Month is an integer from 0 to 11
        // Day must be an integer form 1 to 31
        GregorianCalendar gc = new GregorianCalendar(2015, 2,
                15, 18,3,50);

        // Calender.MONTH is an enumeration that tells gc.get what to get.
        // Here we are getting the month(2) that we have passed in above.
        System.out.println("Month: " + gc.get(Calendar.MONTH));

        // This will show the month from the array defined above
        // The output is Mar because that is what we have at the index
        // position 2.
        System.out.println("Month: " + months[gc.get(Calendar.MONTH)]);
        System.out.println("Day: " + gc.get(Calendar.DATE));
        System.out.println("Year: " + gc.get(Calendar.YEAR));

        // The day of the week is a numeric value form 1 to 7
        System.out.print("Day of week: ");
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        // Display the time (You have to set the time above first)
        // GregorianCalendar gc = new GregorianCalendar(2015, 2, 15, 15,3);
        System.out.print("Time: ");
        System.out.print(gc.get(Calendar.HOUR) + " : ");
        System.out.print(gc.get(Calendar.MINUTE) + " : ");
        System.out.println(gc.get(Calendar.SECOND));

        // How many days ago what the date?
        // get the milliseconds and convert to the number of days
        long DateInMS = gc.getTimeInMillis();

        // You can also get this from the Date class
        // The Gregorian Calender .getTime method returns a date object
        // A date object is the number of milliseconds
        // Since January 1, 1970

        // The Date class allocates a Date object
        Date myDate = gc.getTime();
        myDate.getTime();

        // Once you know the number of milliseconds you can convert it
        long millisecondsPerDay = (24*60*60*1000);
        float numberofDays = DateInMS / millisecondsPerDay;

        System.out.print("Number of Days: ");
        System.out.println(numberofDays);
    }
}
