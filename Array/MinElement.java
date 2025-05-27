import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        declareOfArray(num, size);
        int min = checkMin(num);
        System.out.println("Min element is " + min);
    }
    public static void declareOfArray(int[] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
    }
    public static int checkMin(int[] num) {
        int min  =  num[0];
        for(int i = 0; i < num.length; i++) {
            if(num[i] <= min) {
                min = num[i];
            }
        }
        return min;
    }
}
