package moduljava.src.mobil;

public class Mobil {
    String merk;
    String warna;
    int kecepatan;
   

    public void setDataMobil(String b, String warna, int k) {
        merk = b;
        kecepatan = k;
        this.warna = warna;
    }
    public String getMerk(){
        return merk;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public String getWarna(){
        return warna;
    }

    public void tambahKecepatan(int k){
        kecepatan = kecepatan + k;
    }
    public void infoMobil(){
        System.out.println("merk :" + getMerk());
        System.out.println("warna :"+ getWarna());
        System.out.println("kecepatan :" + getKecepatan());
        System.out.println("===========================");
    }
    
}
