package Runner;

import java.util.Random;

public class Cards {
    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getAgile() {
        return agile;
    }

    public void setAgile(int agile) {
        this.agile = agile;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getTackling() {
        return tackling;
    }

    public void setTackling(int tackling) {
        this.tackling = tackling;
    }

    private int defending; //parametr bramkarza i piłkarza z pola
    private int agile;  //parametr bramkarza
    private int height; //parametr bramkarza
    private int shooting; //parametr piłkarza z pola
    private int dribbling; //parametr piłkarza z pola
    private int passing; //parametr piłkarza z pola
    private int tackling; //parametr piłkarza z pola

    public Cards(int defending, int agile, int height, int shooting, int dribbling, int passing, int tackling) {
        this.defending = defending;
        this.agile = agile;
        this.height = height;
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.passing = passing;
        this.tackling = tackling;
    }
}
