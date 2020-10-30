public class Fleet {
    private Vehicle[] vehicles = new Vehicle[4];
    private int counter = 0;

    public void addVehicle(Vehicle vehicle) {
        vehicles[counter] = vehicle;
        counter++;
    }

    public void airConditionerOn() {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].setAirConditioning(true);
            vehicles[i].setAverageFuelConsumtion(vehicles[i].getActualBurn());
        }
    }

    public void showInfo() {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }

}

