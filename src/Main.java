public class Main {
    // overloaded constructors = multiple constructors within a class with
    //                           the same name, but have different parameters
    //                           name + parameters = signature
  public static void main(String [] args) {
    Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
    System.out.format("Das wird deine Pizza:\nBrot: %s\nKäse: %s\nSauce: %s\nTopping: %s\n\n",
            pizza.bread, pizza.cheese, pizza.sauce, pizza.topping);

    Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella");
    System.out.format("Das wird deine Pizza:\nBrot: %s\nKäse: %s\nSauce: %s\nTopping: %s\n\n",
            pizza1.bread, pizza1.cheese, pizza1.sauce, pizza1.topping);
    Pizza pizza2 = new Pizza("thick crust", "tomato");
    System.out.format("Das wird deine Pizza:\nBrot: %s\nKäse: %s\nSauce: %s\nTopping: %s\n\n"
            , pizza2.bread, pizza2.cheese, pizza2.sauce, pizza2.topping);
    Pizza pizza3 = new Pizza("thick crust");
    System.out.format("Das wird deine Pizza:\nBrot: %s\nKäse: %s\nSauce: %s\nTopping: %s\n\n"
            , pizza3.bread, pizza3.cheese, pizza3.sauce, pizza3.topping);
  }

}
