import java.util.ArrayList;
import java.util.Random;

public class VoidMethod {
  static ArrayList<String> names = new ArrayList<>();
  static Random rand = new Random();

  public static void main(String [] args) {
    names.add("Petra");
    names.add("Erik");
    names.add("Hansi");
    names.add("Maria");
    int idx = rand.nextInt(names.size());
    String name = names.get(idx);
    hello(name);

  }
  static void hello(String member) {
    System.out.format("Hello %s!\n", member);
    System.out.println("Members: ");
    for(Object name: names) System.out.println(name);
  }
}
