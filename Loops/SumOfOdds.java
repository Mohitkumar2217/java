import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for odds sum: ");
        int num = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            if(i % 2 != 0) {
                sum = sum +num;
            }
        }
        System.out.print("Sum is: " + sum);
    }
}
