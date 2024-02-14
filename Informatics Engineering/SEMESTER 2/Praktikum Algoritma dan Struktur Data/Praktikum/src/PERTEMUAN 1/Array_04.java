import java.util.Scanner;

public class Array_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahMatkul;
        String[] namaMatkul;
        int[] sksMatkul;
        double[] nilaiAngka;
        String[] nilaiHuruf;
        double[] nilaiSetara;
        double ipSemester = 0;
        double totalSks = 0;

        // Input jumlah matakuliah
        System.out.print("Masukkan jumlah matakuliah: ");
        jumlahMatkul = input.nextInt();

        // Deklarasi array
        namaMatkul = new String[jumlahMatkul];
        sksMatkul = new int[jumlahMatkul];
        nilaiAngka = new double[jumlahMatkul];
        nilaiHuruf = new String[jumlahMatkul];
        nilaiSetara = new double[jumlahMatkul];

        // Input data matakuliah
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Matakuliah ke-" + (i + 1));
            System.out.print("Nama Matakuliah: ");
            namaMatkul[i] = input.next();
            System.out.print("SKS: ");
            sksMatkul[i] = input.nextInt();
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = input.nextInt();

            // Konversi nilai angka ke nilai huruf
            nilaiHuruf[i] = konversiNilaiHuruf((int) nilaiAngka[i]);

            // Konversi nilai huruf ke nilai setara
            nilaiSetara[i] = konversiNilaiSetara(nilaiHuruf[i]);

            totalSks += sksMatkul[i];
        }

        // Hitung IP semester
        for (int i = 0; i < jumlahMatkul; i++) {
            ipSemester += nilaiSetara[i] * sksMatkul[i];
        }

        ipSemester /= totalSks;

        // Tampilkan tabel hasil
        System.out.println("\n\n## Tabel Hasil");
        System.out.println("| Nama Matakuliah | SKS | Nilai Angka | Nilai Huruf | Nilai Setara |");
        System.out.println("|-----------------|-----|-------------|-------------|--------------|");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("| %-15s | %2d | %3d | %2s | %5.2f |\n", namaMatkul[i], sksMatkul[i], nilaiAngka[i],
                    nilaiHuruf[i], nilaiSetara[i]);
                System.out.printf("| %-15s | %2d | %3d | %2s | %5.2f |\n", namaMatkul[i], sksMatkul[i], nilaiAngka[i],
                        nilaiHuruf[i], nilaiSetara[i]);
            }
            System.out.println("\nIP Semester: " + ipSemester);
            System.out.println("\nIP Semester: " + ipSemester);
            input.close();
        }
    

    // Fungsi konversi nilai angka ke nilai huruf
    private static String konversiNilaiHuruf(int nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 73) {
            return "B+";
        } else if (nilaiAngka >= 65) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 39) {
            return "D";
        } else {
            return "E";
        }
    }

    // Fungsi konversi nilai huruf ke nilai setara
    private static double konversiNilaiSetara(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
                
            }
        } 
    }
