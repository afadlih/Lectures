import java.util.Scanner;

public class Pemilihan_04 {
    Scanner input = new Scanner(System.in);
    static double nilaitugas = 0.2;
    static double nilaiuts = 0.3;
    static double nilaiuas = 0.4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        // Validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            // Hitung nilai akhir
            double nilaiAkhir = (tugas * nilaitugas) + (kuis * nilaitugas) + (uts * nilaiuts) + (uas * nilaiuas);

            // Konversi nilai huruf
            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 75) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C";
            } else {
                nilaiHuruf = "D";
            }

            // Cek keterangan lulus/tidak lulus
            String keterangan = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "TIDAK LULUS" : "LULUS";

            // Output hasil
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
            input.close();
        }
    }
}

    


    


