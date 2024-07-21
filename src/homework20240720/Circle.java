package homework20240720;

public class Circle extends Shape {

    private double r;


    public Circle(String name , double r){
        super(name);
        this.r = r;
    }


    @Override
    public double area(){

        return Math.PI*Math.pow(r,2);

    }

}
