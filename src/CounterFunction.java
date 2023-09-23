public class CounterFunction {
  public static void main(String[] args) {
    counter();
  }
  public static void counter() {
    int count = 0;
    while(count < 10) {
      count++;
      System.out.println(count);
    }
  }
}