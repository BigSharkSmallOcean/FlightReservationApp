import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightReservationSystem system = new FlightReservationSystem();

        while (true) {
            System.out.println("\n========== Flight Reservation System (Flightex) ==========");
            System.out.println("1. View Available Flights");
            System.out.println("2. Book a Flight");
            System.out.println("3. View My Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    system.displayAvailableFlights();
                    break;
                case "2":
                    system.bookFlight(scanner);
                    break;
                case "3":
                    system.viewBookings();
                    break;
                case "4":
                    System.out.println("Thank you for using the Flightex");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}