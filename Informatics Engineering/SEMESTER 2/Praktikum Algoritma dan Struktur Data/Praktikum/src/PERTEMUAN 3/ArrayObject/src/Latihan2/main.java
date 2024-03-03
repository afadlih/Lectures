package Latihan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input04.nextLine();
            System.out.print("NIM: ");
            String nim = input04.nextLine();
            System.out.print("Jenis Kelamin: ");
            char jenisKelamin = input04.next().charAt(0);
            System.out.print("IPK: ");
            double ipk = input04.nextDouble();
            input04.nextLine();
            mahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
            System.out.println("Klik Enter untuk melanjutkan...");
            input04.nextLine();
        }
        input04.close();

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswa[i].getNama());
            System.out.println("NIM: " + mahasiswa[i].getNim());
            System.out.println("Jenis Kelamin: " + mahasiswa[i].getJenisKelamin());
            System.out.println("Nilai IPK: " + mahasiswa[i].getIpk());
            System.out.println("=======================================================");
            System.out.println();
            System.out.println("Rata-rata IPK: " + mahasiswa[i].HitungIPK(mahasiswa));
            System.out.println("===================================================");
            System.out.println("Mahasiswa dengan IPK Terbesar: " + mahasiswa[i].IPKTertinggi(mahasiswa).getIpk());
        }
        input04.close();
    }
}
