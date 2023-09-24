public class Car extends Vehicle {
  int doors;

  Car(double speed, String color, int doors) {
    super(speed, color);
    this.doors = doors;
  }

  public String toString() {
    return super.toString() + "\ndoors: " + this.doors;
  }
}
