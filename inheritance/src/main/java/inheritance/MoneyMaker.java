package inheritance;

public class MoneyMaker {

    public String name;
    public Review reviews;

    public MoneyMaker(String name) {
        this.name = name;
    }

    public String toString() {
        String yld = "Get Money: " + this.name;
        return yld;
    }

    public void addReview(Review newRev) {
        newRev.next = this.reviews;
        reviews = newRev;
    }
}
