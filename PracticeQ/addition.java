import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Addition of number1 and number2: " );
        System.out.println(number1+number2);
    }
}
