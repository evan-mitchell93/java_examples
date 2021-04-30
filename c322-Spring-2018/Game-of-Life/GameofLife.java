/**
 * Created by Evan on 2/23/2018.
 */

import java.awt.*;
import java.awt.event.*;


public class GameofLife implements Board {


    public Tile[][] start = new Tile[256][256]; //Grid of colors

    public void fillGrid() { //initialize the grid with all dead/white tiles
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                start[i][j] = new Tile(i,j);
            }
        }
    }


    public GameofLife() {

    }

    public void meh(MouseEvent e){
        int x = e.getX()/5;
        int y = e.getY()/5;
        start[x][y].c = Color.GREEN;//set clicked tile to live/green
    }

    @Override
    public void keh(KeyEvent keyEvent) {
        
    }

    @Override
    public void aeh(ActionEvent actionEvent){
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                start[i][j].checkNeighbors(start);

            }
        }

        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                start[i][j].liveOrDie();
            }
        }

    }
    public void draw(Graphics g){//draw the grid with the correct colors
        g.setColor(Color.WHITE);
        for(int i = 0; i < 256; i++){
            for(int j = 0; j < 256; j++){
                g.setColor(start[i][j].c);
                g.fillRect(i * 5,j * 5,4,4);
            }
        }
    }

    public static void main(String[] args){
        Engine en = new Engine(new GameofLife());
        en.start(50,500);
    }
}