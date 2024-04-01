package org.example.javaDateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {

    public static String findDay(int month, int day, int year) {
        String dayOfWeek="";
      //  LocalDate locale= LocalDate.of(year, month, day);
      //  dayOfWeek=locale.getDayOfWeek().toString();
        Calendar calendar=Calendar.getInstance();
        calendar.set(year, month - 1, day);


        dayOfWeek=calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.ENGLISH).toUpperCase();

        return dayOfWeek;

    }
    public void main(String[] args) {

        String result=findDay(8, 5, 2015);
        System.out.println(result);


    }
}
