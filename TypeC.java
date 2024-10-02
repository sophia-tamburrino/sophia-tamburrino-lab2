import java.util.*;

public class TypeC extends Thing {

    
      //modified based on type
      @Override
      public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
    
        if (t.isTypeB) {
          t.timeSinceLast++;
    
          if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;
    
            if (i == 1) {
              rightTurn(t);
            }
    
            if (i == 2) {
              leftTurn(t);
            }
          }
        } else   {
          if (i == 1) {
            rightTurn(t);
          }
    
          if (i == 2) {
            leftTurn(t);
          }
        }
      }

}
