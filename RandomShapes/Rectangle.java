import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shape {
    private int width, height;
    private Color c;
    private int x, y;
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void setColor(Color c) {
       this.c = c; 
    }

    @Override
    public void setPosition(int x, int y) {
       this.x = x;
       this.y = y; 
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, width, height);
    }
    
}
