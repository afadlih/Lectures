package Minggu5;

public class Sum {
    int elemen;
    double Keuntungan[],total;

    Sum(int elemen){
        this.elemen = elemen;
        this.Keuntungan = new double[elemen];
        this.total = 0;
    }
    public static double totalBF(double[] keuntungan) {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }


    public static double totalDC(double[] keuntungan, int l, int r){
        if (l == r) {
            return keuntungan[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(keuntungan, l, mid-1);
            double rsum = totalDC(keuntungan, mid + 1, r);
            return lsum + rsum+keuntungan[mid];
        } else {
            return 0;
        }
    }
}
