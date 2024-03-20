import java.time.LocalDateTime;

public class MockHotel extends Service{
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;
  public LocalDateTime getCheckIn(){return checkIn;}
  public LocalDateTime getCheckOut(){return checkOut;}
  public void SetCheckIn(LocalDateTime checkin){ this.checkIn = checkin; }
  public void SetCheckOut(LocalDateTime checkOut){ this.checkOut = checkOut; }
}
