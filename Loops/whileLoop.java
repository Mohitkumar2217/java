import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int num1 = 1;
        while (num1 <= 10) {
            System.out.println(num1);
            num1 += 1;
        }
        int num2 = 500;
        while (num2 >= 100) {
            System.out.println(num2);
            num2 -= 10;
        }
        Scanner input = new Scanner(System.in);
        int i = 5;
        while(i != 0) {
            int num = input.nextInt();
            System.out.println("Number is: " + num);
            i--;
        }
    }
}