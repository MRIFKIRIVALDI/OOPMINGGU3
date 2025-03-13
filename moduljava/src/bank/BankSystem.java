package moduljava.src.bank;
import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rekening> daftarRekening = new ArrayList<>();
        
        Tabungan tabungan = new Tabungan("Ali", "123456", 1000000, 5);
        Giro giro = new Giro("Budi", "654321", 2000000, 500000, 3);
        Deposito deposito = new Deposito("Citra", "789012", 5000000, 12, 6);
        
        daftarRekening.add(tabungan);
        daftarRekening.add(giro);
        daftarRekening.add(deposito);
        
        while (true) {
            System.out.println("Masukkan nomor rekening untuk transaksi (atau ketik 'exit' untuk keluar):");
            String noRek = scanner.nextLine();
            if (noRek.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.println("Pilih transaksi: 1. Setor  2. Tarik");
            int pilihan = scanner.nextInt();
            System.out.println("Masukkan jumlah:");
            double jumlah = scanner.nextDouble();
            scanner.nextLine(); // Membuang newline
            
            boolean ditemukan = false;
            for (Rekening r : daftarRekening) {
                if (r.nomorRekening.equals(noRek)) {
                    if (pilihan == 1) {
                        r.setor(jumlah);
                    } else if (pilihan == 2) {
                        r.tarik(jumlah);
                    } else {
                        System.out.println("Pilihan tidak valid!");
                    }
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Nomor rekening tidak ditemukan!");
            }
        }
        
        System.out.println("\nInformasi Rekening:");
        for (Rekening r : daftarRekening) {
            r.tampilkanInfo();
            System.out.println();
        }
        
        scanner.close();
    }
}