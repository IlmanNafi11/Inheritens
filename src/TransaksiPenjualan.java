public class TransaksiPenjualan extends Transaksi{
    private int jumlahDiskon;
    private String noHpMember;

    public TransaksiPenjualan(String idTransaksi, Product product, int jumlahDiBeli, int jumlahBayar, String noHpMember) {
        super(idTransaksi, product, jumlahDiBeli, jumlahBayar);
        this.noHpMember = noHpMember;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Diskon : Rp. " + jumlahDiskon);
        System.out.println("No Hp Member : " + noHpMember);
    }

    @Override
    public int hitungTotal() {
        jumlahDiskon = 10000;
        return super.hitungTotal() - jumlahDiskon;
    }

    @Override
    public int hitungRefund() {
        return super.hitungRefund();
    }
}
