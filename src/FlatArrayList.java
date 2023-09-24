import java.util.ArrayList;
import java.util.Collections;

public class FlatArrayList {
  public static void main(String[] args) {
    // ArrayList
    // - a resizable array.
    // - Elements can be added and removed
    //   after compilation phase
    // - store reference data types

    ArrayList<String> food = new ArrayList<String>();

    food.add("pizza");
    food.add("hamburger");
    food.add("hotdog");


    System.out.format("Die länge einer ArrayList wird mit .size() ermittelt: %d\n", food.size());

    System.out.println("\nIterieren mit for(Type item : ArrayList)\n");
    for (Object eat : food) {
      System.out.println(eat);
    }

    Collections.sort(food);
    System.out.println("\nCollection.sort(food):\n");
    iterate(food);

    food.set(0, "sushi");
    food.remove(2);
    // oder
    System.out.println("\nIterieren mit der .get(index) Methode: \n");
    for (int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }
    food.clear();
    
    System.out.println("\nnach .clear(): keine Fehlermeldung!\n");
    iterate(food);
  }
  public static void iterate(ArrayList food) {
    for (Object eat : food) {
      System.out.println(eat);
    }

  }
}
