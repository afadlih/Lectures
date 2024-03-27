package Minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc04.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc04.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc04.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
            png[i].nilai = nilai;
            png[i].pangkat = pangkat;
        }

        System.out.println("Pilih metode yang ingin digunakan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("=================================="+ "\nMasukkan nomor metode yang ingin digunakan: ");
        int metode = sc04.nextInt();

        switch (metode) {
            case 1:
                System.out.println("HASIL - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].PangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL - DIVIDE CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].PangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Metode yang dipilih tidak valid.");
                break;
        }

        sc04.close();
    }
}
