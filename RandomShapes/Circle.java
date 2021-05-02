import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

    private int radius;
    private Color c;

    public Circle(int radius){
        super();
        this.radius = radius;
    }
    @Override
    public void setColor(Color c) {
        this.c = c;
        
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(xPos,yPos, radius,radius);
    }

    public void setPos(){
        xPos = rnd.nextInt((300-10) + 10);
        yPos = rnd.nextInt((300-10) + 10);
    }
    
}
