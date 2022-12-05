public class Car extends  AbstractVehicle{
    private int numberOfDoors;
    private double carPrice;

    String type = getType();
    int numberOfWheels=getNumberOfWheels();
    public Car(String type,int numberOfWheels, int numberOfDoors,double carPrice) {
        super(type, numberOfWheels);
        this.numberOfDoors=numberOfDoors;
        this.carPrice=carPrice;

    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The number of doors are " +numberOfDoors);
    }

    @Override
    void doVehicleSound() {
        System.out.println("Clacson");
    }
}
