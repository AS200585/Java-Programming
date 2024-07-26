package multidimensionalarrays;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
        int[][] number1 = new int[2][3];
        number1[0][0] = 1;
        System.out.println(java.util.Arrays.toString(number1)); // [[I@4517d9a3, [I@372f7a8d]
        System.out.println(java.util.Arrays.deepToString(number1)); // deepToString is used to print multi-dimensional arrays
        int[][][] number2 = new int[2][3][5]; //3d arrays
        number2[0][0][0] = 2;
        number2[0][1][0] = 1;
        System.out.println(java.util.Arrays.deepToString(number2));

        int[][] number3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(java.util.Arrays.deepToString(number3));
        int[][][] number4 = {{{3, 2, 1}}, {{6, 5, 4}}, {{9, 8, 7}}};
        System.out.println(java.util.Arrays.deepToString(number4));
    }
}
