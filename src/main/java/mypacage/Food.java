package mypacage;

public class Food {
    public Food() {
        System.out.println("Кушать подано!");
    }
    public Food(String dish) { this.dish = dish;}

    public Food(String dish, int price) {
        this.dish = dish;
        this.price = price;
    }

    int price;
    String dish;
   int menuPrice;

   public void MenuPrice(int price) {
        this.price = price+price*3;
        System.out.println("Menu price is: "+this.price);
    }
}
