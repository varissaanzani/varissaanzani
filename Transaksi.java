// Kelas Transaksi: Subclass (kelas turunan) dari Barang yang menambahkan atribut dan logika transaksi
public class Transaksi extends Barang {
    private int jumlahBeli; // Atribut untuk jumlah barang yang dibeli
    private double total;   // Atribut untuk total harga barang

    // Constructor: Menggunakan inheritance (super) untuk mewarisi data dari kelas Barang
    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor Barang
        this.jumlahBeli = jumlahBeli;
        this.total = calculateTotal(); // Menghitung total harga
    }

    // Metode untuk menghitung total harga berdasarkan harga barang dan jumlah beli
    private double calculateTotal() {
        return this.hargaBarang * this.jumlahBeli;
    }

    // Getter untuk jumlah beli
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    // Getter untuk total harga
    public double getTotal() {
        return total;
    }
}