import java.util.Scanner;

public class Fungsi_04 {

    static int JUMLAH_CABANG = 4;
    static String[] NAMA_CABANG = { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" };
    static int[] HARGA_BUNGA = { 75000, 50000, 60000, 10000 };
    static String[] NAMA_BUNGA = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pendapatan setiap cabang
        System.out.println("Pendapatan setiap cabang:");
        for (int i = 0; i < JUMLAH_CABANG; i++) {
            int pendapatanCabang = hitungPendapatanCabang(i);
            System.out.println(NAMA_CABANG[i] + ": Rp" + pendapatanCabang);
        }

        // Menampilkan stok setiap jenis bunga
        System.out.println("\nStok setiap jenis bunga:");
        for (int i = 0; i < NAMA_BUNGA.length; i++) {
            int stokJenisBunga = hitungStokJenisBunga(i);
            System.out.println(NAMA_BUNGA[i] + ": " + stokJenisBunga);
        }

        // Mengurangi stok karena bunga mati
        int penguranganAglaonema = 1;
        int penguranganKeladi = 2;
        int penguranganAlocasia = 0;
        int penguranganMawar = 5;
        kurangiStok(penguranganAglaonema, penguranganKeladi, penguranganAlocasia, penguranganMawar);

        // Menampilkan stok setelah pengurangan
        System.out.println("\nStok setelah pengurangan:");
        for (int i = 0; i < NAMA_BUNGA.length; i++) {
            int stokJenisBunga = hitungStokJenisBunga(i);
            System.out.println(NAMA_BUNGA[i] + ": " + stokJenisBunga);
            scanner.close();
        }
    }

    static int hitungPendapatanCabang(int i) {
        int pendapatanCabang = 0;
        for (int j = 0; j < NAMA_BUNGA.length; j++) {
            pendapatanCabang += STOK_BUNGA[i][j] * HARGA_BUNGA[j];
        }
        return pendapatanCabang;
    }

    static int hitungStokJenisBunga(int i) {
        int stokJenisBunga = 0;
        for (int j = 0; j < JUMLAH_CABANG; j++) {
            stokJenisBunga += STOK_BUNGA[j][i];
        }
        return stokJenisBunga;
    }

    static void kurangiStok(int penguranganAglaonema, int penguranganKeladi, int penguranganAlocasia,
            int penguranganMawar) {
        STOK_BUNGA[0][0] -= penguranganAglaonema;
        STOK_BUNGA[0][1] -= penguranganKeladi;
        STOK_BUNGA[0][2] -= penguranganAlocasia;
        STOK_BUNGA[0][3] -= penguranganMawar;
    }

    // Array stok bunga
    static final int[][] STOK_BUNGA = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
}
