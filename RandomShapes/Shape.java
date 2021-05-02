import java.util.Random;

abstract class Shape implements Drawable {

    protected int xPos;
    protected int yPos;
    Random rnd;
    public Shape(){
        rnd = new Random();
        xPos = 0;
        yPos = 0;
    }

    abstract void setPos();


}
