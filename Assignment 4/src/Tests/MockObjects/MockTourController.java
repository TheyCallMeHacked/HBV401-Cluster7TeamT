public class MockTourController implements ServiceController{
  public MockTour[] search(String query){
    return new MockTour[0];
  }
  public MockTour[] recommend(Service[] trip){
    return new MockTour[0]
  }
  public void addService(MockTour tour){
    return;
  }
  public void removeService(MockTour tour){
    return;
  }
  public Booking book(specialNeeds sn, User user){ return new Booking(); }
}
