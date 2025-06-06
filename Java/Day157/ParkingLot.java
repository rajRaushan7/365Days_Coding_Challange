import java.util.*;

public class ParkingLot {
    private Set<String> parkedCars;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedCars = new LinkedHashSet<>();
    }

    public void parkCar(String regNo) {
        if (parkedCars.contains(regNo)) {
            System.out.println("Car " + regNo + " is already parked.");
        } else if (parkedCars.size() >= capacity) {
            System.out.println("Parking lot is full.");
        } else {
            parkedCars.add(regNo);
            System.out.println("Car " + regNo + " parked.");
        }
    }

    public void removeCar(String regNo) {
        if (parkedCars.remove(regNo)) {
            System.out.println("Car " + regNo + " removed.");
        } else {
            System.out.println("Car " + regNo + " not found.");
        }
    }

    public void viewParkedCars() {
        System.out.println("Parked Cars: " + parkedCars);
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(5);
        lot.parkCar("KA-01-HH-1234");
        lot.parkCar("KA-01-HH-9999");
        lot.parkCar("KA-01-HH-1234");
        lot.removeCar("KA-01-HH-0000");
        lot.removeCar("KA-01-HH-9999");
        lot.viewParkedCars();
    }
}