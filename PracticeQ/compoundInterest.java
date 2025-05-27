import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int R = input.nextInt();
        int t = input.nextInt();
        System.out.println(P * (1 + R/100)*t);
    }
}
