public class FuelConsumption {
    public static void main(String[] args) {
        Vehicle maluch = new Car("Maluch", 45, 3.5, false);
        Vehicle polonez = new Car("Polonez", 35, 4.5, false);
        Vehicle iveco = new Truck("Iveco", 75, 7.5, false, 1000);
        Vehicle man = new Truck("Man", 55, 6.5, false, 300);

        Fleet fleet = new Fleet();
        fleet.addVehicle(maluch);
        fleet.addVehicle(polonez);
        fleet.addVehicle(iveco);
        fleet.addVehicle(man);
        fleet.showInfo();
        System.out.println("Zasięg: " + maluch.getRange());
        fleet.airConditionerOn();
        fleet.showInfo();
        System.out.println("Zasięg: " + maluch.getRange());


    }
}
