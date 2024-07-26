package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzExercise {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // if this number is divisible by 5, we get Fizz
        // if this number is divisible by 3, we get Buzz
        //if this number is divisible by both 5 and 3, we get fizzbuzz
        //if this number is not divisible by 5 or 3, we get the number itself
        Scanner scanner = new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter your number : ");  
        int number = scanner.nextInt();  
        //since the code structure is nested, hence it is considered very amateurish and ugly
        if(number % 5 == 0){
            if(number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        } 
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else 
            System.out.println(number);
        //more clean version of the code
        if(number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
