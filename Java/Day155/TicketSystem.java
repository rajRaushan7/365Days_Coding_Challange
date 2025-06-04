import java.util.*;

public class TicketSystem {
    private Set<Integer> bookedSeats;
    private final int TOTAL_SEATS = 10;

    public TicketSystem() {
        bookedSeats = new HashSet<>();
    }

    public void bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number.");
            return;
        }
        if (bookedSeats.contains(seatNumber)) {
            System.out.println("Seat " + seatNumber + " is already booked.");
        } else {
            bookedSeats.add(seatNumber);
            System.out.println("Seat " + seatNumber + " booked.");
        }
    }

    public void cancelSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            System.out.println("Invalid seat number.");
            return;
        }
        if (bookedSeats.contains(seatNumber)) {
            bookedSeats.remove(seatNumber);
            System.out.println("Seat " + seatNumber + " cancelled.");
        } else {
            System.out.println("Seat " + seatNumber + " is not booked.");
        }
    }

    public void viewBookedSeats() {
        System.out.print("Booked Seats: ");
        System.out.println(bookedSeats);
    }

    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.bookSeat(3);
        ts.bookSeat(5);
        ts.bookSeat(3);
        ts.cancelSeat(3);
        ts.cancelSeat(3);
        ts.viewBookedSeats();
    }
}