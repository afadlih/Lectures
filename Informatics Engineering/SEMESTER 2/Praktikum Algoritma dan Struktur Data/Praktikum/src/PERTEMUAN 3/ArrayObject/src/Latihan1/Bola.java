package Latihan1;

public class Bola {
    public double jariJari;
    public double luasPermukaan;
    public double volume;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    void hitungLuasPermukaan(double jariJari) {
        luasPermukaan = (4 * Math.PI * jariJari * jariJari);
    }
    void hitungVolume(double jariJari) {
        volume = (4.0 / 3.0 * Math.PI * jariJari * jariJari * jariJari);
    }
    void tampilBola() {
        System.out.println("Jari-jari bola: " + jariJari);
        System.out.println("Luas permukaan bola: " + luasPermukaan);
        System.out.println("Volume bola: " + volume);
    }
}
