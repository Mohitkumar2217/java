import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age != 18) {
            if (age > 18) {
                System.out.println("Adult");
            }
            if (age < 18) {
                System.out.println("Minor");
            }
        }
        if(age == 18) {
            System.out.println("Major");
        }
        // >=,<=,!=,==,>,<
    }
}
