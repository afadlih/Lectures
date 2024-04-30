package Praktikum2;

public class Nasabah04 {
    String noRek;
    String nama;
    String alamat;
    int umur;
    double saldo;

    public Nasabah04(String noRek, String nama, String alamat, int umur, double saldo) {
        this.noRek = noRek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    Nasabah04() {
    }

    Nasabah04[] data;
    int front;
    int rear;
    int size;
    int max;

    public Nasabah04(int n) {
        max = n;
        data = new Nasabah04[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].noRek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue Masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].noRek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].noRek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                    + data[i].saldo);
            System.out.println("Jumlah elemen: " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(Nasabah04 dt) {
        if (isFull()) {
            System.out.println("Queue penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        data[rear] = dt;
        size++;
    }

    public Nasabah04 dequeue() {
        Nasabah04 dt = new Nasabah04();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

}