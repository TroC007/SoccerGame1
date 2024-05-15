package Runner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayersTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Naciśnij 'Enter', aby rozpocząć losowanie graczy.");
        scanner.nextLine();
        ArrayList<Integer> keeper = new ArrayList<>();
        int keeperDefending = rand.nextInt(75, 95);
        int keeperAgile = rand.nextInt(75, 95);
        int keeperHeight = rand.nextInt(75, 95);
//        Cards[] team = new Cards[11];
        keeper.add(keeperDefending);
        keeper.add(keeperAgile);
        keeper.add(keeperHeight);
        Cards keeperStats = new Cards(keeper.get(0), keeper.get(1), keeper.get(2),0,0,0,0);
        System.out.println("Pierwszy element listy keeper: " + keeper.get(0) + " " + keeper.get(1) + " " + keeper.get(2));
    }
}
