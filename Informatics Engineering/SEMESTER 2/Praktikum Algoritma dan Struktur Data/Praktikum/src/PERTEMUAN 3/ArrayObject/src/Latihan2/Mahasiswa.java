package Latihan2;

public class Mahasiswa {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }

    public double HitungIPK(Mahasiswa[] mahasiswa) {
        double totalIPK = 0;
        for (Mahasiswa mhs : mahasiswa) {
            totalIPK += mhs.getIpk();
        }
        return totalIPK / mahasiswa.length;
    }

    public Mahasiswa IPKTertinggi(Mahasiswa[] mahasiswa) {
        Mahasiswa IPKTertinggi = mahasiswa[0];
        for (int i = 1; i < mahasiswa.length; i++) {
            if (mahasiswa[i].getIpk() > IPKTertinggi.getIpk()) {
                IPKTertinggi = mahasiswa[i];
            }
        }
        return IPKTertinggi;
    }
}
