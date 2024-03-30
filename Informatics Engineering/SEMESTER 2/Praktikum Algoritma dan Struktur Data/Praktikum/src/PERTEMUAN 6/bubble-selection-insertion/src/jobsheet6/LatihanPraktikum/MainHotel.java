package jobsheet6.LatihanPraktikum;

public class MainHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Hotel A", "Jakarta", 1000000, (byte) 5);
        Hotel h2 = new Hotel("Hotel B", "Bandung", 500000, (byte) 4);
        Hotel h3 = new Hotel("Hotel C", "Bali", 2000000, (byte) 5);
        Hotel h4 = new Hotel("Hotel D", "Surabaya", 300000, (byte) 3);
        Hotel h5 = new Hotel("Hotel E", "Yogyakarta", 400000, (byte) 4);

        HotelService service = new HotelService();
        service.tambahHotel(h1);
        service.tambahHotel(h2);
        service.tambahHotel(h3);
        service.tambahHotel(h4);
        service.tambahHotel(h5);

        System.out.println("Sebelum sorting");
        service.tampilAll();

        System.out.println("Setelah sorting dengan bubble sort");
        service.bubbleSort();
        service.tampilAll();

        System.out.println("Setelah sorting dengan selection sort");
        service.selectionSort();
        service.tampilAll();
    }
}
