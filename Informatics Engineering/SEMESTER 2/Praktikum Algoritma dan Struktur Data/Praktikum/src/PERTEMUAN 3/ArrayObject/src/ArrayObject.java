import java.util.Scanner;

public class ArrayObject {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc04 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc04.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc04.nextInt();
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
            System.out.println();

        }
        sc04.close();
    }
}
