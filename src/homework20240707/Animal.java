package homework20240707;

public class Animal {

    String name;
    int age;
    Color color;
    Breed breed;


    public Animal(String name, int age, Color color, Breed breed) {
        this.name = name;
        if (age <= 0) {
            throw new IllegalArgumentException("age cannot be under 0");
        }
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

            this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String speak(){
        return null;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + age +
                ", color=" + color +
                ", breed=" + breed ;
    }


}
