public class Vehicle {
    private String name;
    private double capacity;
    private double averageFuelConsumtion;
    private double calculateFuelConsumtion;

    public Vehicle(String name, double capacity, double averageFuelConsumtion) {
        this.name = name;
        this.capacity = capacity;
        this.averageFuelConsumtion = averageFuelConsumtion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getAverageFuelConsumtion() {
        return averageFuelConsumtion;
    }

    public double getCalculateFuelConsumtion() {
        return calculateFuelConsumtion;
    }


    public void setCalculateFuelConsumtion(double calculateFuelConsumtion) {
        this.calculateFuelConsumtion = calculateFuelConsumtion;
    }

    @Override
    public String toString() {
        return "Nazwa pojazdu " + name + " Pojemność baku: " + capacity +
                " średnie spalanie: " + calculateFuelConsumtion;
    }
}
