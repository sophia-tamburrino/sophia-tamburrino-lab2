import java.util.*;

public class TypeB extends Thing { 

    //modified based on type
    //which randomly chooses left, right or straight every 10th round

    @Override
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

}
