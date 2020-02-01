package com.homework.months;

import java.util.HashMap;

public enum Months {
    JANUARY(new HashMap<String, Integer>() {
        {
            put("New Year", 1);
            put("Army Day", 28);
            put("Armenian Christmas", 6);
            put("Aunty's B-day", 22);
            put("Tatik's B-day", 29);
        }
    },
            31),
    FEBRUARY(new HashMap<String, Integer>() {{
        put("St Sargis", 8);
        put("Valentine", 14);
        put("Russian Army Day", 23);
    }},
            28),
    MARCH(new HashMap<String, Integer>() {{
        put("National Women's day", 8);
        put("Dad's B-day", 22);
    }},
            31),
    APRIL(new HashMap<>() {{
        put("Motherhood and BeautyDay", 7);
        put("Genocide Remembrance Day", 24);
    }},
            30),
    MAY(new HashMap<>() {{
        put("Labour Day", 1);
        put("Yerkrapah day", 8);
        put("Victory and peace day", 9);
        put("First republic day", 28);
    }},
            31),
    JUNE(new HashMap<>() {{
        put("Children's day", 1);
        put("Mom's B-day", 23);
    }},
            30),
    JULY(new HashMap<>() {{
        put("American Independance day", 4);
        put("Day of state symbols", 5);
    }},
            31),
    AUGUST(new HashMap<>() {{
        put("Խաղողօրհնեք", 14);
        put("My Birthday", 22);
    }},
            31),
    SEPTEMBER(new HashMap<>() {{
        put("Knowledge day", 1);
        put("Grandpa's B-day", 25);
    }},
            30),
    OCTOBER(new HashMap<>() {{
    }},
            31),
    NOVEMBER(new HashMap<>() {{
        put("Nunuf's B-day", 23);
        put("Parents wedding day", 27);
    }},
            30),
    DECEMBER(new HashMap<>() {{
        put("Spitak Earthquake", 7);
        put("Հրապարակի տոնածառի վառման արարողություն\uD83D\uDE05", 21);
        put("Catoclic Christmass", 25);
    }},
            31);

    public HashMap<String, Integer> getHolidaysInMonth() {
        return holidaysInMonth;
    }

    public int getCountOfDaysInMonth() {
        return countOfDaysInMonth;
    }

    HashMap<String, Integer> holidaysInMonth;
    int countOfDaysInMonth;

    Months(HashMap<String, Integer> holidaysInMonth, int countOfDaysInMonth) {
        this.holidaysInMonth = holidaysInMonth;
        this.countOfDaysInMonth = countOfDaysInMonth;
    }

    @Override
    public String toString() {
        return "Holidays in " + this.name() + " are: " + holidaysInMonth +
                ", countOfDaysInMonth = " + countOfDaysInMonth +
                '}';
    }
}
