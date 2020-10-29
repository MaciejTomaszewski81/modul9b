public class Car extends Vehicle {
    private boolean airConditioning;

    public Car(String name, double capacity, double averageFuelConsumtion, boolean airConditioning) {
        super(name, capacity, averageFuelConsumtion);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Klimatyzacja " + airConditioning;
    }
}
