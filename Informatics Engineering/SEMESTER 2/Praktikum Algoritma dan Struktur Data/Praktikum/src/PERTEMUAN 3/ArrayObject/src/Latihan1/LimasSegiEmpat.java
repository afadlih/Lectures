package Latihan1;

public class LimasSegiEmpat {
    double sisiAlas;
    double tinggiLimas;
    double luasPermukaan;
    double volume;
    double panjang, lebar, tinggi;

    public LimasSegiEmpat(double sisiAlas, double tinggiLimas) {
        this.sisiAlas = sisiAlas;
        this.tinggiLimas = tinggiLimas;
    }
    void hitungLuasPermukaan(double sisiAlas, double tinggiLimas) {
        luasPermukaan = (sisiAlas * sisiAlas) + (4 * (0.5 * sisiAlas * Math.sqrt((tinggiLimas * tinggiLimas) + (sisiAlas / 2 * sisiAlas / 2))));
    }
    void hitungVolume(double sisiAlas, double tinggiLimas) {
        volume = (1.0 / 3.0 * sisiAlas * sisiAlas * tinggiLimas);
    }
    void tampilLimasSegiEmpat() {
        System.out.println("Sisi alas limas: " + sisiAlas);
        System.out.println("Tinggi limas: " + tinggiLimas);
        System.out.println("Luas permukaan limas: " + luasPermukaan);
        System.out.println("Volume limas: " + volume);
    }
}
