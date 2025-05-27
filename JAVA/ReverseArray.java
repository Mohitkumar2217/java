import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        declareOfArray(num, size);
        int[] newArr = new int[size];
        int j = 0;
        for(int i = num.length - 1; i >= 0; i--) {
            newArr[j] = num[i];
            j++;
        }
        System.out.print("Reversed array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static void declareOfArray(int[] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
    }
}
