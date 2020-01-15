package inheritance;

public class Shop extends MoneyMaker {

    String description;
    public int price;


    public Shop(String name, String description, int price) {
        super(name);
        this.description = description;
        this.price = price;
    }

    public String toString() {
        String yld = "This is a shop: " + this.name + " Description: " + this.description + " Price Range: " + this.price;
        return yld;
    }

    public void addReview(Review newRev) {
        newRev.next = this.reviews;
        reviews = newRev;
    }
}
