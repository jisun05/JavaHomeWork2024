package homework20240707;


public class Cat extends Animal {


    public Cat(String name, int age, Color color, Breed breed) {
        super(name, age, color, breed);
    }

    @Override
    public String speak() {
        return "yaong";

    }

}
