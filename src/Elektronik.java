public class Elektronik extends Product{

    private String kategori;
    private String type;
    public Elektronik(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori, String tipe) {
        super(idProduct, namaProduct, hargaProduct, jumlahStock);
        this.kategori = kategori;
        this.type = tipe;
    }

    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Kategori : " + kategori);
        System.out.println("Tipe : ");
    }
    
}
