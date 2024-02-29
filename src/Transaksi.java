public class Transaksi {
    private String idTransaksi;
    private String kategori;
    private Product product;
    private String idProduk;
    private String namaBarang;
    private int harga;
    private int total;
    private int refund;
    private int jumlahPembelian;

    public Transaksi(String idTransaksi, Product product, int jumlah) {
        this.idTransaksi = idTransaksi;
        this.product = product;
        this.kategori = product.getKategori();
        this.idProduk = product.getIdProduct();
        this.namaBarang = product.getNamaBarang();
        this.harga = product.getHargaProduct();
        this.jumlahPembelian = jumlah;
    }
    public void displayDetail(){
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Kategori : " + kategori);
        System.out.println("ID Produk : " + idProduk);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Product : " + harga);
        System.out.println("Jumlah Pembelian : " + jumlahPembelian);
        System.out.println("Total Pembayaran : " + total);
        System.out.println("Uang Kembali : " + refund);
    }
    
    public int hitungTotal(){
        return total = jumlahPembelian * harga;
    }

    public int hitungRefund(){
        return refund = 0;
    }
}
