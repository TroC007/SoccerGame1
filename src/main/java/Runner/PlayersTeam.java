package Runner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayersTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cards cards = new Cards();
        Random rand = new Random();

        System.out.println("Naciśnij 'Enter', aby rozpocząć losowanie kart piłkarskich.");
        scanner.nextLine();

        ArrayList<ArrayList<Integer>> playerCards = cards.getPlayerCards();
        ArrayList<ArrayList<Integer>> computerCards = cards.getComputerCards();

        cards.displayPlayerCards();

        // Wybór karty przez gracza
        System.out.println("Wybierz numer karty, którą chcesz zagrać (1-11):");
        int playerChoice = scanner.nextInt() - 1;  // Indeksowanie od 0

        if (playerChoice < 0 || playerChoice >= playerCards.size()) {
            System.out.println("Błędny wybór. Zamykanie gry.");
            scanner.close();
            return;
        }

        ArrayList<Integer> playerCard = playerCards.get(playerChoice);

        // Losowy wybór karty przez komputer
        int computerChoice = rand.nextInt(computerCards.size());
        ArrayList<Integer> computerCard = computerCards.get(computerChoice);

        int playerOverall = playerCard.get(playerCard.size() - 1);
        int computerOverall = computerCard.get(computerCard.size() - 1);

        System.out.println("Player's chosen card overall: " + playerOverall);
        System.out.println("Computer's chosen card overall: " + computerOverall);

        if (playerOverall > computerOverall) {
            System.out.println("Player wins this round!");
        } else if (playerOverall < computerOverall) {
            System.out.println("Computer wins this round!");
        } else {
            System.out.println("It's a draw!");
        }

        scanner.close();
            }
        }