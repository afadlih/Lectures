package doublelinkedlist;

public class Node04 {
    int data;
    Node04 next, prev;

    Node04(Node04 prev, int data, Node04 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
