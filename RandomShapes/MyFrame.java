import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class MyFrame extends JFrame implements KeyListener {
    
    ArrayList<Rectangle> rects;
    ArrayList<Circle> circles;
    ArrayList<Triangle> triangles;

    public MyFrame(){
        this.rects = new ArrayList<Rectangle>();
        this.circles = new ArrayList<Circle>();
        this.triangles = new ArrayList<Triangle>();

        addKeyListener(this);
        setTitle("Shapes");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //draw all the rectangles
        for(Rectangle r : rects){
            r.draw(g2d);
        }
        //draw all the circles
        for(Circle c : circles){
            c.draw(g2d);
        }

        for(Triangle t : triangles){
            t.draw(g2d);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //if r is released, create a new rectangle with random color, size, position
        // add it to the the list of rectangles and redraw
        if(e.getKeyCode() == KeyEvent.VK_R){
            Random rnd = new Random();
            int w = rnd.nextInt((100- 10) + 10);
            int h = rnd.nextInt((100 - 10) + 10);
            Rectangle r = new Rectangle(w, h);
            r.setColor(new Color(rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat()));
            r.setPosition(rnd.nextInt((300-10) + 10), rnd.nextInt((300 - 10) + 10));
            this.rects.add(r);
            repaint();

        }
        //if c is released create a new circle with random color,radius, position
        //add it to the list of circles and redraw
        if(e.getKeyCode() == KeyEvent.VK_C){
            Random rnd = new Random();
            int rad = rnd.nextInt((100- 10) + 10);
            Circle c = new Circle(rad);
            c.setColor(new Color(rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat()));
            c.setPosition(rnd.nextInt((300-10) + 10), rnd.nextInt((300 - 10) + 10));
            this.circles.add(c);
            repaint();

        }

        //if t is released create a new triangle with random color and points
        //add it to the list of triangles and redraw
        if(e.getKeyCode() == KeyEvent.VK_T){
            Random rnd = new Random();
            Triangle t = new Triangle();
            t.setColor(new Color(rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat()));
            t.setPosition(0,0);
            this.triangles.add(t);
            repaint();

        }
        
    }
}
