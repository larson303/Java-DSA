package com.applytruth.dsa.DataStructures;

import java.util.Arrays;

public class ArraysReview {

    String[] weekdays = new String[7];
//  System.out.println(Arrays.toString(weekdays));
//  weekdays[0] = "Monday";
//  weekdays[1] = "Tuesday";
//        weekdays[2] = "Wednesday";

    public void setWeekdays() {
        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        weekdays[2] = "Wednesday";
        weekdays[3] = "Thursday";
        weekdays[4] = "Friday";
        weekdays[5] = "Saturday";
        weekdays[6] = "Sunday";

        System.out.println(Arrays.toString(weekdays));
    }

    public void printWeekdays() {
        System.out.println("=====================================");
        for(int i = 0; i < weekdays.length; i++) {
            System.out.println(" " + weekdays[i]);
        }
    }

    public void run() {
        setWeekdays();
        printWeekdays();
    }

}
