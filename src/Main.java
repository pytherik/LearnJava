public class Main {
  public static void main(String [] args) {
    String name = "Matula";
    String emptyString = "";
    String blankString;


    System.out.println("\nEquals");
    Boolean isEqual = name.equals("matula");
    System.out.println(isEqual);
    isEqual = name.equalsIgnoreCase("matula");
    System.out.println(isEqual);

    System.out.println("\ncharAt(0) indexOf('M')");
    System.out.println(name.charAt(0));
    System.out.println(name.indexOf("M"));

    System.out.println("\nisEmpty() isBlank()");
    System.out.println(name.isEmpty());
    System.out.println(name.isBlank());

    System.out.println(emptyString.isEmpty());
    System.out.println(emptyString.isBlank());

    System.out.println("\ntoUpperCase() toLowerCase()");
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    
    System.out.println("\nreplace");
    System.out.println(name.replace("a", "A"));
    // System.out.println(blankString.isEmpty());  geht nicht!
    // System.out.println(blankString.isBlank());
  }
}
