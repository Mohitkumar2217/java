import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        System.out.println(P * T * R / 100);
    }
}
