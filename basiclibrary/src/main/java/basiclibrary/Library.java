/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n) {
        int[] yld = new int[n];
        for (int i = 0; i < n; i++) {
            int rand = (int) Math.ceil(Math.random() * 6);
            yld[i] = rand;
        }
        return yld;
    }

    public static boolean containsDuplicates(int[] arr) {
        boolean yld = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[j] == arr[i]) {
                    yld = true;
                }
            }
        }
        return yld;
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int[] lowestAverage(int[][] arrays) {
        int[] yld = arrays[0];
        double lowestAvg = average(yld);
        for (int[] set : arrays) {
            if (average(set) < lowestAvg) {
                yld = set;
            }
        }
        return yld;
    }
}
