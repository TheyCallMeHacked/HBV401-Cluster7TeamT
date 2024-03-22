public class MockHotelController implements ServiceController {
  public MockHotel[] search(String query){
    return new MockHotel[0];
  } 
  public MockHotel[] recommend(Service[] trip){
    return new MockHotel[0];
  } 
  public void addService(MockHotel hotel){
    return;
  }
  public void removeService(MockHotel hotel){
    return;
  }
  public Booking book(specialNeeds sn, User user){
    return new Booking();
  }
}
