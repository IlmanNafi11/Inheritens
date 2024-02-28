public class Aksesoris extends Product{
    private String kategori;

    public Aksesoris(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori) {
        super(idProduct, namaProduct, hargaProduct, jumlahStock);
        this.kategori = kategori;
    }
    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Kategori : " + kategori);
    }
    
}
