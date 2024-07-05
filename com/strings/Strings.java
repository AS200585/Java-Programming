package com.strings;

public class Strings {
	public static void main(String[] args) {
        String message = "  Hello World" + "!!";
        //message.endsWith("!!");   Because string is a class, it has members we can access using dot operator
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.indexOf("sky")); //returns -1 as it does not exist in the string
        System.out.println(message.replace("!", "*")); //target& replacement are parameters. !, * are arguments
        System.out.println(message); //String are immutable in Java hence there are no changes even if we print the original string
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //used to get rid of extra white spaces at the start or end of string
    }
}
