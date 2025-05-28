import java.util.Scanner;

public class Driver {
    int age;
    String name;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // default constructor
        Car myCar = new Car();
        // constructor use
        // parameterized constructor
        Car mycar = new Car("red",5);
        // accessing data only.
        myCar.drive();
        if(myCar.fuelStatus() <= 5) {
            System.out.println("Car has low fuel");
            myCar.reFuel(5);
            System.out.println(myCar.fuelStatus());
        }
        System.out.println(myCar.fuelStatus());
        Car swift = new Car();
        swift.reFuel(3);
        /* Car startedCar =  swift.start();
         * startedCar.drive(); */
        swift.start().drive();

        // create object by  using class name only.
        Driver driver = new Driver();
        System.out.println("Enter your age");
        driver.age = in.nextInt();
        System.out.println("Enter your name");
        driver.name = in.next();
        Licence eligible = new Licence();
        if(eligible.isAllowedForDrive(driver.age)) {
            System.out.println(driver.name + " is eligible for licence. As his age is: " + driver.age);
        }
    }
}
