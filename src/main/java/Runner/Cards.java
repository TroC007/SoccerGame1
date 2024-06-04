package Runner;

import java.util.ArrayList;

public class Cards {
    Draw draw = new Draw();
    ArrayList<Integer> bramkarz = draw.drawKeeper();
    ArrayList<Integer> obronca1 = draw.drawDefender();
    ArrayList<Integer> obronca2 = draw.drawDefender();
    ArrayList<Integer> obronca3 = draw.drawDefender();
    ArrayList<Integer> obronca4 = draw.drawDefender();
    ArrayList<Integer> pomocnik1 = draw.drawMidfielder();
    ArrayList<Integer> pomocnik2 = draw.drawMidfielder();
    ArrayList<Integer> pomocnik3 = draw.drawMidfielder();
    ArrayList<Integer> pomocnik4 = draw.drawMidfielder();
    ArrayList<Integer> napastnik1 = draw.drawAttacker();
    ArrayList<Integer> napastnik2 = draw.drawAttacker();
    public Cards() {
        ArrayList<ArrayList<Integer>> playerCards = new ArrayList<>();
        playerCards.add(bramkarz);
        playerCards.add(obronca1);
        playerCards.add(obronca2);
        playerCards.add(obronca3);
        playerCards.add(obronca4);
        playerCards.add(pomocnik1);
        playerCards.add(pomocnik2);
        playerCards.add(pomocnik3);
        playerCards.add(pomocnik4);
        playerCards.add(napastnik1);
        playerCards.add(napastnik2);
        ArrayList<ArrayList<Integer>> computerCards = new ArrayList<>();
        computerCards.add(bramkarz);
        computerCards.add(obronca1);
        computerCards.add(obronca2);
        computerCards.add(obronca3);
        computerCards.add(obronca4);
        computerCards.add(pomocnik1);
        computerCards.add(pomocnik2);
        computerCards.add(pomocnik3);
        computerCards.add(pomocnik4);
        computerCards.add(napastnik1);
        computerCards.add(napastnik2);
    }
}


