import java.awt.*;
import java.util.Scanner;

public class Licence {
    String name;
    static int minAgeForDrive = 18;
    int age;
    String driveLicence;
    public boolean nameCheck(String name) {
        //this pointer
        if(this.name == name) {
            return true;
        }
        return false;
    }
    public boolean isAllowedForDrive(int age) {
        return age >= minAgeForDrive;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Licence driver = new Licence();
        // non static variable access.
        driver.driveLicence = "1/jan/2004";
        // static variable access.
        System.out.println("Age for licence: " + minAgeForDrive);
        System.out.println("Enter driver age: ");
        driver.age = in.nextInt();
        if (driver.isAllowedForDrive(driver.age)) {
            System.out.println(driver.age + " Age is valid for licence.");
        }
        else {
            System.out.println(driver.age + " Age not Valid for licence.");
        }
    }
}
