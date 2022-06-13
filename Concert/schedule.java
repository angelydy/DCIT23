public class schedule extends ticket{
  private String time;
  private int availableSlot;

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
