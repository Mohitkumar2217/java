import java.util.Scanner;

public class oddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        if ((num1 & 1) == 1) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
