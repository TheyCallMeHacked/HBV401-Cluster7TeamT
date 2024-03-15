public class MockTourController implements ServiceController{
  public MockTour[] search(str){ return new MockTour[0]; }
  public MockTour[] recommend(Trip){ return new MockTour[0] }
  public void addService(MockTour tour){ }
  public void removeService(MockTour tour){}
  public Booking book(specialNeeds, user){ return new Booking(); }
}
