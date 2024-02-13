package P8;
import java.util.Scanner;
public class GajiKaryawan_04 {
    public static void main(String[] args) {
        Scanner Ahmad = new Scanner(System.in);
        Scanner Fadlih = new Scanner(System.in);
        Scanner Wahyu = new Scanner(System.in);
        System.out.println("==UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1G==\n");
        System.out.println("dibuat oleh : Ahmad Fadlih Wahyu Sardana \n");
        System.out.println("NIM         : 2341720069 \n" );
        System.out.println("==========================================\n");
        String nama04,pilihan04,pilihan204,menu04,pilihan0304,alamat04;
        double nohp04,penjualan04,masakerja04,cuti04,tunjangan04,sepeda04,totalGaji04;
        double totalpenjualan;
        sepeda04 =1500000;
        double komisi04 = 0;
        String pilihan0404;
        boolean lanjut = true;
    while (lanjut) {
        System.out.println("Pilihan Menu\n");
        System.out.println("1. Data Karyawan\n");
        System.out.println("2. Gaji Karyawan \n");
        System.out.println("menu: ");
        pilihan04 = nextLine();
        switch (pilihan04) {
        case "1":
        System.out.println("=========================");
        System.out.println("DATA KARYAWAN");
        System.out.println("=========================");
        System.out.print("Masukkan Nama Karyawan : ");
        nama04 = Ahmad.nextLine();
        System.out.print("Masukkan Alamat Karyawan : ");
        alamat04 = Ahmad.nextLine();
        System.out.print("Masukkan Nomor Handphone Karyawan : ");
        nohp04 = Ahmad.nextInt();
        System.out.print("Jumlah Penjualan Sepeda : ");
        penjualan04 = Ahmad.nextInt();
        System.out.print("Masa kerja : ");
        masakerja04 = Ahmad.nextInt();
        System.out.print("Lama Cuti : ");
        cuti04 = Ahmad.nextInt();
        
        totalpenjualan =penjualan04*sepeda04;
        if ((komisi04==2%penjualan04)) {
            if (komisi04==5%totalpenjualan) {}
        } 
        

        System.out.println("kembali ke menu {y/t}");
        pilihan0304 = nextLine();
        if (pilihan0304.equalsIgnoreCase("t")){
            lanjut = false; }

        //case "2":
        //System.out.println("=========================");
        //System.out.println("DATA GAJI KARYAWAN");
        //System.out.println("=========================");
        //System.out.println("Nama Karyawan :" +nama04);
        //System.out.println("Komisi Penjualan :"+komisi04);
        //System.out.println("Tunjangan"+tunjangan04);
        //System.out.println("Gaji yang diterima :"+totalGaji04);
       // }
        //System.out.println("kembali ke menu {y/t}");
        //pilihan0404 = nextLine();
        //if (pilihan0404.equalsIgnoreCase("t")){
           // lanjut = false;
        

        } 
    }
}

    private static String nextLine() {
        return null;
    }


}


