import java.util.Scanner;

public class aging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age >= 13) {
            if(age >= 20) {
                if(age >= 60) {
                    System.out.println("senior");
                }
                else {
                    System.out.println("adult");
                }
            }
            else {
                System.out.println("teen");
            }
        }
        else {
            System.out.println("child");
        }
    }
}
