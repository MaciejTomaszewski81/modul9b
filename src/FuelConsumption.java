public class FuelConsumption {
    public static void main(String[] args) {
        Vehicle maluch = new Car("Maluch", 45, 3.5, false);
        Vehicle polonez = new Car("Polonez", 35, 4.5, false);
        Vehicle iveco = new Truck("Iveco", 75, 7.5, false, 200);
        Vehicle man = new Truck("Man", 55, 6.5, false, 300);
        Fleet fleet = new Fleet();
        Fuel fuel = new Fuel();
        fuel.fuelUsageCar((Car) maluch);
        fuel.fuelUsageCar((Car) polonez);
        fuel.fuelUsageTruck((Truck) iveco);
        fuel.fuelUsageTruck((Truck) man);
        fleet.addVehicle(maluch);
        fleet.addVehicle(polonez);
        fleet.addVehicle(iveco);
        fleet.addVehicle(man);
        fleet.showInfo();
        fleet.airConditionerOn(fuel);
        fleet.showInfo();

    }
}
