import java.util.Scanner;

public class Perulangan_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Mengambil 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Menambahkan 10 jika n kurang dari 10
        if (n < 10) {
            n += 10;
        }

        // Menampilkan deretan bilangan
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }

            // Menambahkan spasi setelah setiap bilangan
            System.out.print(" ");
        }

        System.out.println(); // Menambahkan baris baru di akhir
        scanner.close();
    }
}
