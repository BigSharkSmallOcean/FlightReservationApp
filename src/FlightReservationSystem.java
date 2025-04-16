import java.util.*;

public class FlightReservationSystem {
    private List<Flight> flights;
    private List<Booking> bookings;

    public FlightReservationSystem() {
        flights = new ArrayList<>();
        bookings = new ArrayList<>();
        loadSampleFlights();
    }

    private void loadSampleFlights() {
        flights.add(new Flight("F101", "New York", "Los Angeles", "2025-04-20"));
        flights.add(new Flight("F102", "Chicago", "Miami", "2025-04-22"));
        flights.add(new Flight("F103", "Dallas", "San Francisco", "2025-04-25"));
    }

    public void displayAvailableFlights() {
        System.out.println("\n--- Available Flights ---");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public void bookFlight(Scanner scanner) {
        System.out.print("Enter Flight ID: ");
        String flightId = scanner.nextLine().trim();

        Flight selectedFlight = null;
        for (Flight flight : flights) {
            if (flight.getFlightId().equalsIgnoreCase(flightId)) {
                selectedFlight = flight;
                break;
            }
        }

        if (selectedFlight == null) {
            System.out.println("Flight ID not found. Please try again.");
            return;
        }

        System.out.print("Enter Passenger Name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Passenger name cannot be empty.");
            return;
        }

        Booking booking = new Booking(flightId, name);
        bookings.add(booking);
        System.out.println("Booking confirmed!");
    }

    public void viewBookings() {
        System.out.println("\n--- Your Bookings ---");
        if (bookings.isEmpty()) {
            System.out.println("No bookings have been made yet.");
            return;
        }
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}