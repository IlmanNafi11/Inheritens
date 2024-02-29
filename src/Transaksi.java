public class Transaksi {
    private String idTransaksi;
    private String kategori;
    private Product product;
    private String namaBarang;
    private int harga;
    

    public Transaksi(String idTransaksi, Product product) {
        this.idTransaksi = idTransaksi;
        this.kategori = product.getKategori();
        this.product = product;
        this.namaBarang = product.getNamaBarang();
        this.harga = product.getHargaProduct();
    }
    public void displayDetail(){
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Kategori : " + kategori);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Product : " + harga);
    }
}
