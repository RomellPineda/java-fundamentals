/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
        double sum = 0;
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

    public static String analyzeWeather(int[][] data) {
        int min = data[0][0];
        int max = data[0][0];
        HashSet<Integer> temps = new HashSet<>();

        for (int[] week : data) {
            for (int temp : week) {
                if (temp < min) {
                    min = temp;
                }
                if (temp > max) {
                    max = temp;
                }
                temps.add(temp);
            }
        }

        String yld = "High: " + max + "\n" + "Low: " + min;
        String bigStr = "";

        for (int i = min; i < max; i++) {
            if (!temps.contains(i)) {
                bigStr += "\n" + "Never saw temperature: " + i;
            }
        }
        return yld + bigStr;
    }

    public static String tally(List<String> arr) {
        String incumbent = arr.get(0);
        HashMap<String, Integer> results = new HashMap<>();
        for(String candidate : arr) {
            if (results.containsKey(candidate)) {
                results.put(candidate, results.get(candidate) + 1);
            } else {
                results.put(candidate, 1);
            }
            if (results.get(candidate) > results.get(incumbent)) {
                incumbent = candidate;
            }
        }
        return incumbent;
    }
}
