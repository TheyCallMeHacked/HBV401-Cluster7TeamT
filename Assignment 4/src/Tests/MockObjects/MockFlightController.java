public class MockFlightController implements ServiceController {
    public MockFlight[] search(String query) {
        return new MockFlight[0];
    }
    public MockFlight[] recommend(Service[] trip) {
        return new MockFlight[0];
    }
    public void addFlight(MockFlight flight) {
        return;
    }
    public void removeFlight(MockFlight flight) {
        return;
    }
    public Booking book(specialNeeds sn, User user) {
        return new Booking();
    }
}
