package inheritance;

public class MovieReview extends Review {

    String movie;

    public MovieReview(String body, String author, int stars, String reviewedMovie) {
        super(body, author, stars);
        this.movie = reviewedMovie;
    }
}
