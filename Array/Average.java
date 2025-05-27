import java.util.Scanner;

public class Average {
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
        int avg = sum / size;
        System.out.println("Average of elements is: " + avg);
    }
}
