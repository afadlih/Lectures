package jobsheet6;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi List = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Dewi", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Susi", 2019, 21, 3.75);

        List.tambah(m1);
        List.tambah(m2);
        List.tambah(m3);
        List.tambah(m4);
        List.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting");
        List.tampil();

        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan IPK");
        List.bubbleSort();
        List.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK");
        List.selectionSort();
        List.tampil();

        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan IPK");
        List.insertionSort();
        List.tampil();

    }
}
