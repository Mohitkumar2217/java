import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for checking prime or not: ");
        int num = in.nextInt();
        if(num == 1) {
            System.out.println("Not a prime no.");
        }
        else if(num <= 3) {
            System.out.println("Prime no.");
        }
        else if(Check(num)) {
            System.out.println("Prime no.");
        }
        else {
            System.out.println("Not prime no.");
        }
    }
    public static boolean Check(int num) {
        int i = 2;
        while (i <= num) {
            if(num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
