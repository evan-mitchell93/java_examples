/**
 * Created by Evan on 2/23/2018.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import static java.awt.event.InputEvent.SHIFT_DOWN_MASK;

public class Engine extends JComponent implements MouseListener,KeyListener, ActionListener {
    Timer timer;
    Board board;
    int ready = 0;

    public Engine(Board board){
        this.board = board;
        this.board.fillGrid();
        this.addMouseListener(this);
        this.addKeyListener(this);

    }

    public void start(int delay,int size){
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.add(this);
        this.setFocusable(true);
        f.setVisible(true);
        f.setSize(size,size);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.timer = new Timer(delay, this);
        this.timer.start();
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    public void mousePressed(MouseEvent e){
        this.board.meh(e);
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }


    public void paintComponent(Graphics g){
        this.board.draw(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        ready = 1;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
            if(ready == 1) {
                this.board.aeh(actionEvent);
                this.repaint();
            }


    }
}
