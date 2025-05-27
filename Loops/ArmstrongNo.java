import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for armstrong check: ");
        int number = in.nextInt();
        int digits = countDigits(number);
        int sum = 0,num = number;
        while(number != 0) {
            sum = sum + power(number % 10, digits);
            number = number / 10;
        }
        if(sum == num) {
            System.out.println("It's an armstrong number");
        }
        else {
            System.out.println("It's not an armstrong number");
        }
    }
    public static int countDigits(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static int power(int num, int powers) {
        int val = 1;
        while(powers != 0) {
            val = num*val;
            powers--;
        }
        return val;
    }
}
