public class Bicycle extends Vehicle {

  boolean light;

  Bicycle(double speed, String color, boolean light){
    super(speed, color);
    this.light = light;
  }
  public String toString() {
    String vehicleAttr = super.toString();
    return vehicleAttr + "\nlight: " + this.light;
  }

}
