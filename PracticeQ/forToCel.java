import java.util.Scanner;

public class forToCel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float F = in.nextFloat();
        float C = (F-32) * 5 / 9;
        System.out.println(C);
    }
}
