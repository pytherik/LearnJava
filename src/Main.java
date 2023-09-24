public class Main {
  public static void main(String [] args) {
    // wrapper class = provides a vay to use primitive data types as reference data types
    //                 reference data types contain useful methods
    //                 can be used with collections (ex.ArrayList)

    // primitve       wrapper
    // ¯¯¯¯¯¯¯¯       ¯¯¯¯¯¯¯
    // boolean        Boolean
    // char           Character
    // int            Integer
    // double         Double

    // autoboxing = the automatic conversion that the Java comiler
    //              makes between the primitive types and their
    //              corresponding object wrapper classes
    // unboxing   = the reverse of autoboxing. Automatic conversion
    //              of wrapper class to primitive

    // autoboxing:
    Boolean a = true;
    Character p = 'P'; // characters immer in single quotes!
    Integer i = 123;
    Double d = 3.14;
    String e = "Erik"; // no autoboxing, string ist schon ein reference type

    // unboxing
    // bei Gebrauch verhalten sich die Variablen wie primitive type

    if(a) {
      System.out.println("Das ist wahr!");
    }

    if (p.equals('P')) {
      System.out.println("Das ist auch wahr!");
    }
  }
}
