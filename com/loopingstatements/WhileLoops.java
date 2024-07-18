package com.loopingstatements;

import java.util.Scanner;

public class WhileLoops {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            System.out.println("Hello World");
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }
    }
}
