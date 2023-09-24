public class Main {
  // abstract = abstract classes cannot be instanciated
  //            but they can have subclasses
  //            abstract methods are declared without an
  //            implementation (that means they don't have a body)
  public static void main(String [] args) {

    Caravan caravan  = new Caravan();
    caravan.go();
  }
}
