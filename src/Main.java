public class Main {
  public static void main(String [] args) {
    Garage garage = new Garage();
    Car car = new Car("Trabi");
    Car car2 = new Car("Bully");

    garage.park(car);
    garage.park(car2);
  }
}
