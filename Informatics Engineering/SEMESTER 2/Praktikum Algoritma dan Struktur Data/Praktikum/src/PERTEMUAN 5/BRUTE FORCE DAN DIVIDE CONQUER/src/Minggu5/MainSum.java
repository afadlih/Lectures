package Minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9M)");
        System.out.print("Masukkan Jumlah Perusahaan: ");
        int jumlahperusahaan = sc.nextInt();

        double[][] keuntunganPerusahaan = new double[jumlahperusahaan][];

        for (int i = 0; i < jumlahperusahaan; i++) {
            System.out.print("Masukkan Jumlah Bulan untuk Perusahaan ke-" + (i + 1) + ": ");
            int JumBulan = sc.nextInt();
            keuntunganPerusahaan[i] = new double[JumBulan];

            for (int j = 0; j < JumBulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " untuk Perusahaan ke-" + (i + 1) + " = ");
                keuntunganPerusahaan[i][j] = sc.nextDouble();
            }
        }

        System.out.println("==================================");
        System.out.println("Algoritma Brute Force");

        for (int i = 0; i < jumlahperusahaan; i++) {
            double totalKeuntunganBF = Sum.totalBF(keuntunganPerusahaan[i]);
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) + " adalah = " + totalKeuntunganBF);
        }

        System.out.println("==================================");
        System.out.println("Algoritma Divide Conquer");

        for (int i = 0; i < jumlahperusahaan; i++) {
            double totalKeuntunganDC = Sum.totalDC(keuntunganPerusahaan[i], 0, keuntunganPerusahaan[i].length - 1);
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) + " adalah = " + totalKeuntunganDC);
        }

        sc.close();
    }
}