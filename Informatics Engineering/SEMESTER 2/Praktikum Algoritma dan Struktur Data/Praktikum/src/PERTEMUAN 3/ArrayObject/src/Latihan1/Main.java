package Latihan1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input04 = new Scanner(System.in);
            boolean jalan = true;

            while (jalan) {
                System.out.println("Pilih bangun ruang:");
                System.out.println("1. Bola");
                System.out.println("2. Kerucut");
                System.out.println("3. Limas Segi Empat");
                System.out.println("0. Keluar");
                System.out.print("Masukkan pilihan: ");
                int pilihan = input04.nextInt();

                switch (pilihan) {
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Bola ke-" + (i+1));
                            System.out.print("Masukkan jari-jari: ");
                            double jariJari = input04.nextDouble();
                            Bola bola = new Bola(jariJari);
                            bola.hitungLuasPermukaan(jariJari);
                            bola.hitungVolume(jariJari);
                            bola.tampilBola();
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Kerucut ke-" + (i+1));
                            System.out.print("Masukkan jari-jari: ");
                            double jariJari = input04.nextDouble();
                            System.out.print("Masukkan sisi miring: ");
                            double sisiMiring = input04.nextDouble();
                            Kerucut kerucut = new Kerucut(jariJari, sisiMiring);
                            kerucut.hitungLuasPermukaan(jariJari, sisiMiring);
                            kerucut.hitungVolume(jariJari, sisiMiring);
                            kerucut.tampilKerucut();
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Limas Segi Empat ke-" + (i+1));
                            System.out.print("Masukkan panjang sisi alas: ");
                            double panjangSisiAlas = input04.nextDouble();
                            System.out.print("Masukkan tinggi limas: ");
                            double tinggiLimas = input04.nextDouble();
                            LimasSegiEmpat limas = new LimasSegiEmpat(panjangSisiAlas, tinggiLimas);
                            limas.hitungLuasPermukaan(panjangSisiAlas, tinggiLimas);
                            limas.hitungVolume(panjangSisiAlas, tinggiLimas);
                            limas.tampilLimasSegiEmpat();
                        }
                        break;
                    case 0:
                        jalan = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            }

            input04.close();
        }
    }