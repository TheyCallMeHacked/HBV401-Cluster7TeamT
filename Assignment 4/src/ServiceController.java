public interface ServiceController {
    public Service[] search(String query);
    public Service[] recommend(Service[] trip);
    public void addService(Service service);
    public void removeService(Service service);
    public Booking book(specialNeeds sn, User user);
}
