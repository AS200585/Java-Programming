package ifstatements;

public class IfStatements {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x is less than y");
        }
        if (x == y) {
            System.out.println("x is equal to y");
        }
        if (x > y) {
            System.out.println("x is greater than y");
        }

        int temp = 24;
        if (temp > 30) {
            System.out.println("It's hot outside!");
            System.out.println("Keep drinking water");
        } else if (temp < 29 && temp > 20){
            System.out.println("It's beautiful outside!");
            System.out.println("Enjoy your day!");
        } else {
            System.out.println("It's a bit colder today.");
        }
        
        int number = 13;
        if(number % 5 == 0)
            System.out.println("Number is divisible by 5");
        else if(number % 3 == 0)
            System.out.println("Number is divisible by 3");
        else
            System.out.println("Number is not divisible by 5 or 3");
    }
}
