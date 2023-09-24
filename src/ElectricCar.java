public class ElectricCar extends Car{
  double avgKmPerCharge;
  int batterySize;
  ElectricCar(String description, double avgKmPerCharge, int batterySize) {
    super(description);
    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }
}
