package homework20240707;

public class Dog extends Animal{


    public Dog(String name, int age, Color color, Breed breed) {
        super(name, age, color, breed);
    }

    @Override
    public String speak(){

        return "meong meong";
    }


}
