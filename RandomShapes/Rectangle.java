import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
    private int width, height;
    private Color c;
    
    public Rectangle(int width, int height){
        super();
        this.width = width;
        this.height = height;
    }
    @Override
    public void setColor(Color c) {
       this.c = c; 
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(xPos, yPos, width, height);
    }

    public void setPos(){
        xPos = rnd.nextInt((300-10) + 10);
        yPos = rnd.nextInt((300-10) + 10);
    }
    
}
