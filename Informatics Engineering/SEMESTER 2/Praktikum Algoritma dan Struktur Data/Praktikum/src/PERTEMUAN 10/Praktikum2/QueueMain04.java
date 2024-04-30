package Praktikum2;

import java.util.Scanner;

public class QueueMain04 {
    public static void menu (){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Terbelakang");
        System.out.println("6. Keluar");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.print("Masukkan jumlah kapasitas queue: ");
        int jumlah = sc04.nextInt();
        Nasabah04 antri = new Nasabah04 (jumlah);
        int pilih;
        do {
            menu();
            pilih = sc04.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor rekening: ");
                    String noRek = sc04.next();
                    System.out.print("Masukkan nama: ");
                    String nama = sc04.next();
                    System.out.print("Masukkan alamat: ");
                    String alamat = sc04.next();
                    System.out.print("Masukkan umur: ");
                    int umur = sc04.nextInt();
                    System.out.print("Masukkan saldo: ");
                    double saldo = sc04.nextDouble();
                    Nasabah04 nb = new Nasabah04(noRek, nama, alamat, umur, saldo);
                    sc04.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    Nasabah04 data = antri.dequeue();
                    if (!"".equals(data.noRek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.noRek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                antri.peekRear();
                break;
                case 6:
                System.out.println("Terima kasih");
                System.exit(0);
                break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
