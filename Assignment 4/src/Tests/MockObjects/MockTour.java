import java.time.LocalDateTime;
public class MockTour extends Service{
  private Location destination;
  private LocalDateTime duration;

  public Location getDestination(){return this.destination}
  public LocalDateTime getDuration(){return this.duration}

  public void setDestination(Location destination){this.destination = destination;}
  public void setDuration(LocalDateTime duration){this.duration = duration;}
}
