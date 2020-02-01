package com.homework;

import com.homework.months.Helper;
import com.homework.months.Months;

public class Main {
    public static void main(String[] args) {
        //Printing days count in given month
        Helper.printDaysNumberInMonth(Months.AUGUST);

        //Printing holidays in month
        Helper.printHolidaysInMonth(Months.APRIL);

        System.out.println(Helper.isValidHoliday(Months.MARCH, 8));

        //Printing all months
        Helper.traversingMonths();
    }
}
