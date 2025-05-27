import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int count = 0;
        for(int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
        System.out.print("Enter number for checking number of occurrences: ");
        int number = input.nextInt();
        System.out.println("Number of occurrences of element " + number + " is " + counting(num,number,size));
    }
    public static int counting(int[] num, int val,int size) {
        int c = 0;
        for(int i = 0; i < size; i++) {
            if(num[i] == val) {
                c++;
            }
        }
        return c;
    }
}
