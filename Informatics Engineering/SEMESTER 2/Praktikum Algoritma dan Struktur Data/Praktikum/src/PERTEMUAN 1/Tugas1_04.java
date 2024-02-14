public class Tugas1_04 {

    public static void main(String[] args) {
        // Array kode plat mobil
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G','H' ,'L', 'N', 'T'};

        // Array nama kota
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        // Input kode plat nomor dari pengguna
        System.out.print("Masukkan kode plat nomor: ");
        String kodePlat = System.console().readLine();

        // Cari indeks kode plat di array KODE
        int idxKode = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat.charAt(0)) {
                idxKode = i;
                break;
            }
        }

        // Jika kode plat tidak ditemukan
        if (idxKode == -1) {
            System.out.println("Kode plat tidak ditemukan!");
            return;
        }

        // Cetak nama kota
        System.out.println("Kota: " + new String(KOTA[idxKode]));
    }
}
