public class Car extends Vehicle {
    boolean airConditioning;

    public Car(String name, double capacity, double averageFuelConsumtion, boolean airConditioning) {
        super(name, capacity, averageFuelConsumtion);
        this.airConditioning = airConditioning;

    }

    @Override
    public double getActualBurn() {
        if (airConditioning) {
            return getAverageFuelConsumtion() + 0.8;
        } else {
            return super.getActualBurn();
        }
    }

    @Override
    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Klimatyzacja " + airConditioning;
    }
}
