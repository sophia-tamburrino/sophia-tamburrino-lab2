import java.util.*;

public class ThingList extends Thing {

    public class Node {
        public Thing data;
        public Node next;
    }

    public Node head;

    public ThingList() {
        head.data = null;
        head.next.data = null;
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
            it.next.data = a;
        }
    }

    public void printAll() {
        Node it = head;
        while(it != null) {
            System.out.println(it.data.toString());
            it = it.next;
        }
    }
    public void moveAll() {
        Node it = head;
        while(it != null) {
            maybeTurn(it.data);
            step(it.data);
        }
    }
}
