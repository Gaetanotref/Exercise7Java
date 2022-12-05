abstract class AbstractVehicle {
    private String type;
    private int numberOfWheels;

    public AbstractVehicle(String type,int numberOfWheels){
        this.type=type;
        this.numberOfWheels=numberOfWheels;
    }
    public void showVehicleDetails(){
        System.out.println(type + " " + numberOfWheels);
    }
    public String getType(){
        return type;
    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    abstract void doVehicleSound();
}
