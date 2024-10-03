import java.util.*;

public class ThingList {

    public class Node {
        public Thing data;
        public Node next;
    }

    public Node head;

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
            //i think? 
            it.next.data = a;
        }
    }
}
