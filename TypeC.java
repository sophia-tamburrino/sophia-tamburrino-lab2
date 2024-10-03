import java.util.*;

public class TypeC extends Thing {
    
    //modified based on type
    //What exactly it does is up to you, but it needs to use some diagonal motion 
    //(i.e. left-right-left-right-… sequences, or draws a circle, triangle, or other shape). 
    
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
