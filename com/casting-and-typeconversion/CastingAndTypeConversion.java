package com.castingandtypeconversion;

public class CastingAndTypeConversion {
	public static void main(String[] args) {
        //impicit casting(automatic casting or conversion)
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 2; //any values that we store in a short variable can also be stored in an integer variable 
        /*because we're dealing with two different types of values one is a short the other is an integer one of 
        these values should be converted to the other type so they are equal. 
        Java allocates another variable, an anonymous variable somewhere in memory we don't know where that is 
        and that variable is gonna be an integer then Java is gonna copy the value of x into that memory space and 
        then it will add these two numbers together this is what we call implicit casting
        implicit casting happens whenever you're not gonna lose data*/
        System.out.println(y);
        double a = 1.1;
        double b = a + 2; //the same thing happens here
        //in this example Java is going to automatically cast this integer to a double(so that will be two point zero)
        System.out.println(b); 
        //an integer is less precise than a double because in a double we can have digits after the decimal point

        //explicit casting or conversion
        double c = 1.1;
        int d = (int)c + 2; 
        System.out.println(d); //3
        //explicit casting happens when you're gonna lose data
        /*explicit casting only happens between compatible types. We cannot cast a string to a number*/
        String e = "1";
        //Integer.parseInt(e); //to convert a string to integer
        //System.out.println(Integer.parseInt(e));
        int f = Integer.parseInt(e) + 1;
        System.out.println(f); //2
        /*why parsing or converting a string to a number matters? because pretty much in most frameworks for building user interfaces 
        whether you're building a desktop or a mobile application or web application we always receive input from the user as a string 
        so if you have a form with a bunch of text boxes or drop-down lists almost always we get values as a strings so that's why we 
        need to convert these strings to their numeric representation
        If we are having a string having a floating point number and try to convert it into an integer, then we recieve an error*/
    }
}
