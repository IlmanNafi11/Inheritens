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
    private int jumlahBayar;

    public Transaksi(String idTransaksi, Product product, int jumlahDiBeli, int jumlahBayar) {
        this.idTransaksi = idTransaksi;
        this.product = product;
        this.kategori = product.getKategori();
        this.idProduk = product.getIdProduct();
        this.namaBarang = product.getNamaBarang();
        this.harga = product.getHargaProduct();
        this.jumlahPembelian = jumlahDiBeli;
        this.jumlahBayar = jumlahBayar;
    }

    public void displayDetail(){
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Kategori : " + kategori);
        System.out.println("ID Produk : " + idProduk);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Product : Rp. " + harga);
        System.out.println("Jumlah Pembelian : " + jumlahPembelian);
        System.out.println("Total Belanja : Rp. " + total);
        System.out.println("Jumlah Pembayaran : Rp. " + jumlahBayar);
        System.out.println("Uang Kembali : Rp. " + refund);
    }

    public int hitungTotal(){
        return total = jumlahPembelian * harga;
    }

    public int hitungRefund(){
        return refund = jumlahBayar - total;
    }
}
