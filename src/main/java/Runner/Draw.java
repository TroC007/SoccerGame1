package Runner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class Draw {
    private Random rand = new Random();


    //losowanie karty bramkarza
    public ArrayList<Integer> drawKeeper() {
        ArrayList<Integer> parameters = new ArrayList<>();

        //losowanie parametrów karty
        parameters.add(rand.nextInt(75, 95));  //indeks 0 - bramkarz - agile
        parameters.add(rand.nextInt(75, 95));  //indeks 1 - bramkarz - height
        parameters.add(rand.nextInt(75, 95));  //indeks 2 - bramkarz - defending

        //wyliczenie overalla karty
        double ovr = (parameters.get(0) + parameters.get(1) + parameters.get(2)) / 3.0; //wyliczenie overalla
        BigDecimal overall = new BigDecimal(ovr).setScale(0, RoundingMode.HALF_UP); //zaokrąglenie overalla do liczby całkowitej
        int roundedOverall = overall.intValue();    //zmiana typu z 'BigDecimal' na 'Integer'
        parameters.add(roundedOverall); //indeks 3 - bramkarz - OVERALL (ocena ogólna karty)
        return parameters;
    }


    //losowanie karty obrońcy
    public ArrayList<Integer> drawDefender() {
        ArrayList<Integer> parameters = new ArrayList<>();

        //losowanie parametrów karty
        parameters.add(rand.nextInt(50, 90));  //indeks 0 - obronća - shooting
        parameters.add(rand.nextInt(50, 90));  //indeks 1 - obronća - dribbling
        parameters.add(rand.nextInt(75, 95));  //indeks 2 - obronća - passing
        parameters.add(rand.nextInt(75, 95));  //indeks 3 - obronća - reception
        parameters.add(rand.nextInt(75, 95));  //indeks 4 - obronća - defending

        //wyliczenie overalla karty
        JokerPoints jp = new JokerPoints(); //nowy obiekt dla jokerPoints'ów
        double jokerPoints = jp.jokerPoints(parameters.get(0), parameters.get(1));  // jokerPointsy (dodatkowe punkty do overalla) są liczone dla obrońcy od parametrów: shooting, dribbling. Dodatkowe punkty to bonusy od statystyk więszych niż średnie na tej pozycji piłkarskiej
        double ovr = (parameters.get(2) + parameters.get(3) + parameters.get(4)) / 3.0 + jokerPoints;   //wyliczenie overalla + dodatkowe punkty (jokerPoints) z klasy JokerPoints
        BigDecimal overall = new BigDecimal(ovr).setScale(0, RoundingMode.HALF_UP); //zaokrąglenie overalla do liczby całkowitej
        int roundedOverall = overall.intValue();    //zmiana typu z 'BigDecimal' na 'Integer'
        parameters.add(roundedOverall); //indeks 5 - obrońca - OVERALL (ocena ogólna karty)
        return parameters;
    }


    //losowanie karty pomocnika
    public ArrayList<Integer> drawMidfielder() {
        ArrayList<Integer> parameters = new ArrayList<>();

        //losowanie parametrów karty
        parameters.add(rand.nextInt(65, 95));  //indeks 0 - pomocnik - shooting
        parameters.add(rand.nextInt(75, 95));  //indeks 1 - pomocnik - dribbling
        parameters.add(rand.nextInt(75, 95));  //indeks 2 - pomocnik - passing
        parameters.add(rand.nextInt(75, 95));  //indeks 3 - pomocnik - reception
        parameters.add(rand.nextInt(65, 95));  //indeks 4 - pomocnik - defending

        //wyliczenie overalla karty
        JokerPoints jp = new JokerPoints(); //nowy obiekt dla jokerPoints'ów
        double jokerPoints = jp.jokerPoints(parameters.get(0), parameters.get(4));  // jokerPointsy są liczone dla pomocnika od parametrów: shooting, defending
        double ovr = (parameters.get(1) + parameters.get(2) + parameters.get(3)) / 3.0 + jokerPoints;   //wyliczenie overalla + dodatkowe punkty (jokerPoints) z klasy JokerPoints
        BigDecimal overall = new BigDecimal(ovr).setScale(0, RoundingMode.HALF_UP); //zaokrąglenie overalla do liczby całkowitej
        int roundedOverall = overall.intValue();    //zmiana typu z 'BigDecimal' na 'Integer'
        parameters.add(roundedOverall); //indeks 5 - pomocnik - OVERALL (ocena ogólna karty)
        return parameters;
    }

    //losowanie karty napastnika
    public ArrayList<Integer> drawAttacker() {
        ArrayList<Integer> parameters = new ArrayList<>();

        //losowanie parametrów karty
        parameters.add(rand.nextInt(75, 95));  //indeks 0 - napastnik - shooting
        parameters.add(rand.nextInt(75, 95));  //indeks 1 - napastnik - dribbling
        parameters.add(rand.nextInt(75, 95));  //indeks 2 - napastnik - passing
        parameters.add(rand.nextInt(50, 90));  //indeks 3 - napastnik - reception
        parameters.add(rand.nextInt(50, 90));  //indeks 4 - napastnik - defending

        //wyliczenie overalla karty
        JokerPoints jp = new JokerPoints(); //nowy obiekt dla jokerPoints'ów
        double jokerPoints = jp.jokerPoints(parameters.get(3), parameters.get(4));  // jokerPointsy są liczone dla pomocnika od parametrów: reception, defending
        double ovr = (parameters.get(0) + parameters.get(1) + parameters.get(2)) / 3.0 + jokerPoints;   //wyliczenie overalla + dodatkowe punkty (jokerPoints) z klasy JokerPoints
        BigDecimal overall = new BigDecimal(ovr).setScale(0, RoundingMode.HALF_UP); //zaokrąglenie overalla do liczby całkowitej
        int roundedOverall = overall.intValue();    //zmiana typu z 'BigDecimal' na 'Integer'
        parameters.add(roundedOverall); //indeks 5 - napastnik - OVERALL (ocena ogólna karty)
        return parameters;
    }
}

