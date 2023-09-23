import java.util.Scanner;

public class Party extends Counter {
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
      Party.count++;
    }
    public static void abmelden() {
      Party.count--;
    }
    public static void beenden() {
    Party.next = false;
    }
    public static void partyStatus() {
    String result = Party.next ? String.format("Anzahl Gäste: %d", Party.count): "Party is over!";
    System.out.println(result);
    }
}
