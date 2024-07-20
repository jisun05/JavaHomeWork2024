package homework20240713;

public class Car extends Vehicle{

    private int numberOfDoors;


    public Car(int wheel, String color, int capacityPerson, int numberOfDoors) {
        super(wheel, color, capacityPerson);
        this.numberOfDoors =numberOfDoors;
    }

    public Car(int numberOfDoors){
        super(4,"white",4);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive(){
        System.out.println("driving car");
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }



}
