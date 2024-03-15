public class MockHotelController implements FlightContoller {
    public Flight[] search(String query) {
        return new Flight[0];
    }

    public Flight[] recommend(Trip trip) {
        return new Flight[0];
    }


    public void addFlight(Flight flight) {
        return;
    }

    public void removeFlight(Flight flight) {
        return;
    }

    public Booking book(specialNeeds sn, User user) {
        return new Booking();
    }
}
