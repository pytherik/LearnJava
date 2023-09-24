public class Main {
  public static void main(String [] args) {
    Car car1 = new Car("Volkswagen", "Bully", 1980);
    Car car2 = new Car(car1);

    //    Car car2 = new Car("Trabant", "Standard", 1975);
    //    car2.copy(car1);



    System.out.println(car1);
    System.out.println(car2);
    System.out.println();
    System.out.println(car1.getMake());
    System.out.println(car1.getModel());
    System.out.println(car1.getYear());
    System.out.println();
    System.out.println(car2.getMake());
    System.out.println(car2.getModel());
    System.out.println(car2.getYear());
  }
}
