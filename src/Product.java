public class Product {
    private String idProduct;
    private String namaProduct;
    private int hargaProduct;
    private int jumlahStock;
    public Product(String idProduct, String namaProduct, int hargaProduct, int jumlahStock) {
        this.idProduct = idProduct;
        this.namaProduct = namaProduct;
        this.hargaProduct = hargaProduct;
        this.jumlahStock = jumlahStock;
    }
    public void displayDetail(){
        System.out.println("Produk ID : " + idProduct);
        System.out.println("Nama Produk : " + namaProduct);
        System.out.println("Harga : " + hargaProduct);
        System.out.println("Stok : " + jumlahStock);
    }
    
}
