package com.homework.months;

public class Helper {
    public static void printHolidaysInMonth(Months month) {
        System.out.println("Holidays in " + month.name() + " are: " + month.getHolidaysInMonth().toString() + "\n");
    }

    public static void printDaysNumberInMonth(Months month) {
        System.out.println("Days count in " + month.name() + " is: " + month.countOfDaysInMonth + "\n");
    }

    public static boolean isValidHoliday(Months month, int day) {
        return month.getHolidaysInMonth().containsValue(day);
    }

    public static void traversingMonths() {
        for (Months m : Months.values())
            System.out.println(m);
    }

}
