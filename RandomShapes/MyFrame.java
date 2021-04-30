import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    
    public MyFrame(){
        setTitle("Shapes");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Circle c1 = new Circle(20);
        c1.setPosition(100,100);
        c1.setColor(Color.ORANGE);
        c1.draw(g2d);


        Rectangle r1 = new Rectangle(10,50);
        r1.setColor(Color.RED);
        r1.setPosition(220, 75);
        r1.draw(g2d);
    }
}
