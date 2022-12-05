public class Tester {
    public static void main(String[] args) {
        //OBJECT INSTANCES
        Car car1 = new Car("Car",4,4,141854);
        Boat boat1 = new Boat("Boat",0,23,321);
        //CAR'S METHOD
        car1.showVehicleDetails();
        car1.doVehicleSound();
        //BOAT'S METHOD
        boat1.doVehicleSound();
        boat1.showVehicleDetails();
        System.out.println(boat1.getBoatWeightAndSpeed());

    }
}
