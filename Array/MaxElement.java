import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        declareOfArray(num, size);
        int max = checkMax(num);
        System.out.println("Max element is " + max);
    }
    public static void declareOfArray(int[] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
    }
    public static int checkMax(int[] num) {
        int max  =  num[0];
        for(int i = 0; i < num.length; i++) {
            if(num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
