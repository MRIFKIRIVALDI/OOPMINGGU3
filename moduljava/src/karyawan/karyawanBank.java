package moduljava.src.karyawan;

import java.util.Scanner;

public class karyawanBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");

        System.out.print("Isikan Pilihan :");
        int Pilihan = sc.nextInt();
        System.out.print("Nama :");
        String nama = sc.next();
        System.out.println("Tunjangan :");
        double tunjangan = sc.nextDouble();
        if( Pilihan == 1){
            System.out.print("Gaji Pokok : ");
            double gapok = sc.nextDouble();
            karyawanTetap k1 = new karyawanTetap(nama, gapok, tunjangan);
            k1.infoKaryawan();
        }
        }
}
