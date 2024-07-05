package com.logicalops;
//Logical operators combine multiple boolean expressions
public class LogicalOperators {
    public static void main(String[] args) {
        int temperature = 23;
        boolean isWarm = temperature > 20 && temperature < 30; //& operator
        System.out.println(isWarm); //true
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit; //or operator
        System.out.println(isEligible); //true
        boolean hasCriminalRecord = true;
        boolean isEligibleForLoan = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; //not operator
        System.out.println(isEligibleForLoan); //false
    }
}
