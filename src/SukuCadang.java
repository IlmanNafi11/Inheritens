public class SukuCadang extends Product{
    private String nomorSeri;
    private String merek;
    public SukuCadang(String idProduct, String namaProduct, int hargaProduct, int jumlahStock, String kategori, String nomorsString, String merek) {
        super(idProduct, namaProduct, hargaProduct, jumlahStock, kategori);
        this.nomorSeri = nomorsString;
        this.merek = merek;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Merek : " + merek);
        System.out.println("Nomor Seri : " + nomorSeri);
    }
    
}
