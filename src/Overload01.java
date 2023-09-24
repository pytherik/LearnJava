public class Overload01 {
  public static void main(String[] args) {
    // overloaded methods = methods that share the same name
    //                      but have different parameters
    //                      method name + parameters = method signature

    System.out.println(add(3, 4)); ;
    System.out.println(add(3, 4, 5)); ;
    System.out.println(add(3, 4, 5, 6)); ;

    System.out.println(add(3.23, 4,12)); ;
    System.out.println(add(3.23, 4.12, 5)); ;
    System.out.println(add(3.23, 4.12, 5, 6)); ;
  }
  static int add (int a, int b) {
    return a + b;
  }
  static int add (int a, int b, int c) {
    return a + b + c;
  }
  static int add (int a, int b, int c, int d) {
    return a + b + c + d;
  }
  static double add (double a, double b) {
    return a + b;
  }
  static double add (double a, double b, double c) {
    return a + b + c;
  }
  static double add (double a, double b, double c, double d) {
    return a + b + c + d;
  }
}
