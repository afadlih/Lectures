public class Buku04 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilinformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stok : " + stok);
        System.out.println("Harga : Rp " + harga);
        
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok habis!");
        }
    }
    void restok(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
    int hitungHargaTotal(int jml) {
        return harga * jml;
    }
    
    int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return (int) (hargaTotal * 0.12);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return (int) (hargaTotal * 0.05);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int hargaTotal, double diskon) {
        return hargaTotal - (int)diskon;
    }

    public Buku04(){

    }
    public Buku04(String jud , String pg , int hal , int stok , int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    

}
