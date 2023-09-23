import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    int counter = 0;
    String outString = "";
    String operator;

    while (counter < 10) {
      outString += String.format("-%d", counter);
      System.out.println(outString);
      Scanner readOperator = new Scanner(System.in);
      operator = readOperator.next();
      if(operator.isBlank()) {
        operator = "+";
      }
      if (Character.toString(operator.charAt(0)).equals("+")){
        counter++;
      } else {
        counter--;
      }
    }
  }
}
