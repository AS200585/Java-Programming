package com.mortgagecalculator;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MortgageCalculatorUpdated {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfYears = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Principal: ");
            try {
                principal = scanner.nextInt();
                System.out.println("Principal: " + principal);
                if (principal >= 10000 && principal <= 1000000) {
                    break;
                } else {
                    System.out.println("Enter value between 10,000 and 1,000,000");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        while (true) {
            System.out.print("Enter Annual Interest Rate: ");
            try {
                float annualInterest = scanner.nextFloat();
                System.out.println("Annual Interest Rate: " + annualInterest);
                if (annualInterest > 1 && annualInterest <= 30) {
                    monthlyInterest = annualInterest / PERCENT / MONTHS;
                    break;
                } else {
                    System.out.println("Enter value between 1 and 30");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float.");
                scanner.next(); // Clear the invalid input
            }
        }

        while (true) {
            System.out.print("Enter Period (Years): ");
            try {
                byte years = scanner.nextByte();
                System.out.println("Years: " + years);
                if (years >= 0 && years <= 20) {
                    numberOfYears = years * MONTHS;
                    break;
                } else {
                    System.out.println("Enter value between 0 and 20");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfYears)) /
                (Math.pow(1 + monthlyInterest, numberOfYears) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
