public class TransaksiPenjualan extends Transaksi{
    private int jumlahDiskon = 10000;
    private String noHpMember;
    private int jumlahBayar;
    private int totalBayar;
    private int refund;

    public TransaksiPenjualan(String idTransaksi, Product product, int jumlah, String noHpMember, int jumlahBayar) {
        super(idTransaksi, product, jumlah);
        this.noHpMember = noHpMember;
        this.jumlahBayar = jumlahBayar;
    }
    @Override
    public void displayDetail() {
        super.displayDetail();
    }
    @Override
    public int hitungTotal() {
        return super.hitungTotal() - jumlahDiskon;
    }
}
