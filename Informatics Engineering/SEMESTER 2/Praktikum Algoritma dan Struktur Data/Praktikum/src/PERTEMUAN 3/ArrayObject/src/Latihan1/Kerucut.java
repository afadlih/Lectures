package Latihan1;

public class Kerucut {
    double jariJari;
    double tinggi;
    double luasPermukaan;
    double volume;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    void hitungLuasPermukaan(double jariJari, double tinggi) {
        luasPermukaan = (Math.PI * jariJari * (jariJari + Math.sqrt((jariJari * jariJari) + (tinggi * tinggi))));
    }
    void hitungVolume(double jariJari, double tinggi) {
        volume = (1.0 / 3.0 * Math.PI * jariJari * jariJari * tinggi);
    }

    void tampilKerucut() {
        System.out.println("Jari-jari kerucut: " + jariJari);
        System.out.println("Tinggi kerucut: " + tinggi);
        System.out.println("Luas permukaan kerucut: " + luasPermukaan);
        System.out.println("Volume kerucut: " + volume);
    }
}
