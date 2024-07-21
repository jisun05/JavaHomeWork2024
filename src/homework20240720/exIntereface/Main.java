package homework20240720.exIntereface;

import homework20240720.Circle;
import homework20240720.Rectangle;
import homework20240720.Shape;

public class Main {

    public static void main(String[] args){
        Playable game1 = new Game();
        Playable song1 = new Song();

        game1.play();
        song1.play();

        Shape circle = new Circle("circle",4);
        Shape rectangle = new Rectangle("rectangle",7,10);


        System.out.println(circle.area());
        System.out.println(rectangle.area());


    }
}
