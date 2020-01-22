package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {

    @Test
    public void testTheaterInstance() {
        Theater newTheater = new Theater("AMC", "star wars");

        String output = "This is a Theater: AMC Movies: star wars";
        assertEquals(output, newTheater.toString());
    }

    @Test public void testMovieReview() {
        Theater newTheater = new Theater("AMC", "star wars");
        MovieReview movieReview = new MovieReview("just ok", "joe public", 3, "star wars");
        newTheater.addReview(movieReview);

        MovieReview runner = (MovieReview) newTheater.reviews;
        String output = "star wars";
        assertEquals(output, runner.movie);
    }

    @Test public void testAddMovie() {
        Theater amc = new Theater("AMC", "star wars");
        amc.addMovie("ford v. ferrari");

        String output = "This is a Theater: AMC Movies: star wars -- ford v. ferrari";
        assertEquals("string output should contain newly added movie", output, amc.toString());
    }

    @Test public void testRemoveMovie() {
        Theater amc = new Theater("AMC", "star wars");
        amc.addMovie("ford v. ferrari");
        amc.addMovie("1917");
        amc.addMovie("avengers");
        amc.addMovie("dope");

        amc.removeMovie("avengers");
        String output = " -- star wars -- ford v. ferrari -- 1917 -- dope";
        assertEquals("should return string allTheMovies without newly removed movie", output, amc.allTheMovies);
    }
}
