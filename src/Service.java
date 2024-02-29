public class Service extends Transaksi {
    private String namaCustomer;
    private String noHp;
    private String alamat;
    private String keterangan;
    private int totalBayar;
    private int total;
    public Service(String idTransaksi, Product product, int jumlah, String namaCustomer, String noHp, String alamat, String keterangan, int totalBayar) {
        super(idTransaksi, product, jumlah);
        this. namaCustomer = namaCustomer;
        this.noHp = noHp;
        this.alamat = alamat;
        this.keterangan = keterangan;
        this.totalBayar = totalBayar;
    }
    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Nama Customer : " + namaCustomer);
        System.out.println("No hp Customer : " + noHp);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Keterangan : " + keterangan);
    }
    @Override
    public int hitungTotal(int pay){
        int diskon = 15000;
        total = super.hitungTotal(totalBayar) * diskon;
        return total;
    }
    
}
