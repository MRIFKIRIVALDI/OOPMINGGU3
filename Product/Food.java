package Product;

public class Food extends Product {
    String Expired;

    public Food(String name, double price, String expired) {
        super(name, price);
        Expired = expired;
    }

    public String getExpired() {
        return Expired;
    }

    public void setExpired(String expired) {
        Expired = expired;
    }
    public void infoProduct(){
        super.infoProduct();
        System.out.println("Expired :"+ getExpired());
    }
}
