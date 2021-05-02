import java.awt.*;

public interface Drawable {
    public void setColor(Color c);
    abstract void draw(Graphics g);
}
