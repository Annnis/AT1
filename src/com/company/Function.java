package com.company;

public class Function {
    public static void main(String[] args) {
        System.out.println(distance(1,9,6,5));
    }

    public static String dateByNum(int day) {
        String dayName;
        if (day == 1) {
            return dayName = "Monday";
        }
        if (day == 2) {
            return dayName = "Tuesday";
        }
        if (day == 3) {
            return dayName = "Wednesday";
        }
        if (day == 4) {
            return dayName = "Thursday";
        }
        if (day == 5) {
            return dayName = "Friday";
        }
        if (day == 6) {
            return dayName = "Saturday";
        }
        if (day == 7) {
            return dayName = "Sunday";
        }
        return null;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
