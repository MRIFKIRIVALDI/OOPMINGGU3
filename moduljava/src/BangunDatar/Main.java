package moduljava.src.BangunDatar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scanner.nextDouble();
        BujurSangkar bujurSangkar = new BujurSangkar(sisi);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan sisi 1 segitiga: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Masukkan sisi 2 segitiga: ");
        double sisi2 = scanner.nextDouble();
        System.out.print("Masukkan sisi 3 segitiga: ");
        double sisi3 = scanner.nextDouble();
        Segitiga segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);

        System.out.println("\nBujur Sangkar");
        System.out.println("Luas: " + bujurSangkar.luas());
        System.out.println("Keliling: " + bujurSangkar.keliling());

        System.out.println("\nPersegi Panjang");
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());

        System.out.println("\nSegitiga");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
        
        scanner.close();
    }
}
