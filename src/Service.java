public class Service extends Transaksi {
    private String namaCustomer;
    private String noHp;
    private String alamat;
    private String keterangan;
    private int jasa;
    
    public Service(String idTransaksi, Product product, int jumlahDiBeli, int jumlahBayar, String namaCustomer, String noHp, String alamat, String keterangan) {
        super(idTransaksi, product, jumlahDiBeli, jumlahBayar);
        this.namaCustomer = namaCustomer;
        this.noHp = noHp;
        this.alamat = alamat;
        this.keterangan = keterangan;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Keterangan : " + keterangan);
        System.out.println("Biaya Jasa : " + jasa);
        System.out.println("Nama Customer : " + namaCustomer);
        System.out.println("No Hp Customer : "+ noHp);
        System.out.println("Alamat : Customer : " + alamat);
    }

    @Override
    public int hitungTotal() {
        jasa = 15000;
        return super.hitungTotal() + jasa;
    }

    @Override
    public int hitungRefund() {
        return super.hitungRefund();
    }
    
}
