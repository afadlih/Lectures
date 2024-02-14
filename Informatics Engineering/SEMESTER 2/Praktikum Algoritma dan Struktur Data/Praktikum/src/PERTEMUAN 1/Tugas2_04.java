import java.util.Scanner;

public class Tugas2_04 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("Pilih rumus yang ingin dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("4. Keluar");

            // Membaca pilihan pengguna
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }

    static void hitungKecepatan() {
        // Membaca nilai jarak dan waktu
        System.out.print("Masukkan nilai jarak (meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan nilai waktu (sekon): ");
        double waktu = scanner.nextDouble();

        // Menghitung kecepatan
        double kecepatan = jarak / waktu;

        // Menampilkan hasil
        System.out.println("Kecepatan: " + kecepatan + " meter/sekon");
    }

    static void hitungJarak() {
        // Membaca nilai kecepatan dan waktu
        System.out.print("Masukkan nilai kecepatan (meter/sekon): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan nilai waktu (sekon): ");
        double waktu = scanner.nextDouble();

        // Menghitung jarak
        double jarak = kecepatan * waktu;

        // Menampilkan hasil
        System.out.println("Jarak: " + jarak + " meter");
    }

    static void hitungWaktu() {
        // Membaca nilai jarak dan kecepatan
        System.out.print("Masukkan nilai jarak (meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan nilai kecepatan (meter/sekon): ");
        double kecepatan = scanner.nextDouble();

        // Menghitung waktu
        double waktu = jarak / kecepatan;

        // Menampilkan hasil
        System.out.println("Waktu: " + waktu + " detik");
    }
}
