public class Main {
  // polymorphism = greek word for poly-"many", morph-"form"
  //                The ability of an object to identiy as more than one type
  public static void main(String [] args) {
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    Vehicle[] racers = {car, bicycle, boat};

   for (Vehicle racer: racers) racer.go();
  }
}
