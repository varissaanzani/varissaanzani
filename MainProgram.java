import java.util.Scanner;

// Kelas MainProgram: Entry point untuk menjalankan program
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input No Faktur
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            // Input Kode Barang
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            // Input Nama Barang
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            // Input Harga Barang
            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            // Exception handling: Validasi input harga barang
            if (hargaBarang < 0) {
                throw new IllegalArgumentException("Harga barang tidak boleh negatif.");
            }

            // Input Jumlah Beli
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Exception handling: Validasi input jumlah beli
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari nol.");
            }

            // Membuat objek Transaksi menggunakan inheritance
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan rincian transaksi
            System.out.println("\n=== Detail Transaksi ===");
            System.out.println("No Faktur    : " + noFaktur);
            System.out.println("Kode Barang  : " + transaksi.getKodeBarang());
            System.out.println("Nama Barang  : " + transaksi.getNamaBarang());
            System.out.println("Harga Barang : " + transaksi.getHargaBarang());
            System.out.println("Jumlah Beli  : " + transaksi.getJumlahBeli());
            System.out.println("Total        : " + transaksi.getTotal());

        } catch (IllegalArgumentException e) {
            // Menangani error akibat input tidak valid
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Menangani error umum lainnya
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Menutup scanner
            scanner.close();
        }
    }
}
