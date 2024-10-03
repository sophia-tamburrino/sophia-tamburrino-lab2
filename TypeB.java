import java.util.*;

public class TypeB extends Thing { 

    //modified based on type
    //which randomly chooses left, right or straight every 10th round
    public TypeB(int r, int c, char l) {
        super(r, c, l);
      }

    @Override
    public void maybeTurn(Random num) {
        int i = num.nextInt(3);
            this.timeSinceLast++;
            if (this.timeSinceLast == 10) {
            this.timeSinceLast = 0;

            if (i == 1) {
                rightTurn();
            }

            if (i == 2) {
                leftTurn();
            }
        }
    }
}
