package Minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9M)");
        System.out.print("Masukkan Jumlah Bulan: ");
        int elm = sc04.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("==================================");
        for (int i = 0; i < elm; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
            sm.Keuntungan[i] = sc04.nextDouble();
        }
        System.out.println("==================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + elm + " bulan adalah = " + sm.totalBF(sm.Keuntungan));
        System.out.println("==================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + elm + " bulan adalah = " + sm.totalDC(sm.Keuntungan, 0, elm - 1));
        sc04.close();
    }
}
