import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1 for LCM: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2 for LCM: ");
        int num2 = in.nextInt();
        int lcm = LCMof(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    public static int LCMof(int num1, int num2) {
        int i = 1;
        while(true) {
            int factor = num1 * i;
            if(factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }
}
