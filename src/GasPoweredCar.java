public class GasPoweredCar extends Car {
  double avgKmPerLitre;
  int cylinders;
  GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }
}
