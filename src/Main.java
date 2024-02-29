public class Main {
    public static void main(String[] args) throws Exception {
        // Aksesoris aksesoris = new Aksesoris("AKS-001", "Casing", 15000, 5, "Aksesoris", "Redmi 9C");
        // aksesoris.displayDetail();
        // System.out.println();
        // Elektronik elektronik = new Elektronik("ELK-001", "Samsung Tab 10", 1000000, 2, "Elektronik", "Tablet");
        // elektronik.displayDetail();
        // System.out.println();
        // Pulsa pulsa = new Pulsa("PLS-001", "Paket Data 4GB", 35000, 5, "Paket Data", "Telkomsel");
        // pulsa.displayDetail();
        Product product = new Product("PROD-1", "Casing", 50000, 2, "Suku cadang");
        // Transaksi transaksi = new Transaksi("Tran-01", product);
        // transaksi.displayDetail();
        Transaksi tr = new Transaksi("TR-001", product, 4, 230000);
        TransaksiPenjualan transaksiPenjualan = new TransaksiPenjualan("TP-001", product, 2, 120000, "08539326885");
        Service service = new Service("SER-001", product, 1, 40000, "Ilman", "0852986", "Sragen", "Ganti Casing");
        service.hitungTotal();
        service.hitungRefund();
        service.displayDetail();
    }
}
