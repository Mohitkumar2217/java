import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for reverse it's digits: ");
        int number = in.nextInt();
        int reverseNumber = reverse(number);
        System.out.println("Reverse of " + number + " is " + reverseNumber);
    }
    public static int reverse(int num) {
        int rev = 0;
        while(num != 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        return rev;
    }
}
