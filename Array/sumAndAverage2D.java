import java.util.Scanner;

public class sumAndAverage2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the 2d array: ");
        int size = input.nextInt();
        int[][] num = new int[size][size];
        declareOfArray(num, size);
        int sum  = sumOf(num, size);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/size);
    }
    public static int sumOf(int[][] num,int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += num[i][j];
            }
        }
        return sum;
    }
    public static void declareOfArray(int[][] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                num[i][j] = input.nextInt();
            }
        }
    }
}
