import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter for factorial: ");
        int number = in.nextInt();
        int fac = factorial(number);
        System.out.println("Factorial of " + number + " is " + fac);
    }
    public static int factorial(int num) {
        int fac = 1, i = 1;
        while(i <= num) {
            fac = fac * i;
            i++;
        }
        return fac;
    }
}
