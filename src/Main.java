public class Main {
  public static void main(String [] args) {
    Car car = new Car(250, "lightblue", 4);
    Bicycle bike = new Bicycle(50, "green", true);

    car.go();
    bike.go();

    car.stop();
    bike.stop();

    System.out.println(car.speed);
    System.out.println(bike.speed);

    System.out.println(car);
    System.out.println(bike);
  }
}
