package com.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[7]; //new because arrays are a reference type
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //System.out.println(numbers); //We get this string in form of our arrays : [I@4517d9a3
        /*By default when we print an array Java returns the string which is calculated based on the address of this object in memory 
        so if you have another array and we print that we're gonna see something different because each object is gonna 
        be in a different memory space*/
        System.out.println(java.util.Arrays.toString(numbers)); // Class Arrays helps us see the actual itmems present in an array
        /* the first five items are initialized the others are set to 0 by default for indexes without values because here we're dealing 
        with an integer array if you had a boolean array all items why default get initialized to false if you have a string array 
        all items get initialized to an empty string */

        //New syntax (or method) to initialize an array if we know items ahead of time
        int[] number = {4, 3, 1, 2, 5}; // Arrays in Java have a fixed length
        System.out.println(java.util.Arrays.toString(number));
        java.util.Arrays.sort(number);
        System.out.println(java.util.Arrays.toString(number));
        System.out.println(number.length);
    }
}
