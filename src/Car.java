public class Car {
  String description;

  Car(String description) {
    this.description = description;
  }
  void startEngine() {
    System.out.println("Engine started......");
  }
  void drive() {
    System.out.println("Driving.....");
  }
  protected void runEngine() {
    System.out.println("Engine running.");
  }
}
