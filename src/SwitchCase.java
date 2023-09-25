import java.util.Random;

public class SwitchCase {
  public static void main(String [] args) {
    Random rand = new Random();
    String[] days = {"mo", "di", "mi", "do", "fr", "sa", "so"};
    String day = days[rand.nextInt(days.length)];

    switch(day) {
      case "so":
        System.out.println("Es ist Sonntag!");
        break;
      case "mo":
        System.out.println("Es ist Montag");
        break;
      case "di":
        System.out.println("Es ist Dienstag!");
        break;
      case "mi":
        System.out.println("Es ist Mittwoch");
        break;
      case "do":
        System.out.println("Es ist Donnerstag!");
        break;
      case "fr":
        System.out.println("Es ist Freitag");
        break;
      case "sa":
        System.out.println("Es ist Sonnabend!");
        break;
      default:
        System.out.println("Heute ist kein Tag!");
    }
  }
}
