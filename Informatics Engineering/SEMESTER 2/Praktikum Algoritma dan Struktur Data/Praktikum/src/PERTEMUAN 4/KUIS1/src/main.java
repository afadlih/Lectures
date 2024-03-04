import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        Obat04[] obatList = new Obat04[5];
        for (int i = 0; i < obatList.length; i++) {
            obatList[i] = new Obat04();
            System.out.println("Masukkan nama obat: ");
            obatList[i].nama = input04.nextLine();
            System.out.println("Masukkan kategori obat: ");
            obatList[i].kategori = input04.nextLine();
            System.out.println("Masukkan stok obat: ");
            obatList[i].stok = input04.nextInt();
            System.out.println("Masukkan jumlah obat terjual: ");
            obatList[i].jumlah = input04.nextInt();
            input04.nextLine();
        }
        int i=0;
        for ( i = 0; i < obatList.length; i++) {
            obatList[i].tampil();
            obatList[i].hitungSisa();
            obatList[i].cariObatTidakTerjual();
            input04.close();
        }
        Obat04.daftarObat(obatList);

    }
}
