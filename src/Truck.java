public class Truck extends Car {
    private double weight;

    public Truck(String name, double capacity, double averageFuelConsumtion, boolean airConditioning, double weight) {
        super(name, capacity, averageFuelConsumtion, airConditioning);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Masa pojazdu " + weight;
    }
}
