public class Fuel {
    public void fuelUsageCar(Car car) {
        if (car.isAirConditioning()) {
            car.setCalculateFuelConsumtion(car.getAverageFuelConsumtion() + 0.8);
        } else {
            car.setCalculateFuelConsumtion(car.getAverageFuelConsumtion());
        }
    }

    public void fuelUsageTruck(Truck truck) {
        double tempFuelConsumption;
        if (truck.isAirConditioning()) {
            tempFuelConsumption = (truck.getAverageFuelConsumtion() + ((truck.getWeight() / 100) * 0.5) + 1.6);
        } else {
            tempFuelConsumption = (truck.getAverageFuelConsumtion() + ((truck.getWeight() / 100) * 0.5));
        }
        truck.setCalculateFuelConsumtion(tempFuelConsumption);
    }

    public double range(Vehicle vehicle) {
        double range = (vehicle.getCapacity() / vehicle.getCalculateFuelConsumtion()) * 100;
        return range;
    }
}
