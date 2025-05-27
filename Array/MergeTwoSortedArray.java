import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in both array: ");
        int size = input.nextInt();
        int[] num1 = new int[size];
        int[] num2 = new int[size];
        System.out.println("Please enter sorted array first...");
        declareOfArray(num1, size);
        System.out.println("Please enter sorted array second...");
        declareOfArray(num2, size);
        int left = 0, right = 0, common = 0;
        int s = size + size;
        int[] number = new int[s];
        while(left < size || right < size) {
            if(right == size || (left < size && num1[left] < num2[right])) {
                number[common] = num1[left];
                left++;
                common++;
            }
            else {
                number[common] = num1[right];
                right ++;
                common++;
            }
        }
        System.out.println("Merged array is..");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
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
