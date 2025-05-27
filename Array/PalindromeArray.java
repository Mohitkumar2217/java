import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        declareOfArray(num, size);
        int left = 0, right = num.length - 1, number = 0;
        while(left < right) {
            if (num[left] == num[right]) {
                number++;
            }
            left++;
            right--;
        }
        if(number == size / 2) {
            System.out.println("Palindrome array");
        }
        else {
            System.out.println("Not palindrome array.");
        }
    }
    public static void declareOfArray(int[] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
    }
}
