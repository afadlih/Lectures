package ArrayObject;

import java.util.Scanner;

public class ArrayObject {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int PersegiPanjang = sc04.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[PersegiPanjang];
        
        for (int i = 0; i < PersegiPanjang; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc04.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc04.nextInt();
            System.out.println();
        }

        for (int i = 0; i < PersegiPanjang; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
            System.out.println();
        }
        
        sc04.close();
    }
}