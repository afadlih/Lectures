package jobsheet6.LatihanPraktikum;

public class HotelService {
    Hotel[] rooms = new Hotel[10];

    void tambahHotel(Hotel h) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = h;
                break;
            }
        }
    }
    void tampilAll() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println("Nama Hotel: " + rooms[i].nama);
                System.out.println("Kota: " + rooms[i].kota);
                System.out.println("Harga: " + rooms[i].harga);
                System.out.println("Bintang: " + rooms[i].bintang);
                System.out.println();
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - 1; j++) {
                if (rooms[j] != null && rooms[j + 1] != null) {
                    if (rooms[j].harga > rooms[j + 1].harga) {
                        Hotel temp = rooms[j];
                        rooms[j] = rooms[j + 1];
                        rooms[j + 1] = temp;
                    }
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j] != null && rooms[minIndex] != null) {
                    if (rooms[j].harga < rooms[minIndex].harga) {
                        minIndex = j;
                    }
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
