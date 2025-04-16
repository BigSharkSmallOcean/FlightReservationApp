public class Flight {
    private String flightId;
    private String source;
    private String destination;
    private String date;

    public Flight(String flightId, String source, String destination, String date) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.date = date;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("Flight ID: %s | From: %s | To: %s | Date: %s",
                flightId, source, destination, date);
    }
}