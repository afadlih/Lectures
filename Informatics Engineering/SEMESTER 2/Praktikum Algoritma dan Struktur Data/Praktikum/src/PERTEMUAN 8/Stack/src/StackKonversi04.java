public class StackKonversi04 {
    int size04;
    int[] tumpukanBiner;
    int top;

    public StackKonversi04() {
        this.size04 = 32;
        tumpukanBiner = new int[size04];
        int top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size04 - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
            System.out.println("Data " + data + " berhasil ditambahkan");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            System.out.println("Stack Kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            System.out.println("Data " + data + " berhasil dihapus");
            return data;
        }
    }

}
