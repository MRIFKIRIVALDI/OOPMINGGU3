package moduljava.src.karyawan;

public class karyawanTetap extends karyawan{
    int bonus;
    public karyawanTetap(String nama, double gapok, double tunjangan){
        super(nama, gapok, tunjangan);
    }
    public double getGaji(){
        double total = super.getGajiPokok() + super.getTunjangan();
        return total;
    }

    public void infoKaryawan(){
        System.out.println("Nama : " + super.getNama());
        System.out.println("Gaji Pokok : " + super.getGajiPokok());
        System.out.println("Tunjangan : " + super.getTunjangan());
        System.out.println("Total Gaji :" + getGaji());
        System.out.println("==============================");
    }
}
