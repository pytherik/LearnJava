import javax.swing.JOptionPane;
import java.util.Scanner;

public class Hypotenuse {
  public static void main(String [] args) {
    double kathete;
    double ankathete;
    double hypotenuse;

    Scanner scan = new Scanner(System.in);
    kathete = Double.parseDouble(JOptionPane.showInputDialog("Kathete: "));
    ankathete = Double.parseDouble(JOptionPane.showInputDialog("Ankathete: "));
    hypotenuse = Math.sqrt(Math.pow(kathete, 2) + Math.pow(ankathete,2));
    JOptionPane.showMessageDialog(null,String.format("Hypothenuse = %.2f", hypotenuse));

    System.out.println("Kathete: ");
    kathete = scan.nextDouble();
    System.out.println("Ankathete: ");
    ankathete = scan.nextDouble();
    System.out.println(String.format("Hypothenuse = %.2f", Math.sqrt(Math.pow(kathete, 2) + Math.pow(ankathete,2))));
  }
}
