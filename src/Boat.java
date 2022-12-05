public class Boat extends AbstractVehicle{
    private double maxKnotSpeed;
    private int boatKilosWeight;

    private String type =getType();
    private int numberOfWheels=getNumberOfWheels();

    public Boat(String type, int numberOfWheels,double maxKnotSpeed,int boatKilosWeight) {
        super(type, numberOfWheels);
        this.maxKnotSpeed=maxKnotSpeed;
        this.boatKilosWeight=boatKilosWeight;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
    }

    public String getBoatWeightAndSpeed(){
        return maxKnotSpeed + " "+ boatKilosWeight;
    }


    @Override
    void doVehicleSound() {
        System.out.println("Boat sound,i don't know");
    }
}
