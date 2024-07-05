package com.loopingstatements;

import java.util.Scanner;

public class DoWhileLoops {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        do { 
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        } while (!input.equals("hi"));
    }
}
