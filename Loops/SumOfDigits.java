import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for digits sum: ");
        int num = in.nextInt();
        int n = num;
        int sum = 0;
        while(num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("Sum of digits of " + n + " is " + sum);
    }
}
