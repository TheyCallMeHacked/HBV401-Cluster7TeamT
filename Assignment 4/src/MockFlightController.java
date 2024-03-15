public class MockFlightController implements ServiceContoller {
    public Service[] search(String query) {
        return new Service[0];
    }

    public Service[] recommend(Trip trip) {
        return new Service[0];
    }


    public void addService(Service service) {
        return;
    }

    public void removeService(Service service) {
        return;
    }

    public Booking book(specialNeeds sn, User user) {
        return new Booking();
    }
}
