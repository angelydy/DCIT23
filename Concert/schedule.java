public class schedule{
  private String time;
  private int availableSlot;

  public schedule(String time, int availableSlot, String ticketType) {
    this.time = time;
    this.availableSlot = availableSlot;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public int getAvailableSlot() {
    return availableSlot;
  }

  public void setAvailableSlot(int availableSlot) {
    this.availableSlot = availableSlot;
  }
}
