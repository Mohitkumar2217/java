import java.util.Scanner;
public class arithmaticInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of number one: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);
    }
}
