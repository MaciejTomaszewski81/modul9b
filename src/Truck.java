public class Truck extends Car {
    private double weight;

    public Truck(String name, double capacity, double averageFuelConsumtion, boolean airConditioning, double weight) {
        super(name, capacity, averageFuelConsumtion, airConditioning);
        this.weight = weight;
    }

    @Override
    public double getActualBurn() {
        if (airConditioning) {
            return getAverageFuelConsumtion() + 1.6 + (weight / 100) * 0.5;
        } else {
            return super.getActualBurn() + (weight / 100) * 0.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " Masa pojazdu " + weight;
    }
}
