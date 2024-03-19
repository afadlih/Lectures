package Minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung: ");
        int iJml = sc04.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + " : ");
            int iNilai = sc04.nextInt();
            fk[i].nilai = iNilai;
        }
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakn Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));

        }
        sc04.close();
    }
}
