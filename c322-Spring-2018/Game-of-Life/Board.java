
/**
 * Created by Evan on 2/23/2018.
 */

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.*;

public interface Board {
    public void aeh(ActionEvent actionEvent);
    public void meh(MouseEvent e);
    public void keh(KeyEvent e);
    public void draw(Graphics g);

    void fillGrid();
}