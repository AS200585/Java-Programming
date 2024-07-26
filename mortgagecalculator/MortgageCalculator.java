package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Principal : ");
        int principal = scanner.nextInt();
        System.out.println("Principal : " + principal);
        System.out.println("Enter Annual Interest Rate : ");
        float annualInterest = scanner.nextFloat();
        System.out.println("Annual Interest Rate : " + annualInterest);
        float montlyInterest = annualInterest / PERCENT / MONTHS;
        System.out.println("Enter Period (Years) : ");
        byte years = scanner.nextByte();
        System.out.println("Number of Years : " + years);
        int numberOfYear = years * MONTHS;
        double mortgage = principal * (montlyInterest * Math.pow(1 + montlyInterest, numberOfYear)) / 
                            (Math.pow(1 + montlyInterest, numberOfYear) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage : " + mortgageFormatted);
    }
}

