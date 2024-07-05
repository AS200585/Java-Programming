package com.ternaryops;
//Ternary Operator
public class TernaryOperator {
    public static void main(String[] args){
        int income = 110_498;
        String className = (income > 100_000) ? "First class" : "Economy";
        // (Condition) ? Expression1 : Expression2;
        System.out.println("Passenger belongs to : ");
        System.out.println(className);
    }
}
