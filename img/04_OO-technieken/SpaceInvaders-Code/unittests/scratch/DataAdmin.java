package scratch;

import data.providers.HighscoreStore;
import dataprovider.interfaces.HighscoreProvider;
import logic.entities.Highscore;

import java.util.ArrayList;
import java.util.List;

public class DataAdmin implements HighscoreProvider {
    ArrayList<Highscore> highscore = new ArrayList<>();
    private HighscoreStore highscoreStore;

    public DataAdmin(HighscoreStore highscoreStore) {
        this.highscoreStore = highscoreStore;
    }

    public List<Highscore> retrieveAllHighscores(){
        return  highscoreStore.retrieveAllHighScores();
    }

    @Override
    public void setAllHighScores(List<Highscore> ListHighscores) {

    }

    @Override
    public List<Highscore> retrieveAllHighScores() {
        return null;
    }

}