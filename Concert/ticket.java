public class ticket extends payment {

  public ticket(int totalAmount) {
    super.setTotalAmount(getPrice() * getAmount());
  }

  private String type;
  private int amount;
  private int price;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
