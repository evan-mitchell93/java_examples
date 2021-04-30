import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Triangle implements Shape {

    private int x[];
    private int y[];
    private Color c;

    public Triangle(){
        this.x = new int[3];
        this.y = new int[3];
    }
    @Override
    public void setColor(Color c) {
        this.c = c;
        
    }

    @Override
    public void setPosition(int x, int y) {
        Random rnd = new Random();
        //randomize x values
        this.x[0] = rnd.nextInt((300-10) + 10);
        this.x[1] = rnd.nextInt((300-10) + 10);
        this.x[2] = rnd.nextInt((300-10) + 10);

        //randomize y values
        this.x[0] = rnd.nextInt((300-10) + 10);
        this.y[1] = rnd.nextInt((300-10) + 10);
        this.y[2] = rnd.nextInt((300-10) + 10);

        
    }

    @Override
    public void draw(Graphics g) {
       g.setColor(c);
       g.fillPolygon(x, y, 3);
        
    }
    
}
