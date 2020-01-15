package inheritance;

public class Theater extends MoneyMaker implements Updatable {

    String allTheMovies;

    public Theater(String name, String movies) {
        super(name);
        this.allTheMovies = movies;
    }

    public String toString() {
        String yld = "This is a Theater: " + this.name + " Movies: " + this.allTheMovies;
        return yld;
    }

    public void addReview(Review newRev, String movie) {
        newRev.next = this.reviews;
        reviews = newRev;
    }

    @Override
    public void addMovie(String movie) {
        this.allTheMovies += " -- " + movie;
    }

    @Override
    public void removeMovie(String movie) {
        String[] movieList = this.allTheMovies.split(" -- ");

    }
}
