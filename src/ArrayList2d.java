import java.util.*;

public class ArrayList2d {
  // 2D ArrayList = a dynamic list of lists
  // You can change the size of these lists during runtime
  public static void main(String[] args) {

    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

    ArrayList<String> bakeryList = new ArrayList<>();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");
    System.out.println(bakeryList);

    ArrayList<String> produceList = new ArrayList<>();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    produceList.add("peppers");
    System.out.println(produceList);

    ArrayList<String> drinksList = new ArrayList<>();
    drinksList.add("beer");
    drinksList.add("water");
    System.out.println(drinksList);

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    System.out.println(groceryList);
    System.out.println(groceryList.get(2).get(0));
    
    ArrayList<ArrayList<String>> grid2d = new ArrayList<>();
    ArrayList<String> xAxis = new ArrayList<>();
    Random rand = new Random();
    String item = "";

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        item = rand.nextBoolean() ? " * ": "   ";
        xAxis.add(item);
      }
      grid2d.add((ArrayList<String>) xAxis.clone());
      xAxis.clear();
    }
    for(ArrayList line: grid2d) {
      System.out.println();
      for(Object el : line) System.out.print(el);
    }
  }
}
