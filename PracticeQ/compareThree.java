import java.util.Scanner;

public class compareThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,num3;
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println(num1 + " is greatest");
            }
            else {
                System.out.println(num3 + " is greatest");
            }
        }
        else {
            if(num2 > num3) {
                System.out.println(num2 + " is greatest");
            }
            else {
                System.out.println(num3 + " is greatest");
            }
        }
    }
}
