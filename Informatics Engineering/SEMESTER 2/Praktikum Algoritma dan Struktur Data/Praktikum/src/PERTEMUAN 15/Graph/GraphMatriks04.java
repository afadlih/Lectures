package Graph;

public class GraphMatriks04 {
    int vertex;
    int [][] matriks;

    public GraphMatriks04(int v) {
        vertex = v;
        matriks = new int[v][v];
    
    }

    public void makeEdge (int asal , int tujuan , int jarak) {
        matriks[asal] [tujuan] = jarak ;

    }
    public void removeEdge (int asal , int tujuan) {
        matriks [asal] [tujuan] = -1;

    }
    public void  printGraph () {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' +i)+": ");
            for (int j=0; j< vertex ; j++) {
                if (matriks[i][j] !=-1) {
                    System.out.print(" Gedung " +(char) ('A'+j) + " (" +matriks[i][j] + "m),");
                    
                }
            }
            System.out.println();
        }
    }
    public void degree (int asal) {
        int inTotal = 0, outTotal = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[asal][i] != 0) {
                ++inTotal;
            }
            if (matriks[i][asal] != 0) {
                ++outTotal;
            }
        }
        System.out.println("Indegree dari Gedung " + (char) ('A' + asal) + " : " + inTotal);
        System.out.println("Outdegree dari Gedung " + (char) ('A' + asal) + " : " + outTotal);
        System.out.println("degree dari Gedung " + (char) ('A' + asal) + " : " + (inTotal + outTotal));
    }
}
