package inheritance;

public class Review {
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
