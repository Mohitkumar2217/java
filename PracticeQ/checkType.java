import java.util.Scanner;

public class checkType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num >= 0) {
            if(num > 0) {
                System.out.println("Number is positive");
            }
            else {
                System.out.println("Number is zero");
            }
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
