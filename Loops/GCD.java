import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number for GCD: ");
        int first = in.nextInt();
        System.out.print("Enter second number for GCD: ");
        int second = in.nextInt();
        int gcd = GCDof(first, second);
        System.out.println("GCD of " + first + " and " + second + " is " + gcd);
    }
    public static int GCDof(int first, int second) {
        int Gcd = 1;
        if(first < second) {
            int i = 1;
            while(i <= first) {
                if(first % i == 0 && second % i == 0) {
                    Gcd = i;
                }
                i++;
            }
        }
        else {
            int i = 1;
            while(i <= second) {
                if(first % i == 0 && second % i == 0) {
                    Gcd = i;
                }
                i++;
            }
        }
        return Gcd;
    }
}
