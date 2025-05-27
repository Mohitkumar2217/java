import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        declareOfArray(num, size);
        System.out.print("Enter number for delete: ");
        int val = input.nextInt();
        delete(num, val);
    }
    public static void declareOfArray(int[] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
    }
    public static void delete(int[] num,int val) {
        int[] num2 = new int[num.length - 1];
        int j = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] != val) {
                num2[j] = num[i];
                j++;
            }
        }
        System.out.print("New updated array is: ");
        for(int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]+" ");
        }
    }
}
