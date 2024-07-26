package mathclass;
//performing mathematical operations
public class MathClass {
	public static void main(String[] args) {
        int result1 = Math.round(1.11F);
        System.out.println(result1); //1
        int result2 = (int)Math.ceil(1.1F); //returns the smallest integer that is greater than or equal to given number
        System.out.println(result2); //2
        int result3 = (int)Math.floor(1.1F); //floor of a numberis the largest integer that is smaller or equal to given number 
        System.out.println(result3); //1
        int result4 = (int)Math.max(1, 4); //returns greater of two values
        System.out.println(result4); 
        double result5 = Math.random(); //returns random decimal numbers between 0 and 1
        System.out.println(result5);
        double result6 = Math.random() * 100; //returns random decimal numbers between 0 and 100
        System.out.println(result6);
        double result7 = Math.round(Math.random() * 100); //returns random numbers between 0 and 100
        System.out.println(result7);
        int result8 = (int)Math.round(Math.random() * 100);
        System.out.println(result8);
        int result9 = (int)(Math.random() * 100); //we can also wrap the command in parenthesis instead of using Math.round()
        System.out.println(result9);
    }
}
