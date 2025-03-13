package Product;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Electronic el = new Electronic(null, 0, 0);
        Clothing cl = new Clothing(null, 0, 0, null);
        Food food = new Food(null, 0, null);
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("Menu :");
        System.out.println("1. Electronic");

        int menu = sc.nextInt();

        if(menu == 1){
            System.out.println("Merk :");
            String name = sc.next();
            el.setName(name);
            el.infoProduct();
        }
    }
}