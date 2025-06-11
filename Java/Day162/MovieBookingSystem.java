import java.util.*;

class Movie {
    String title;
    int duration;
    int totalSeats;
    int bookedSeats;

    public Movie(String title, int duration, int totalSeats) {
        this.title = title;
        this.duration = duration;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public boolean bookTicket() {
        if (bookedSeats < totalSeats) {
            bookedSeats++;
            return true;
        }
        return false;
    }

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }
}

class BookingSystem {
    private Map<String, Movie> movies = new HashMap<>();

    public void addMovie(Movie movie) {
        movies.put(movie.title, movie);
        System.out.println("Added movie: " + movie.title);
    }

    public void bookTicket(String title) {
        Movie m = movies.get(title);
        if (m != null) {
            if (m.bookTicket()) {
                System.out.println("Booked 1 ticket for " + title + ".");
            } else {
                System.out.println("No available seats for " + title + ".");
            }
        } else {
            System.out.println("Movie not found.");
        }
    }

    public void showAvailableSeats(String title) {
        Movie m = movies.get(title);
        if (m != null) {
            System.out.println("Available seats for " + title + ": " + m.getAvailableSeats());
        } else {
            System.out.println("Movie not found.");
        }
    }

    public void listAllMovies() {
        System.out.println("All Movies:");
        for (Movie m : movies.values()) {
            System.out.println("Title: " + m.title + ", Duration: " + m.duration + " min, Available Seats: " + m.getAvailableSeats());
        }
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();
        system.addMovie(new Movie("Interstellar", 169, 100));
        system.addMovie(new Movie("Inception", 148, 100));

        system.bookTicket("Inception");
        system.showAvailableSeats("Inception");
        system.listAllMovies();
    }
}