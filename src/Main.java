import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // buat object scanner
        Scanner sc = new Scanner(System.in);

        // konsep polymorphism
        Product aksesoris = new Aksesoris("AKS-001", "Casing", 20000, 2, "Pelindung Layar", "5.3 Inc");
        ((Product)aksesoris).displayDetail();
        // ((Product) aksesoris).displayDetail();;
        System.out.println("================================");
        
        System.out.println("======== Transaksi ========");
        // meminta inputan ke user
        System.out.print("Masukan jumlah bayar service : Rp. ");
        int jumlahBayar = sc.nextInt();

        // menampilkan detail transaksi service
        Service service = new Service("SER-001", aksesoris, 1, jumlahBayar, "Ilman", "0852986", "Sragen", "Ganti Casing");
        service.hitungTotal();
        service.hitungRefund();
        service.displayDetail();

        System.out.println();
        System.out.println("======= Transaksi =======");
        // meminta inputan ke user
        System.out.print("Masukan jumlah bayar Pembelian : Rp. ");
        jumlahBayar = sc.nextInt();

        // menampilkan detail transaksi penjualan
        TransaksiPenjualan transaksiPenjualan = new TransaksiPenjualan("TP-002", aksesoris, 2 , jumlahBayar, "087675656");
        transaksiPenjualan.hitungTotal();
        transaksiPenjualan.hitungRefund();
        transaksiPenjualan.displayDetail();
    }
}
