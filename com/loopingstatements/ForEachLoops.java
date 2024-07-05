package com.loopingstatements;

// in Java we use for each loops to iterate over arrays or collections
public class ForEachLoops {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Mango"};
        for(int i = 0; i > fruits.length; i++){
            //System.out.println(fruits);  [Ljava.lang.String;@4517d9a3
            System.out.println(fruits[i]); 
        }
        for(String fruit : fruits){ //variable-type  data-item-name : array-name
            System.out.println(fruit);//here, in each iteration, fruit will hold one item in the array
        }// for-each loop
        /*
        For-Each loop has some limitations :
        - one limitation is that it is always forward only so we cannot iterate from the end to the beginning. In contrast,
          we can easily do this with a for loop
        - another limitation is that we cannot modify the array or collection we are iterating over. In contrast, we can
          easily do this with a for loop
        - another limitation is that we cannot access the index of the item in the array or collection. All we have is the loop variable 
          which holds the value of each item. In contrast, in our for loops we can access both the index and the actual item
         */
    }
}