import java.util.Scanner;

public class CounterScanInt {
  public static void main(String[] args) {
    int count = 0;
    int value = 1;
    while (value == 1) {
      System.out.println("ich brauche input!");
      Scanner scan = new Scanner(System.in);
      value = scan.nextInt();
    }
  }
}
