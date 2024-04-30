import java.util.Scanner;

public class Utama04 {
    public static void main(String[] args) {
        Scanner Input04 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = Input04.nextInt();
        Gudang04 gudang = new Gudang04(kapasitas);

        Scanner input04 = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Operasi: ");
            int pilihan = input04.nextInt();

            switch (pilihan) {
            case 1:
                System.out.print("Masukkan Kode barang: ");
                int kode = input04.nextInt();
                input04.nextLine();
                System.out.print("Nama barang: ");
                String nama = input04.nextLine();
                System.out.print("Kategori barang: ");
                String kategori = input04.nextLine();
                Barang04 barang = new Barang04(kode, nama, kategori);
                gudang.tambahBarang(barang);
                break;
            case 2:
                gudang.ambilBarang();
                break;
            case 3:
                gudang.tampilkanBarang();
                break;
            case 4:
                gudang.lihatBarangTeratas();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid, Silahkan Coba Lagi!");
                break;
            }
        }
    }
}
