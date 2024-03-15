public class MockHotel extends Service{
  private DateTime checkIn;
  private DateTime checkOut;
  public DateTime getCheckIn(){return checkIn;}
  public DateTime getCheckOut(){return checkOut;}
  public void SetCheckIn(DateTime checkin){ this.checkIn = checkin; }
  public void SetCheckOut(DateTime checkOut){ this.checkOut = checkOut; }
}
