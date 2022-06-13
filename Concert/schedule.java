public class schedule extends ticket{
  private String time;
  private int availableSlot;
  
  public schedule(String time, int availableSlot, String ticketType) {
    this.time = time;
    this.availableSlot = availableSlot;
    super.setType(ticketType);
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
