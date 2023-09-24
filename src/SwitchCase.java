public class SwitchCase {
  public static void main(String [] args) {
    String day = "Sunday";

    switch(day) {
      case "Sunday":
        System.out.println("Es ist Sonntag!");
        break;
      case "Monday":
        System.out.println("Es ist Montag");
        break;
      default:
        System.out.println("Heute ist kein Tag!");
    }
  }
}
