/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testRoll() {
        int[] testArray = new int[3];
        assertEquals(testArray.length, Library.roll(3).length);
    }

    @Test public void testElementsInRoll() {
        boolean yld = false;
        int[] testArray = Library.roll(5);
        for ( int num : testArray) {
            if (num > 0 && num < 7) {
                yld = true;
            } else {
                yld = false;
                break;
            }
        }
        assertTrue("passed", yld);
    }

    @Test public void testContainsDuplicates() {
        int[] testArray = {1, 2, 3, 3};
        int[] testArrayTwo = {5, 4, 3, 2, 1, 0};

        assertEquals(true, Library.containsDuplicates(testArray));
        assertEquals(false, Library.containsDuplicates(testArrayTwo));
    }

}
