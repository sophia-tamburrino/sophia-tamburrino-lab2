import java.util.*;

abstract class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public Random rand = new Random(System.currentTimeMillis());

    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab = 'r';
    public boolean isTypeB;
    
    public Thing (int r, int c, char l) {
        row = r;
        col = c;
        lab = l;
    }

    public void rightTurn() {
        this.dir = (this.dir + 1) % 4;
      }
    
    public void leftTurn() {
        this.dir = (this.dir + 3) % 4;
    }
    
    public void step() {
        final int[] dc = {
            0, 1, 0, -1
        }, dr = {
            1, 0, -1, 0
        };
        this.row += dr[this.dir];
        this.col += dc[this.dir];
    }

    public abstract void maybeTurn(Random num);
    
    public String toString() {
        return row + " " + col + " " + lab;
    }
  }
