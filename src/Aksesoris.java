public class Aksesoris extends Product {
    private String tipe;
    private int jumlahPembelian;

    public Aksesoris(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori,
            String tipe) {
        super(idProduct, namaProduct, hargaProduct, jumlahStock, kategori);
        this.tipe = tipe;
    }

    public Aksesoris(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori,
            String tipe, int jumlahPembelian) {
        super(idProduct, namaProduct, hargaProduct, jumlahStock, kategori);
        this.tipe = tipe;
        this.jumlahPembelian = jumlahPembelian;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Tipe : " + tipe);
    }

}
