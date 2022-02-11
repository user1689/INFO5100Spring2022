package question4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("jack", 123);
        Player p2 = new Player("leo", 122);
        Player p3 = new Player("sam", 110);
        Player p4 = new Player("david", 123);
        Player p5 = new Player("roger", 120);
        Player p6 = new Player("jay", 123);
        Player p7 = new Player("jame", 123);
        Player[] players = new Player[]{p1, p2, p3, p4, p5, p6, p7};
        Arrays.sort(players, new Comparator<Player>() {
           @Override
           public int compare(Player a, Player b) {
               if (b.getScore() > a.getScore()) {
                   return 1;
               } else if (b.getScore() < a.getScore()) {
                   return -1;
               } else {
                   return a.getName().compareTo(b.getName());
               }
           }
        });
        for (Player p : players) {
            System.out.println(p.getName() + " score is " + p.getScore());
        }
    }
}
