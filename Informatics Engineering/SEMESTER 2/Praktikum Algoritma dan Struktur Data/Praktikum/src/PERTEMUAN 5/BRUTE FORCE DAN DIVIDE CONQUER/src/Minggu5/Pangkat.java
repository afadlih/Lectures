package Minggu5;

public class Pangkat {
    public int nilai, pangkat;

    int PangkatBF(int a, int n) {
        int hasil = 1;
        int i = 0;
        while (i < n) {
            hasil *= a;
            i++;
        }
        return hasil;
    }

    int PangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2) * a);
            } else {
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2));
            }
        }
    }

}