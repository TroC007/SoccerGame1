package Runner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayersTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Draw draw = new Draw();
        Random rand = new Random();
        System.out.println("Naciśnij 'Enter', aby rozpocząć losowanie graczy.");
        scanner.nextLine();
        Cards cards = new Cards();
        cards.




        //Statystyki bramkarza
        int keeperAgile = rand.nextInt(75, 95);
        int keeperHeight = rand.nextInt(75, 95);
        int keeperDefending = rand.nextInt(75, 95);
        //karta bramkarza
        ArrayList<Integer> keeper = new ArrayList<>();
        keeper.add(keeperAgile);        //0
        keeper.add(keeperHeight);       //1
        keeper.add(keeperDefending);    //2
        Cards keeperStats = new Cards(keeper.get(0), keeper.get(1), 0, 0, 0, 0, keeper.get(2));
        System.out.println("Parametry keeper: " +
                "\nAgile - " + keeper.get(0) +
                "\nHeight -  " + keeper.get(1) +
                "\nDefending - " + keeper.get(2));
//        //Statystyki obrońcy
//        int defenderShooting = rand.nextInt(50, 90);
//        int defenderDribbling = rand.nextInt(50, 90);
//        int defenderPassing = rand.nextInt(75, 95);
//        int defenderReception = rand.nextInt(75, 95);
//        int defenderDefending = rand.nextInt(75, 95);
        //karty obrońców
        ArrayList<Integer> defender = new ArrayList<>();
        defender.add(rand.nextInt(50, 90));  //0 - obronća 1/4 - shooting
        defender.add(rand.nextInt(50, 90));  //1 - obronća 1/4 - dribbling
        defender.add(rand.nextInt(75, 95));  //2 - obronća 1/4 - passing
        defender.add(rand.nextInt(75, 95));  //3 - obronća 1/4 - reception
        defender.add(rand.nextInt(75, 95));  //4 - obronća 1/4 - defending
        //OVERALL
        JokerPoints jp = new JokerPoints();
        double jokerPoints = jp.jokerPoints(defender.get(0), defender.get(1));
        int ovr1 = (int) Math.round((defender.get(2) + defender.get(3) + defender.get(4)) / 3 + jokerPoints);

        defender.add(rand.nextInt(50, 90));  //5 - obronća 2/4
        defender.add(rand.nextInt(50, 90));  //6 - obronća 2/4
        defender.add(rand.nextInt(75, 95));  //7 - obronća 2/4
        defender.add(rand.nextInt(75, 95));  //8 - obronća 2/4
        defender.add(rand.nextInt(75, 95));  //9 - obronća 2/4

        defender.add(rand.nextInt(50, 90));  //10 - obronća 3/4
        defender.add(rand.nextInt(50, 90));  //11 - obronća 3/4
        defender.add(rand.nextInt(75, 95));  //12 - obronća 3/4
        defender.add(rand.nextInt(75, 95));  //13 - obronća 3/4
        defender.add(rand.nextInt(75, 95));  //14 - obronća 3/4

        defender.add(rand.nextInt(50, 90));  //15 - obronća 4/4
        defender.add(rand.nextInt(50, 90));  //16 - obronća 4/4
        defender.add(rand.nextInt(75, 95));  //17 - obronća 4/4
        defender.add(rand.nextInt(75, 95));  //18 - obronća 4/4
        defender.add(rand.nextInt(75, 95));  //19 - obronća 4/4

        Cards defender1Stats = new Cards(defender.get(4), 0, 0, defender.get(0), defender.get(1), defender.get(2), defender.get(3));
        Cards defender2Stats = new Cards(defender.get(9), 0, 0, defender.get(5), defender.get(6), defender.get(7), defender.get(8));
        Cards defender3Stats = new Cards(defender.get(14), 0, 0, defender.get(10), defender.get(11), defender.get(12), defender.get(13));
        Cards defender4Stats = new Cards(defender.get(19), 0, 0, defender.get(15), defender.get(16), defender.get(17), defender.get(18));

        System.out.println("Parametry pierwszego obrońcy: " +
                "\nShooting - " + defender.get(0) +
                "\nDribbling - " + defender.get(1) +
                "\nPassing - " + defender.get(2) +
                "\nReception - " + defender.get(3) +
                "\nDefending - " + defender.get(4));
        System.out.println(ovr1);
        System.out.println(jokerPoints);
        System.out.println("Parametry drugiego obrońcy: " +
                "\nShooting - " + defender.get(5) +
                "\nDribbling - " + defender.get(6) +
                "\nPassing - " + defender.get(7) +
                "\nReception - " + defender.get(8) +
                "\nDefending - " + defender.get(9));
        System.out.println("Parametry trzeciego obrońcy: " +
                "\nShooting - " + defender.get(10) +
                "\nDribbling - " + defender.get(11) +
                "\nPassing - " + defender.get(12) +
                "\nReception - " + defender.get(13) +
                "\nDefending - " + defender.get(14));
        System.out.println("Parametry czwartego obrońcy: " +
                "\nShooting - " + defender.get(15) +
                "\nDribbling - " + defender.get(16) +
                "\nPassing - " + defender.get(17) +
                "\nReception - " + defender.get(18) +
                "\nDefending - " + defender.get(19));

        //Statystyki pomocnika
        int midfielderShooting = rand.nextInt(65, 95);
        int midfielderDribbling = rand.nextInt(65, 95);
        int midfielderPassing = rand.nextInt(75, 95);
        int midfielderReception = rand.nextInt(75, 95);
        int midfielderDefending = rand.nextInt(70, 95);
        //karta pomocnika
        ArrayList<Integer> midfielder = new ArrayList<>();
        midfielder.add(midfielderShooting);   //0
        midfielder.add(midfielderDribbling);  //1
        midfielder.add(midfielderPassing);    //2
        midfielder.add(midfielderReception);   //3
        midfielder.add(midfielderDefending);  //4
        Cards midfielderStats = new Cards(midfielder.get(4), 0, 0, midfielder.get(0), midfielder.get(1), midfielder.get(2), midfielder.get(3));
        System.out.println("Parametry midfielder: " +
                "\nShooting - " + midfielder.get(0) +
                "\nDribbling - " + midfielder.get(1) +
                "\nPassing - " + midfielder.get(2) +
                "\nReception - " + midfielder.get(3) +
                "\nDefending - " + midfielder.get(4));
        //Statystyki napastnika
        int attackerShooting = rand.nextInt(75, 95);
        int attackerDribbling = rand.nextInt(75, 95);
        int attackerPassing = rand.nextInt(75, 95);
        int attackerReception = rand.nextInt(50, 90);
        int attackerDefending = rand.nextInt(50, 90);
        //karta napastnika
        ArrayList<Integer> attacker = new ArrayList<>();
        attacker.add(attackerShooting);   //0
        attacker.add(attackerDribbling);  //1
        attacker.add(attackerPassing);    //2
        attacker.add(attackerReception);   //3
        attacker.add(attackerDefending);  //4
        Cards attackerStats = new Cards(attacker.get(4), 0, 0, attacker.get(0), attacker.get(1), attacker.get(2), attacker.get(3));
        System.out.println("Parametry attacker: " +
                "\nShooting - " + attacker.get(0) +
                "\nDribbling - " + attacker.get(1) +
                "\nPassing - " + attacker.get(2) +
                "\nReception - " + attacker.get(3) +
                "\nDefending - " + attacker.get(4));
    }
}
