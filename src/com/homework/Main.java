package com.homework;

import com.homework.months.Helper;
import com.homework.months.Month;

public class Main {
    public static void main(String[] args) {
        manage();
    }

    private static void manage() {
        //Checking if given date is public holiday
        System.out.println(Helper.isHoliday(Month.March, 8));

        //Printing days count in September
        Helper.printDaysInMonth(Month.Sept);

        //Printing all month's names
        Helper.printAllMonths();

        //Printing all holidays in given month
        Helper.printAllHolidaysInMonth(Month.April);
    }

}
