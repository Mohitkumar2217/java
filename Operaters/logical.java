import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 >= 10 && num2 >= 10) {
            System.out.println("Both are greater then 10");
        }
        if(num1 >= 10 || num2 >= 10) {
            System.out.println("At least one is greater then 10");
        }
        if(! (num1 >= 10)) {
            System.out.println("Num1 is less then 10");
        }
        else {
            System.out.println("Num1 is greater then 10");
        }
        if(! (num2 >= 10)) {
            System.out.println("Num2 is less then 10");
        }
        else {
            System.out.println("Num1 is greater then 10");
        }
    }
}
