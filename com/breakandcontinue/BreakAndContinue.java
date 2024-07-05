package com.breakandcontinue;

import java.util.Scanner;
//break statement terminates a loop
//continue statement moves control to the beginning of the loop
public class BreakAndContinue {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        while(true){ //add 'true' to a while loop if there is a break statement in it in order to prevent an infinite loop
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("pass")){
                continue;
            }
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
