package Runner;

public class JokerPoints {
    public double jokerPoints(int param1, int param2) { //metoda dodająca dodatkowe punkty do OVERALLA karty

        double jokerPoints = 0.0;

        boolean halfPointS = (param1 >= 80 && param1 < 85);
        boolean halfPointD = (param2 >= 80 && param2 < 85);
        boolean onePointS = (param1 >= 85 && param1 < 87);
        boolean onePointD = (param2 >= 85 && param2 < 87);
        boolean oneAndHalfPointS = (param1 >= 87 && param1 < 90);
        boolean oneAndHalfPointD = (param2 >= 87 && param2 < 90);
        boolean twoPointS = (param1 >= 90);
        boolean twoPointD = (param2 >= 90);

        if (halfPointS || halfPointD) { //warunek w tej instrukcji warunkowej jest z założenia spełniony i jest 'true', bo jest
            jokerPoints += (halfPointS ? 0.5 : 0.0) + (halfPointD ? 0.5 : 0.0);}    // instrukcja z operatorem warunkowym (condition ? valueIfTrue : valueIfFalse)
        if (onePointS || onePointD) {
            jokerPoints += (onePointS ? 0.5 : 0.0) + (onePointD ? 0.5 : 0.0);}
        if (oneAndHalfPointS || oneAndHalfPointD) {
            jokerPoints += (oneAndHalfPointS ? 0.5 : 0.0) + (oneAndHalfPointD ? 0.5 : 0.0);}
        if (twoPointS || twoPointD) {
            jokerPoints += (twoPointS ? 0.5 : 0.0) + (twoPointD ? 0.5 : 0.0);}

        return jokerPoints;
    }
}
