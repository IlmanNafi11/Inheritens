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

    
    
}
