/**
 * Created by epmitche on 3/2/18.
 */

import java.awt.*;


public class Tile {
    int x, y;
    Color c;
    int liveNeighbors;

    public Tile(int x, int y){
        this.x = x;
        this.y = y;
        this.c = Color.WHITE;
        this.liveNeighbors = 0;
    }

    public void checkNeighbors(Tile[][] start){
        int counter = 0;
        if(outOfBounds(x - 1, y - 1) == 1){
            if (start[x-1][y-1].c.equals(Color.GREEN)){
                counter++;
            }
        }
        if (outOfBounds(x-1, y) == 1){
            if (start[x-1][y].c.equals(Color.GREEN)){
                counter++;
            }
        }
        if (outOfBounds(x-1, y+1) == 1){
            if (start[x-1][y+1].c.equals(Color.GREEN)){
                counter++;
            }
        }
        if (outOfBounds(x, y-1) == 1){
            if (start[x][y-1].c.equals(Color.GREEN)){
                counter++;
            }
        }
        if (outOfBounds(x, y+1) == 1){
            if (start[x][y+1].c.equals(Color.GREEN)){
                counter++;
            }
        }
        if (outOfBounds(x+1, y-1) == 1){
            if (start[x+1][y-1].c.equals(Color.GREEN)){
                counter++;
            }
        }
        if (outOfBounds(x+1, y) == 1){
            if (start[x+1][y].c.equals(Color.GREEN)){
                counter++;
            }
        }
        if (outOfBounds(x+1, y+1) == 1){
            if (start[x+1][y+1].c.equals(Color.GREEN)){
                counter++;

            }
        }

        this.liveNeighbors = counter;
    }

    public void liveOrDie(){
        if (this.c.equals(Color.GREEN)){
            if (this.liveNeighbors < 2){
                this.c = Color.WHITE;
            } else if (this.liveNeighbors > 3){
                this.c = Color.WHITE;
            }
        } else {
            if (this.liveNeighbors == 3){
                this.c = Color.GREEN;
            }
        }
    }

    public int outOfBounds(int x, int y){
        if (x < 0 || x > 255){
            return 0;
        } else if (y < 0 || y > 255){
            return 0;
        } else {
            return 1;
        }
    }
}