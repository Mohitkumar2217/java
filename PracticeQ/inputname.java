import java.util.Scanner;
public class inputname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to intelij code");
    }

    public static class Swap {
        public static void main(String[] args) {
            int num1 = 4;
            int num2 = 5;
            System.out.print("Value of num1 ");
            System.out.print(num1);
            System.out.print(" and num2 ");
            System.out.println(num2);
            System.out.println("Swapping...");
            int num;
            num = num1;
            num1 = num2;
            num2 = num;
            System.out.print("Now value of num1 " + num1 + " and num2 " + num2);
        }
    }
}