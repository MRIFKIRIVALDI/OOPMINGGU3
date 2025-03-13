package moduljava.src.bank;

public class Rekening {
    protected String namaPemilik;
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void setor(double jumlah, boolean transfer) {
        saldo += transfer ? jumlah - 2500 : jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + namaPemilik);
        System.out.println("No Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }
}