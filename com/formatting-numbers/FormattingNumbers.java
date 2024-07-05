package com.formattingnumbers;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency); //java.text.DecimalFormat@69595
        String result = currency.format(1234567.891);
        System.out.println(result); //$1,234,567.89

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.18);
        System.out.println(result2); //10%

        String result3 = NumberFormat.getCurrencyInstance().format(1234.56); //method chaining
        System.out.println(result3); //$1,234.57
    }
}
