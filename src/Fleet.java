public class Fleet {
    private Vehicle[] vehicles = new Vehicle[4];
    private int counter = 0;

    public void addVehicle(Vehicle vehicle) {
        vehicles[counter] = vehicle;
        counter++;
    }

    public void airConditionerOn(Fuel fuel) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getClass().equals(Car.class) && vehicles[i] != null) {
                ((Car) vehicles[i]).setAirConditioning(true);
                fuel.fuelUsageCar((Car)vehicles[i]);
            } else if (vehicles[i].getClass().equals(Truck.class) && vehicles[i] != null) {
                ((Truck) vehicles[i]).setAirConditioning(true);
                fuel.fuelUsageTruck((Truck)vehicles[i]);
            } else System.out.println("Zły typ pojazdu");
        }
    }

    public void showInfo() {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }
}
