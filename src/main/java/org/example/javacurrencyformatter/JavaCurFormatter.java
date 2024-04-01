package org.example.javacurrencyformatter;

import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurFormatter {
    public static void main(String[] args) {
        double input= 12324.134;
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(input);
        String india=NumberFormat.getCurrencyInstance(new Locale("hi", "in")).format(input);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(input);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(input);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    //sample output

}
