public class Main {
  public static void main(String [] args) {

    Car myNewCar = new Car(
            "Trabant",
            "Rennpappe",
            1975,
            "Popelgrün",
            2567.34);
    myNewCar.drive();
    Human erik = new Human("Erik", 53, 115.0);
    System.out.println(erik.age);
    erik.eat();
    DiceRoller dice = new DiceRoller();

  }
}
