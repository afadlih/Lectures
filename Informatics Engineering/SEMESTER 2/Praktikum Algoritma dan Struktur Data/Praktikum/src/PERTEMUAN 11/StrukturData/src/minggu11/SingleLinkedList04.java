package minggu11;

public class SingleLinkedList04 {
    Node04 head, tail;

    boolean isEmpty() {
        return head == null ;
    }

    void print() {
        if (!isEmpty()) {
            Node04 temp = head;
            System.out.print("Isi Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println(" ");
            } else {
                System.out.println ("Linked List Kosong ");
            }
        }
    

    void addFirst(int input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node04 ndInput = new Node04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node04 ndInput = new Node04(input, null);
        Node04 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("indeks tidak sesuai");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node04 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = new Node04(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("indeks tidak sesuai");
            }
        }
    }
}
