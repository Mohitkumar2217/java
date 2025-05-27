import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int num = input.nextInt();
        int[] arr = {23,34,54,1232,546,123,12};
        boolean check = search(arr, num);
        if(check) {
            System.out.println("Number is found.");
        }
        else {
            System.out.println("Number is not found.");
        }
    }
    public static boolean search(int[] arr, int val) {
        int i = 0;
        while(i < 7) {
            if(arr[i] == val) {
                return true;
            }
            i++;
        }
        return false;
    }
}
