public class Obat04 {
    String nama;
    String kategori;
    int stok;
    int jumlah;

    public Obat04() {
    }

    public Obat04(String nama, String kategori, int stok, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.jumlah = jumlah;
    }

    void tampil() {
        System.out.println("=====================================");
        System.out.println("Daftar Obat");
        System.out.println("Nama Obat: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Jumlah Terjual: " + jumlah);
        System.out.println("=====================================");
    }

    int hitungSisa() {
        int sisaStok = stok - jumlah;
        System.out.println("Sisa stok " + nama + ": " + sisaStok);
        return sisaStok;
    }

    void cariObatTidakTerjual() {
        if (jumlah == 0) {
            System.out.println("-------------------------------------");
            System.out.println("Obat " + nama + " tidak terjual");
        }
    }

    static void  daftarObat(Obat04[] obatList) {
        System.out.println("Daftar Obat");
        
        for (int i = 0; i < obatList.length - 1; i++) {
            for (int j = 0; j < obatList.length - i - 1; j++) {
                if (obatList[j].nama.compareTo(obatList[j + 1].nama) < 0) {
                    Obat04 temp = obatList[j];
                    obatList[j] = obatList[j + 1];
                    obatList[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < obatList.length; i++) {
            System.out.println("=====================================");
            System.out.println("Nama Obat: " + obatList[i].nama);
            System.out.println("Kategori: " + obatList[i].kategori);
            System.out.println("Stok: " + obatList[i].stok);
            System.out.println("Jumlah: " + obatList[i].jumlah);
            System.out.println("=====================================");
        }
    }
}
