public class Main {
  public static void main(String [] args) {
    //wiki printf() = an optional method to control, format and display
    //                text to the console window
    //                two arguments = format string + (object/variable/value)
    //                % [flags] [precision] [width] [conversion-character]
    // conversion-characters:
    // %d     - decimals
    // %f     - float and doubles
    // %.2f   - limits precision to 2 digits after decimal portion
    // %05.2f - 123,000000 -> 0123,00
    // %s     - strings
    // %Ns    - adds N - string.length whitespace chars before or after (-N)
    // %c     - characters
    // %b     - booleans
    // more at https://www.javatpoint.com/java-string-format

    int intOut = 123;
    double doubleOut = 12.3;
    float floatOut = 123;
    String stringOut = "halloihralle";

    System.out.println("\nString-Interpolation mit System.out.printf()\n");
    System.out.printf("Interpolation integer: %d\n", 123); // %d for decimal
    System.out.printf("              float  : %07.2f\n", floatOut); // %d for decimal
    System.out.printf("              double : %.2f\n", doubleOut); // %d for decimal
    System.out.printf("              string : %s\n", stringOut); // %d for decimal
    System.out.printf("\nall together now:\nstring : %s\nfloat  : %.2f\ndouble : %.2f\ninteger: %d\n",
            stringOut, floatOut, doubleOut, intOut); // %d for decimal
    System.out.println("\nDas gleiche funktioniert auch mit System.out.format()\n");
    System.out.format("all together now:\nstring : %s\nfloat  : %.2f\ndouble : %.2f\ninteger: %d\n",
            stringOut, floatOut, doubleOut, intOut); // %d for decimal

    System.out.println("\nUnd mit vorheriger Deklaration String fString = String.format()\n");
    String formattedString = String.format("\nall together now:\nstring : %s\nfloat  : %.2f\ndouble : %.2f\ninteger: %d\n",
            stringOut, floatOut, doubleOut, intOut); // %d for decimal
    System.out.println(formattedString);
  }
}
