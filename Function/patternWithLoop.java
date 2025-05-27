import java.util.Scanner;

public class patternWithLoop{
    public static void main(String[] args) {
        System.out.println("Pattern one:");
        patternOne();
        System.out.println("Pattern two:");
        patternTwo();
        System.out.println("Pattern three:");
        patternThree();
    }
    public static void patternOne() {
        int rows = 0;
        while(rows < 5) {
            int n = rows + 1;
            while(n != 0) {
                System.out.print("* ");
                n--;
            }
            System.out.println();
            rows++;
        }
    }
    public static void patternTwo() {
        int rows = 5;
        while(rows > 0 ) {
            int n = rows;
            while(n != 0) {
                System.out.print("* ");
                n--;
            }
            System.out.println();
            rows--;
        }
    }
    public static void patternThree() {
        int rows = 5;
        int fix = 5;
        while(rows > 0) {
            int n = rows;
            int nu = fix - rows;
            while(nu != 0) {
                System.out.print("  ");
                nu--;
            }
            while(n != 0) {
                System.out.print("* ");
                n--;
            }
            System.out.println();
            rows--;
        }
    }
}
