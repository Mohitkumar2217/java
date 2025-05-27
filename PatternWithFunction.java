import java.util.Scanner;

public class PatternWithFunction {
    public static void main(String[] args) {
        System.out.println("Pattern one:");
        patternOne();
        System.out.println("Pattern two:");
        patternTwo();
        System.out.println("Pattern three:");
        patternThree();
    }
    public static void patternOne() {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }
    public static void patternTwo() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void patternThree() {
        System.out.println("* * * * *");
        System.out.println("  * * * *");
        System.out.println("    * * *");
        System.out.println("      * *");
        System.out.println("        *");
    }
}
