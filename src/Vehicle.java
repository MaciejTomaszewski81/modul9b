public class Vehicle {
    private String name;
    private double capacity;
    private double averageFuelConsumtion;

    public Vehicle(String name, double capacity, double averageFuelConsumtion) {
        this.name = name;
        this.capacity = capacity;
        this.averageFuelConsumtion = averageFuelConsumtion;
    }

    public double getRange() {
        return (capacity * 100) / getActualBurn();
    }

    public double getActualBurn() {
        return averageFuelConsumtion;
    }

    public double getAverageFuelConsumtion() {
        return averageFuelConsumtion;
    }

    public void setAverageFuelConsumtion(double averageFuelConsumtion) {
        this.averageFuelConsumtion = averageFuelConsumtion;
    }

    public void setAirConditioning(boolean airConditioning) {
    }

    @Override
    public String toString() {
        return "Nazwa pojazdu " + name + " Pojemność baku: " + capacity +
                " średnie spalanie: " + getAverageFuelConsumtion();
    }
}
