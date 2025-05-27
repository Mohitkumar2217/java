import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        if(marks >= 30) {
            if(marks >= 60) {
                if(marks >=75) {
                    if(marks >= 90) {
                        System.out.println("Grade is A");
                    }
                    else {
                        System.out.println("Grade is B");
                    }
                }
                else {
                    System.out.println("Grade is C");
                }
            }
            else {
                System.out.println("Grade is D");
            }
        }
        else {
            System.out.println("Grade is F");
        }
    }
}
