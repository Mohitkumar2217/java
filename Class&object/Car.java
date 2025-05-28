public class Car {
    int noOfWheels;
    String color;
    float currentFuel;
    float maxSpeed;
    static int noOfCarSold = 0;
    {
        System.out.println("I am in instance variable code block.");
    }
    static {
        noOfCarSold++;
        System.out.println("I am in static variable code block");
    }
    Car() {
        color = "Black";
        currentFuel += 5;
        noOfWheels = 4;
    }
    Car(String color, float fuel) {
        this.color = color;
        currentFuel += fuel;
        noOfWheels = 4;
    }
    public Car start() {
        if(currentFuel >= 2) {
            System.out.println("Start the car");
        }
        return this;
    }
    public void drive() {
        System.out.println("Car is driving.");
        currentFuel--;
    }
    //this pointer use
    public void reFuel(float fuel) {
        this.currentFuel += fuel;
    }
    public float fuelStatus() {
        return currentFuel;
    }
}