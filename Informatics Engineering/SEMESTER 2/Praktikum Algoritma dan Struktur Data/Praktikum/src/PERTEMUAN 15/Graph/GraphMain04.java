package Graph;
import java. util. Scanner;
public class GraphMain04 {
    public static void main(String[] args) throws Exception {
        Graph04 gedung = new Graph04(6);
        Scanner sc04 = new Scanner(System.in);
        int attempt = 0;
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        for (int i = attempt ; i < 2; i++) {
            System.out.println("Masukkan gedung asal: ");
            int asal = sc04.nextInt();
            System.out.println("Masukkan Gedung Tujuan: ");
            int tujuan = sc04.nextInt();
            gedung.Neighbours(asal, tujuan);
            System.out.println("");
        }
    }
}
