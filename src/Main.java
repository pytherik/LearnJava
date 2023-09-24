public class Main {
  public static void main(String[] args) {
    Food food1 = new Food("pizza");
    Food food2 = new Food("chips");
    Food food3 = new Food("chocolate");

    Food[] refrigerator = {food1, food2, food3};

//    Food[] refrigerator = new Food[3];

//    refrigerator[0] = food1;
//    refrigerator[1] = food2;
//    refrigerator[2] = food3;

    for (Food food : refrigerator) System.out.println(food);
  }
}
