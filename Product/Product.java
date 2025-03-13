package Product;

public class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String setName(){
        return name;
    }
    public double getPrice(){
        return price;
    } 
    public double getPrice(int disc){
        return getPrice() - getPrice() * (disc/100);
    }
    public void infoProduct() {
        System.out.println("Nama : " + setName());
        System.out.println("Price : " + getPrice());
    }
}
