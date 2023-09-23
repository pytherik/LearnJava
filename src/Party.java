import java.util.Scanner;

public class Party {
  static int guests = 0;
  static boolean next = true;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (next) {
      System.out.println("1: Gast anmelden\n2: abmelden\n3: beenden");
      int option = scan.nextInt();
      if (option == 1) {
        anmelden();
      } else if (option == 2) {
        abmelden();
      } else {
        beenden();
      }
      partyStatus();
    }
  }
    public static void anmelden() {
      Party.guests++;
    }
    public static void abmelden() {
      Party.guests--;
    }
    public static void beenden() {
    Party.next = false;
    }
    public static void partyStatus() {
    String result = Party.next ? String.format("Anzahl Gäste: %d", Party.guests): "Party is over!";
    System.out.println(result);
    }
}
