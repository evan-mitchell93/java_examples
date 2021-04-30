import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape {

    private int radius;
    private int x, y;
    private Color c;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void setColor(Color c) {
        this.c = c;
        
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y= y;
        
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(x,y, radius,radius);
    }
    
}
