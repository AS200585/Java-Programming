package readinginput;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //the scanner object has a bunch of methods for reading data and all these methods start with next 
        // scanner.nextByte();//reading a byte
        // scanner.nextShort();//reading a short
        // scanner.nextLine()();//reading a line
        // scanner.nextLong();//reading a long and more
        // scanner.nextFloat();//reading a float
        // scanner.nextDouble();//reading a double
        // scanner.nextBoolean();//reading a boolean
        // scanner.next();//reading a word

        /*System.out.println("Age : ");
         byte age = scanner.nextByte();
         System.out.println("You are " + age + " years old"); */

        System.out.println("Name : ");

        /* String name = scanner.nextLine();
           System.out.println("You are " + name);
        When we try to print our fill name, Java only returns the First name. This is because these words that we have here (eg., Anant Sharma)
        these are called tokens. Every time we call the next method, it reads one token so here we have a space[Anant(space)Sharma], we have two 
        tokens(Anant & Sharma). So here we need to call the next method two times to get the full name the first time we call it it returns Anant
        and the second time we call, it returns Sharma. So, we need to call the next method two times to get the full name and combine this suit 
        together, which is not ideal
        That's when we use the nextLine() method. With this method we get the in turn line that the user enters no matter how many spaces or 
        tabs are there */
        
        String name = scanner.nextLine().trim(); //trim() method remember is used to get rid of all the white spaces before or after a string
        System.out.println("You are " + name);
        scanner.close();
    }
}