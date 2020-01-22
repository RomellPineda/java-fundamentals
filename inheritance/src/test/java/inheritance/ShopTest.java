package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    @Test
    public void testShopInstance() {
        Shop newShop = new Shop("Book Worm", "A book shop", 2);

        String output = "This is a shop: Book Worm Description: A book shop Price Range: 2";
        assertEquals(output, newShop.toString());
    }

    @Test public void testShopReview() {
        Shop shop = new Shop("Some Shop", "yay capitalism", 3);
        Review newReview = new Review("pricey", "average joe", 2);
        shop.addReview(newReview);

        Review runner = shop.reviews;
        assertEquals("should return name of reviewer", "average joe", runner.author);
        assertEquals("should return body of review", "pricey", runner.body);

        Review review2 = new Review("second review", "jane", 4);
        shop.addReview(review2);
        Review current = shop.reviews;
        assertEquals("should return name of second reviewer", "jane", current.author);
        assertEquals("should return body of second review", "second review", current.body);
    }

}
