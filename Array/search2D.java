import java.util.Scanner;

public class search2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want in the 2d array: ");
        int size = input.nextInt();
        int[][] num = new int[size][size];
        declareOfArray(num, size);
        System.out.print("Enter element to search in this 2d array:");
        int target = input.nextInt();
        search(target,num);
    }
    public static void search(int target, int[][] num) {
        int indexI = -1, indexJ = -1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = target;
                indexI = i;
                indexJ = j;
            }
        }
        if(indexI == -1) {
            System.out.println("Element not present in array");
        }else {
            System.out.println("Enter element is at index: " + indexI + "," + indexJ);
        }
    }
    public static void declareOfArray(int[][] num, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                num[i][j] = input.nextInt();
            }
        }
    }
}
