package com.homework.months;

public class Helper {
    public static boolean isHoliday(Month month, int day) {
        return month.getHolidays().contains(day);
    }

    public static void printAllHolidaysInMonth(Month m) {
        System.out.println("Printing all holidays in " + m);
        for (int i : m.getHolidays()) {
            System.out.println(i);
        }
    }

    public static void printAllMonths() {
        System.out.print(Month.values()[0]);
        for (Month m : Month.values()) {
            System.out.print(", " + m);
        }
        System.out.println("\n");
    }

    public static void printDaysInMonth(Month m) {
        System.out.println(m + " has " + m.getCOUNT_OF_DAYS() + " days");
    }
}
