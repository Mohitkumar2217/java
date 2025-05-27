import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int sum = 1, add = 1;
        if(num == 1) {
            System.out.println("1 ");
        }
        else {
            System.out.print("1 ");
            for(int i = 0; i <= num; i++) {
                int prev = add;
                System.out.print(add + " ");
                add = sum + add;
                sum = prev;
            }
        }
    }
}
