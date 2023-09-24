import java.util.Random;

public class FlatArray {
  public static void main(String[] args) {
    String[] days = {"mo", "di", "mi", "do", "fr", "sa", "so"};
    Random rand = new Random();
    System.out.format("Zufallstag: %s\n", days[rand.nextInt(7)]);
    days[0] = "montag";
    for (String day : days) {
      System.out.println(day);
    }
  }
}
