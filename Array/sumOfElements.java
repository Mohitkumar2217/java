import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int sum = 0;
        for(int i = 0; i < size; i++) {
            num[i] = input.nextInt();
            sum = sum + num[i];
        }
        System.out.println("Sum of elements is: " + sum);
    }
}
