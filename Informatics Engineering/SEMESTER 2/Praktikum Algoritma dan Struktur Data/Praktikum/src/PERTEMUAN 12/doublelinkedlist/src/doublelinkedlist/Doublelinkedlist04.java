package doublelinkedlist;

public class Doublelinkedlist04 {
    Node04 head;
    int size;

    public Doublelinkedlist04() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node04(null, item, null);
        } else {
            Node04 newNode = new Node04(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node04 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node04 newNode = new Node04(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node04 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node04 newNode = new Node04(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node04 newNode = new Node04(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                newNode.next.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node04 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    
}
