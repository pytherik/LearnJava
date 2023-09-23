import javax.swing.JOptionPane;

public class FirstSwing {
  public static void main(String[] args) {

    String name = JOptionPane.showInputDialog("Dein Name bitte: ");
    int age = Integer.parseInt(JOptionPane.showInputDialog("Dein Alter bitte: "));
    double height = Double.parseDouble(JOptionPane.showInputDialog("Deine Größe bitte: "));

    JOptionPane.showMessageDialog(null, String
            .format("Hallo %s, du bist %d Jahre alt und %.2f m groß! ", name, age, height));
  }
}
