package com.arithmeticexpressions;

public class ArithmeticExpressions {
	public static void main(String[] args) {
        int result1 = 10 + 3;
        int result2 = 10 - 3;
        int result3 = 10 * 3;
        int result4 = 10 / 3; // whole number
        double result5 = (double)10 / (double)3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        int x = 1;
        //x++;   Increment operator
        //++x;   Pre-increment operator
        //int y = x++;   value of x = 1 be copied to y and then x will be incremented by 1
        //int y = ++x;   x will be incremented by 1 and then value of x will be copied to y
        x += 2; //x incremented by 2
        System.out.println(x); 
        //System.out.println(y); 
    }
}
