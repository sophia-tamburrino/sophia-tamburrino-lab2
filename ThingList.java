import java.util.*;

public class ThingList{

    private class Node {
        public Thing data;
        public Node next;
    }

    public Node head;

    public ThingList() {
        head = new Node();
        head.next = new Node();
        head.data = new TypeA();
    }

    public Thing getData() {
        return head.data;
    }

    public void addThing(Thing a) {
        if (head == null) {
            head.data = a;
            head.next = null;
        }
        else {
            Node it = head;
            while(it.next != null) {
                it = it.next;
            }
            //i think? this doesnt make any sense to me rn 
            it.data = a;
        }
    }

    public void printAll() {
        Node it = head;
        while(it != null) {
            System.out.println(it.data.toString());
            it = it.next;
        }
    }
    
    public void moveAll(Random rand) {
        Node it = head;
        while(it != null) {
            it.data.maybeTurn(rand);
            it.data.step();
        }
    }
}
