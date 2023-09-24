public class Vehicle {
  double speed;
  String color;

  Vehicle(double speed, String color) {
    this.speed = speed;
    this.color = color;
  }

  public String toString() {
    return String.format("Speed: %.2f\nColor: %s", this.speed, this.color);
  }
  void go() {
    System.out.println("Jetzt geht es looos...");
  }
  
  void stop() {
    System.out.println("Warum halten wir denn?");
  }
  
}
