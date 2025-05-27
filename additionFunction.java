import java.util.Scanner;

public class additionFunction {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.print("Please enter a two numbers for addition: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int sum = addition(first,second);
        System.out.println("Sum is : " + sum);
    }
    public static int addition(int first, int second) {
        int sum;
        sum = first + second;
        return sum;
    }
}
