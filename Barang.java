// Kelas Barang: Merupakan parent class (kelas induk) untuk menyimpan informasi dasar barang.
public class Barang {
    protected String kodeBarang; // Atribut untuk kode barang
    protected String namaBarang; // Atribut untuk nama barang
    protected double hargaBarang; // Atribut untuk harga barang

    // Constructor untuk menginisialisasi data barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Getter untuk kode barang
    public String getKodeBarang() {
        return kodeBarang;
    }

    // Getter untuk nama barang
    public String getNamaBarang() {
        return namaBarang;
    }

    // Getter untuk harga barang
    public double getHargaBarang() {
        return hargaBarang;
    }
}
