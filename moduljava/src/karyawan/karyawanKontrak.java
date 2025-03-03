package moduljava.src.karyawan;

public class karyawanKontrak extends karyawan {
    double gaji_per_hari;
    int jml_masuk;
    public karyawanKontrak(String nama, double tunjangan){
        super(nama, tunjangan);
        gaji_per_hari = 200000;
    }
    public void setDataKaryawan(double gph, int jml_masuk){
        gaji_per_hari = gph;
        this.jml_masuk = jml_masuk;
    }
    public double getGaji(){
        double total = (gaji_per_hari * jml_masuk) + super.getTunjangan();
        return total;
    }
    public void infoKaryawan(){
        System.out.println("Nama : " + super.getNama());
        System.out.println("Gaji/Hari : " + gaji_per_hari);
        System.out.println("Jumlah Masuk : " + jml_masuk);
        System.out.println("Total Gaji : " + getGaji());
        System.out.println("=============================");
    }
}
