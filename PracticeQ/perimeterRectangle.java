import java.util.Scanner;

public class perimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float height = input.nextFloat();
        float width = input.nextFloat();
        System.out.println("Perimeter is: " + (2 * (height + width)));
    }
}
