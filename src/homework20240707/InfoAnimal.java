package homework20240707;

public class InfoAnimal {
    //cat.speak();
    public static void main(String []args){

        Animal cat1 = new Cat("Simba", 7, Color.cream, Breed.ragdoll);
        Animal cat2 = new Cat("Momo", 8, Color.tabby, Breed.AmericanShorthair);
        Animal cat3 = new Cat("Cheshire cat", 159, Color.tabby, Breed.BritishShorthair);
        Animal dog1 = new Dog("choco",1,Color.brown, Breed.Poodle);
        Animal dog2 = new Dog("goldy",10,Color.gold, Breed.GoldenRetriever);

        System.out.println(cat1.toString()+ "\n" +cat2.toString()+ "\n" +cat3.toString());
        System.out.println(dog1.toString()+ "\n" +dog2.toString());

    }


}
