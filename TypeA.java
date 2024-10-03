import java.util.*;


public class TypeA extends Thing {

  //modified based on type
  //which randomly choses left, right or straight at every round;

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
