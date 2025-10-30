package threads;
// MovieTheater class
class MovieTheater {
    int availableSeats;

    // Constructor
    MovieTheater(int s) {
        availableSeats = s;
    }

    // synchronized = only one thread can access this at a time
    public synchronized int bookTickets(int numOfSeats) {
        int numOfTicketsBooked = 0;

        // Book tickets one by one
        for (int i = 1; i <= numOfSeats; i++) {
            if (availableSeats > 0) {
                availableSeats--;
                numOfTicketsBooked++;
            }
        }

        return numOfTicketsBooked;
    }
}

// User class (Thread)
class User extends Thread {
    MovieTheater m;//reference movie theater obj
    int numOfTickets;
    int bookedTickets;

    // Constructor
    User(MovieTheater m, int numOfTickets, String name) {
        super(name); // set thread name
        this.m = m;
        this.numOfTickets = numOfTickets;
    }

    @Override
    public void run() {
        bookedTickets = m.bookTickets(numOfTickets);
        System.out.println(getName() + " has booked " + bookedTickets + " tickets");
    }
}

// Main class
public class Movie {
    public Movie() {

    }

    public static void main(String[] args) {
        // Create a MovieTheater with 15 available seats
        MovieTheater theater = new MovieTheater(15);

        // Create users
        User mina = new User(theater, 6, "Mina");
        User nabil = new User(theater, 2, "Nabil");
        User farhan = new User(theater, 4, "Farhan");

        // Start threads
        mina.start();
        nabil.start();
        farhan.start();

        // Wait for all threads to finish
        try {
            mina.join();
            nabil.join();
            farhan.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print remaining seats
        System.out.println("Available tickets: " + theater.availableSeats);
    }
}

