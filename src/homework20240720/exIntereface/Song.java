package homework20240720.exIntereface;

public class Song implements Playable{
    @Override
    public void play() {
        System.out.println("start song");
    }
}
