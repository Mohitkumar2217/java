import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for checking palindrome or not: ");
        int number = in.nextInt();
        int reverseNumber = reverse(number);
        if(reverseNumber == number) {
            System.out.println(number + "is a palindrome");
        }
        else {
            System.out.println(number + "is not a palindrome");
        }
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
