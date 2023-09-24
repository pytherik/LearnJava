public class Fish implements Prey, Predator{
  @Override
  public void hunt() {
    System.out.println("Der Fisch jagd....");
  }

  @Override
  public void flee() {
    System.out.println("Der Fisch flieht....");
  }
}
