public class Pulsa extends Product{

    private String founder;
    public Pulsa(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori, String founder) {
        super(idProduct, namaProduct, hargaProduct, jumlahStock, kategori);
        this.founder = founder;
    }

    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Founder : " + founder);
    }

}
