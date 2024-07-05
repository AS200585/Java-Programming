package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    @SuppressWarnings("resource") /*It is an annotation in Java and a powerful tool that enables developers to have more control 
    over the compilation process by suppressing specific warnings. It can enhance code readability by hiding controlled or 
    unnecessary warnings that are not relevant to the code.*/
    public static void main(String[] args){
        //exception :- an event that disrupts normal flow of program during execution
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number to divide: ");
            int number1 = scanner.nextInt();
            System.out.println("You entered: " + number1);
            System.out.print("Enter a number to divide by: ");
            int number2 = scanner.nextInt();
            System.out.println("You entered: " + number2);

            float result = number1/number2;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("An error occurred. Please enter a valid number.");
        } catch(InputMismatchException e){
            System.out.println("Error occurred again. Enter a number PLEASE.");
        } catch(Exception e){ //catches all types of exceptions. Can be used as a last resort
            System.out.println("An error once again. PLEASE TRY AGAIN.");
        } 
        //it's considered a good practice to catch and handle individual exceptions rather than catching all exceptions at once
        finally{  
            System.out.println("This sentence will print all the time regardless");
            scanner.close();
        }//  a finally block will always execute whether or not we catch an exception
         //  a good use of the finally block is to close any open scanners or files that might be open. Eg., scanner.close()
    }
}
