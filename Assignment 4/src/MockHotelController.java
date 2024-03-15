public class MockHotelController implements ServiceController {
  public Hotel[] search(str){
    return new Hotel[0];
  } 
  public Hotel[] recommend(Trip){
    return new Hotel[0];
  } 
  public void addService(Hotel){
    return;
  }
  public void removeService(Hotel){}
  public Booking book(specialNeeds, user){
    return new Booking();
  }
}
