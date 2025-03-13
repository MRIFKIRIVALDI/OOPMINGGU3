package moduljava.src.bank;

public class Giro extends Rekening {
    private double limitPenarikan;
    private double bungaTahunan;

    public Giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldo);
        this.limitPenarikan = limitPenarikan;
        this.bungaTahunan = bungaTahunan;
    }

    public double hitungBunga(int bulan) {
        return saldo * (bungaTahunan / 100) * (bulan / 12.0);
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
        } else {
            System.out.println("Melebihi limit penarikan!");
        }
    }
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }

}