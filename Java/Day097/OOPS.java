package Java.Day097;

public class OOPS {
    public static void main(String args[]) {
        Vehicle v = new Vehicle();
        v.brand = "Honda";
        v.speed = 120;
        v.displayInfo();
    }
}

class Vehicle {
    String brand;
    int speed;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}