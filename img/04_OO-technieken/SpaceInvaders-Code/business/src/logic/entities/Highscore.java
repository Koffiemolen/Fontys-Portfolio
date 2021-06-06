package logic.entities;

public class Highscore {

    private String name;
    private int highscore;

    public Highscore() {
        this.name = "";
        this.highscore = 0;
    }

    public Highscore(String name, int score) {
        this.name = name.replaceAll("[^A-Za-z0-9 ]", "");
        this.highscore = score;
    }

    public Highscore(Highscore highscore){
        this.name = highscore.name;
        this.highscore = highscore.highscore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // User input for name can be anything.
        // Filtering out all non-alphanumerical characters
        this.name = name.replaceAll("[^A-Za-z0-9 ]", "");
    }

    public int getPoints() {
        return highscore;
    }

    public void setPoints(int score) {
        this.highscore = score;
    }

    public boolean setHighscoreValue(int score) {
        if (score > this.getPoints()) {
            this.highscore = score;
            return true;
        }
        return false;
    }

    public void registerNewHighscore(String name, int score){
        setName(name);
        setPoints(score);
    }

}
