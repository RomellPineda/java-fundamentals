import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    System.out.println("lab 01");

    System.out.println(pluralize("wurd", 0));
    flipNHeads(4);
    clock();
  }

  public static String pluralize(String word, int num) {
    if (num == 0 || num > 1) {
      String yld = word + "s";
      return yld;
    }
    return word;
  }

  public static void flipNHeads(int n) {
    int headcount = 0;
    int flips = 0;
    while (headcount < n) {
      double coin = Math.random();
      boolean heads = coin > 0.5;
      flips++;
      String face = heads ? "heads" : "tails";
      if (heads) {
        headcount++;
      } else {
        headcount = 0;
      }
      System.out.println(face);
    }
    String yld = "it took " + flips + " to flip " + n + " in a row";
    System.out.println(yld);
  }

  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    String yld = hour + ":" + minute + ":" + second;
    System.out.println(yld);

    while (true) {
      now = LocalDateTime.now();
      if (now.getSecond() != second) {
        hour = now.getHour();
        minute = now.getMinute();
        second = now.getSecond();

        yld = hour + ":" + minute + ":" + second;
        System.out.println(yld);
      }
    }
  }
}