import java.time.LocalDateTime;
public class MockFlight extends Service{
  private Location destination;
  private LocalDateTime date;
  private LocalDateTime duration;

  public Location getDestination(){return this.destination}
  public LocalDateTime getDate(){return this.date}
  public LocalDateTime getDuration(){return this.duration}

  public void setDestination(Location destination){this.destination = destination;}
  public void setDate(LocalDateTime date){this.date = date;}
  public void setDuration(LocalDateTime duration){this.duration = duration;}
}
