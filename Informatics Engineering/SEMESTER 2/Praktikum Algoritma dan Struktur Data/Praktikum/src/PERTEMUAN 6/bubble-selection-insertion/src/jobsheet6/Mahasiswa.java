package jobsheet6;

public class Mahasiswa {
    String nama;
    int thNMasuk, umur;
    double ipk;

    Mahasiswa (String n, int t, int u, double i) {
        nama = n;
        thNMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + thNMasuk);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
    }
    
}
