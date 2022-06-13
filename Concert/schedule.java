public class schedule extends ticket{
  private String time;
  private int availableSlot = 10;
  private int availableSlot2 = 10;

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

  public int getAvailableSlot2() {
    return availableSlot2;
  }

  public void setAvailableSlot2(int availableSlot2) {
    this.availableSlot2 = availableSlot2;
  }
}
