import java.util.*;

public class TypeA extends Thing { 

  //modified based on type
  //which randomly choses left, right or straight at every round;

  public TypeA(int r, int c, char l) {
    super(r, c, l);
  }

  @Override
  public void maybeTurn(Random num) {
    int i = num.nextInt(3);
        if (i == 1) {
          rightTurn();
        }

        if (i == 2) {
          leftTurn();
        }
  }

}
