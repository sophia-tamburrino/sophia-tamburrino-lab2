import java.util.*;

public class TypeC extends Thing {
    
    //modified based on type
    //What exactly it does is up to you, but it needs to use some diagonal motion 
    //(i.e. left-right-left-right-… sequences, or draws a circle, triangle, or other shape). 
    public TypeC(int r, int c, char l) {
        super(r, c, l);
    }
    
    @Override
    public void maybeTurn(Random num) {
        int i = num.nextInt(3);
        if (i == 1) {
            rightTurn();
            step();
        }
        if (i == 2) {
            leftTurn();
            step();
        }
    }
}
