import java.util.*;

public class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public Random rand = new Random(System.currentTimeMillis());

    protected int  row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab = 'r';
    public boolean isTypeB;
    
    Thing t;

    public void setValues(int r, int c, char l, boolean b) {
        row = r;
        col = c;
        lab = l;
        isTypeB = b;
    }

    public void rightTurn() {
        t.dir = (t.dir + 1) % 4;
      }
    
    public void leftTurn() {
        t.dir = (t.dir + 3) % 4;
    }
    
    public void step() {
        final int[] dc = {
            0, 1, 0, -1
        }, dr = {
            1, 0, -1, 0
        };
        t.row += dr[t.dir];
        t.col += dc[t.dir];
    }

    public void maybeTurn(Random num) {
        int i = num.nextInt(3);

        if (t.isTypeB) {
            t.timeSinceLast++;

            if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;

            if (i == 1) {
                rightTurn();
            }

            if (i == 2) {
                leftTurn();
            }
            }
        } else   {
            if (i == 1) {
            rightTurn();
            }

            if (i == 2) {
            leftTurn();
            }
        }
    }
    
    public String toString() {
        return row + " " + col + " " + lab;
    }
  }
