public class Swap {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        System.out.println("Value of num1 " + num1 + " and num2 " + num2 );
        System.out.println("swapping...");
        int num;
        num = num1;
        num1 = num2;
        num2 = num;
        System.out.println("New value of num1 " + num1 + " and num2 " + num2 );
    }
}
