package homework20240713;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(2);
        Car car2 = new Car(4,"cream",4,5);


        car1.start();
        car2.drive();
        System.out.println(car1.getWheel());
        System.out.println(car1.getColor());
        System.out.println(car1.getNumberOfDoors());
        System.out.println(car1.getCapacityPerson());

        car2.setWheel(6);
        car2.setCapacityPerson(10);

        System.out.println(car2.getWheel());
        System.out.println(car2.getColor());
        System.out.println(car2.getNumberOfDoors());
        System.out.println(car2.getCapacityPerson());
    }

}
