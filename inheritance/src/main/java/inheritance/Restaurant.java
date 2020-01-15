package inheritance;

import java.util.StringJoiner;

public class Restaurant extends MoneyMaker {

    public double stars;
    public int price;

    public Restaurant(String name, int price) {
        super(name);
        this.price = price;
    }

    public String toString() {
        String yld = "restaurant: " + this.name + " = " + this.stars + " stars" + " + " + this.price + " price";
        return yld;
    }

    public void addReview(Review newRev) {
        newRev.next = this.reviews;
        reviews = newRev;

        int count = 0;
        double sum = 0.0;
        Review runner = reviews;
        while (runner != null) {
            sum += runner.stars;
            count++;
            runner = runner.next;
        }

        this.stars = sum / count;
    }
}
