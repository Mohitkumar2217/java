import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for table: ");
        int num = in.nextInt();
        int i = 1;
        while(i != 11) {
            System.out.println(num*i);
            i++;
        }
    }
}
