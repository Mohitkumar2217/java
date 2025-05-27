import java.util.Scanner;

public class CheckSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        declareOfArray(num, size);
        boolean sort = checkSort(num);
        if(sort) {
            System.out.println("Array is sorted.");
        }
        else {
            System.out.println("Array is unsorted.");
        }
    }
    public static void declareOfArray(int[] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
    }
    public static boolean checkSort(int[] num) {
        int m = num[0];
        for(int i = 1; i < num.length; i++) {
            if(m < num[i]) {
                m = num[i];
            }
            else {
                return false;
            }
        }
        return true;
    }
}
