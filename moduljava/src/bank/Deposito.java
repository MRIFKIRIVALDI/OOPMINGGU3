package moduljava.src.bank;

public class Deposito extends Rekening {
    private int jangkaWaktuBulan;
    private double sukuBunga;

    public Deposito(String namaPemilik, String nomorRekening, double saldo, int jangkaWaktuBulan, double sukuBunga) {
        super(namaPemilik, nomorRekening, saldo);
        this.jangkaWaktuBulan = jangkaWaktuBulan;
        this.sukuBunga = sukuBunga;
    }

    public double hitungBunga() {
        return saldo * (sukuBunga / 100) * (jangkaWaktuBulan / 12.0);
    }

    @Override
    public void tarik(double jumlah) {
        System.out.println("Denda 10% diterapkan!");
        saldo -= jumlah + (saldo * 0.1);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Deposito: " + sukuBunga + "%");
    }
}