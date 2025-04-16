public class Booking {
    private String flightId;
    private String passengerName;

    public Booking(String flightId, String passengerName) {
        this.flightId = flightId;
        this.passengerName = passengerName;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    @Override
    public String toString() {
        return String.format("Passenger: %s | Flight ID: %s", passengerName, flightId);
    }
}