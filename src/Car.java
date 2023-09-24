public class Car {
  String make;
  String model;
  int year;
  String color;
  double price;

  public Car(String make, String model, int year, String color, double price) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.price = price;
  }

  void drive() {
    System.out.printf("Du fährst jetzt im %s... brumm, brumm...", this.make);
  }

  void brake() {
    System.out.println("Quiiiiieeeetschhhh...");
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
