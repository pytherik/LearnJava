import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    // exception = an event that occurs during the execution of a
    //             program that disrupts the normal flow

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Gib die zu teilende Zahl ein:");
      int x = scanner.nextInt();
      System.out.println("Gib eine ganze Zahl zum dividieren ein:");
      int y = scanner.nextInt();
      int z = x / y;

      System.out.println("Ergebnis: " + z);
    } catch (ArithmeticException e) {
      System.out.println("Du kannst nicht durch 0 teilen!");
    } catch (InputMismatchException e) {
      System.out.println("Du musst eine ganze Zahlen eingeben");
    } catch (Exception e) {
      System.out.println("Ein Fehler ist aufgetreten!");
    } finally {
      System.out.println("Ich komme immer wieder!");
    }
  }
}