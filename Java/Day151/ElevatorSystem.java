package Java.Day151;

public class ElevatorSystem {
    public static void main(String[] args) {
        int[] requests = {3, 7, 2, 9};
        int currentFloor = 1;
        int totalMovement = 0;

        System.out.print("Visited floors: ");
        for (int floor : requests) {
            System.out.print(floor + " ");
            totalMovement += Math.abs(floor - currentFloor);
            currentFloor = floor;
        }

        System.out.println("\nTotal movement: " + totalMovement + " floors");
    }
}