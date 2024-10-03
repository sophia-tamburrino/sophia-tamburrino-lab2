import java.util.*;

public class ThingList {

    private class Node {
        public Thing data;
        public Node next;
    }

    public Node head;

    public ThingList() {
        head = null;
    }

    public void addThing(Thing a) {
        if (head == null) {
            head = new Node();
            head.data = a;
            head.next = null;
        }
        else {
            Node it = head;
            while(it.next != null) {
                it = it.next;
            }
            Node newNode = new Node();
            newNode.data = a;
            it.next = newNode;
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
            it = it.next;
        }
    }
}
