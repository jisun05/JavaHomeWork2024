package homework20240713;

public class Vehicle {

    private int wheel;
    private String color;
    private int capacityPerson;
    public Vehicle(int wheel, String color, int capacityPerson){

        this.wheel = wheel;
        this.color = color;
        this.capacityPerson = capacityPerson;

    }

    public void start(){
        System.out.println("start now!");
    }


    public int getWheel() {
        return wheel;
    }

    public String getColor() {
        return color;
    }

    public int getCapacityPerson() {
        return capacityPerson;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacityPerson(int capacityPerson) {
        this.capacityPerson = capacityPerson;
    }
}
