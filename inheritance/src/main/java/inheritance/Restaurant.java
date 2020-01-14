package inheritance;

import java.util.StringJoiner;

public class Restaurant {

    public String name;
    public double stars;
    public int price;
    public Review reviews;

    public Restaurant(String name) {
        this.name = name;
    }

    public String toString() {
        String yld = "restaurant: " + this.name + " = " + this.stars + " stars" + " + " + this.price + " price";
        return yld;
    }

    static class Review {
        public String body;
        public String author;
        public int stars;
        public Review next;

        public Review(String body, String author, int stars) {
            this.body = body;
            this.author = author;
            this.stars = stars;
            this.next = null;
        }

        public String toString() {
            String yld = "review: " + "\n" + this.stars + " stars " + "\n" + this.body + " by " + this.author;
            return yld;
        }
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
