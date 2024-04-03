package P7;

import java.util.Scanner;

public class BukuMain04 {
    public static void main(String[] args) {

        Scanner s4 = new Scanner(System.in);
        Scanner s04 = new Scanner(System.in);

        PencarianBuku04 data = new PencarianBuku04();
        int jumBuku = 5;

        System.out.println("------------------------------------");
        System.out.println("Masukkan Data BUku Secara Urut dari Kode Buku Terkecil");
        for(int i = 0; i < jumBuku; i++) {
            System.out.println("____________________________________");
            System.out.println("Masukkan Data Buku ke-" + (i+1));
            System.out.print("Kode Buku: ");
            int kode = s4.nextInt();
            System.out.print("Judul Buku: ");
            String judul = s04.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahun = s4.nextInt();
            System.out.print("Pengarang: ");
            String pengarang = s04.nextLine();
            System.out.print("Stock: ");
            int stock = s4.nextInt();

            Buku04 m = new Buku04(kode, judul, tahun, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("------------------------------------");
        System.out.println("Data Keseluruhan Buku ");
        data.tampil();

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.println("Kode Buku: ");
        int cari = s4.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        s04.close();
        s4.close();



    }
}
