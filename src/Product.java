public class Product {
    private String idProduct;
    private String namaProduct;
    private int hargaProduct;
    private int jumlahStock;
    private String kategori;
    private int jumlahPembelian;
    public Product(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori) {
        this.idProduct = idProduct;
        this.namaProduct = namaProduct;
        this.hargaProduct = hargaProduct;
        this.jumlahStock = jumlahStock;
        this.kategori = kategori;
    }   
    public void displayDetail(){
        System.out.println("Produk ID : " + idProduct);
        System.out.println("Kategori : " + kategori);
        System.out.println("Nama Produk : " + namaProduct);
        System.out.println("Harga : " + hargaProduct);
        System.out.println("Stok : " + jumlahStock);
    }
    
}
