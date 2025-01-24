package busres;
import java.util.Scanner;
import java.util.ArrayList;

public class busBooking {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>(); // Corrected ArrayList initialization
        ArrayList<Booking> bookings = new ArrayList<Booking>(); // Corrected ArrayList initialization
        buses.add(new Bus(1, true, 3));
        buses.add(new Bus(2, true, 3));
        buses.add(new Bus(3, true, 3));
        
        for(Bus b : buses) {
            b.displayBusInfo();
        }

        int useropt = 1;
        Scanner scanner = new Scanner(System.in);
        while(useropt == 1) {
            System.out.println("Enter 1 to book and 2 to exit");
            useropt = scanner.nextInt();
            if(useropt == 1) {
                System.out.println("Booking....");
                Booking booking = new Booking(); // Corrected variable name
                if(booking.isAvailable(bookings, buses)) { // Corrected variable name
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry bus full bro");
                }
            }                                       
        }
    }
}
