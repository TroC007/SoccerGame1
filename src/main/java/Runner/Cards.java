package Runner;

import java.util.ArrayList;

public class Cards {
    private Draw draw = new Draw();
    private ArrayList<ArrayList<Integer>> playerCards;
    private ArrayList<ArrayList<Integer>> computerCards;

    public Cards() {
        this.draw = new Draw();
        this.playerCards = generateCards();
        this.computerCards = generateCards();
    }

    public ArrayList<ArrayList<Integer>> generateCards() {  //metoda typu "lista w liście", bo tworzę listę składającą się z list
        ArrayList<ArrayList<Integer>> cards = new ArrayList<>();    //tworzę nową listę z typem "ArrayList<Integer>", ale tak naprawdę to jest tam typ "Integer"
        cards.add(draw.drawKeeper());   //losowanie bramkarza
        for (int i = 0; i < 4; i++) {   //losowanie 4 obrońców
            cards.add(draw.drawDefender());
        }
        for (int i = 0; i < 4; i++) {   //losowanie 4 pomocników
            cards.add(draw.drawMidfielder());
        }
        for (int i = 0; i < 2; i++) {   //losowanie 2 napastników
            cards.add(draw.drawAttacker());
        }
        return cards;   //zwraca listę 11 piłkarzy
    }

    public ArrayList<ArrayList<Integer>> getPlayerCards() {
        return playerCards;
    }

    public ArrayList<ArrayList<Integer>> getComputerCards() {
        return computerCards;
    }
    public void displayPlayerCards() {
        System.out.println("Twoje karty piłkarzy:");
        for (int i = 0; i < playerCards.size(); i++) {
            ArrayList<Integer> card = playerCards.get(i);
            System.out.println("Piłkarz " + (i+1) + ": " + card);
        }
    }
}


