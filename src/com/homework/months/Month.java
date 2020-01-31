package com.homework.months;

import java.util.ArrayList;

public enum Month {
    Jan(31, new ArrayList<>() {{
        add(1);
        add(6);
        add(28);
    }}),
    Feb(28, new ArrayList<>() {{
        add(14);
        add(23);
    }}),
    March(31, new ArrayList<>() {{
        add(8);
        add(22);
    }}),
    April(30, new ArrayList<>() {{
        add(7);
        add(17);
        add(24);
    }}),
    May(31, new ArrayList<>() {{
        add(1);
        add(8);
        add(9);
        add(28);
    }}),
    Jun(30, new ArrayList<>() {{
        add(1);
    }}),
    Jul(31, new ArrayList<>() {{
        add(19);
    }}),
    Aus(31, new ArrayList<>() {{
        add(22);
    }}),
    Sept(30, new ArrayList<>() {{
        add(1);
        add(21);
        add(28);
    }});

    private int COUNT_OF_DAYS;

    public int getCOUNT_OF_DAYS() {
        return COUNT_OF_DAYS;
    }

    public ArrayList<Integer> getHolidays() {
        return holidays;
    }

    ArrayList<Integer> holidays;

    Month(int COUNT_OF_DAYS, ArrayList<Integer> holidays) {
        this.COUNT_OF_DAYS = COUNT_OF_DAYS;
        this.holidays = holidays;

    }

}
