public class Aksesoris extends Product{
    private String tipe;

    public Aksesoris(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori, String tipe) {
        super(idProduct, namaProduct, hargaProduct, jumlahStock, tipe);
        this.tipe = tipe;
    }
    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Tipe : " + tipe);
    }
    
}
