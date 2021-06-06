package Mock;

import dataprovider.interfaces.HighscoreProvider;
import logic.entities.Highscore;

import java.util.ArrayList;
import java.util.List;

public class MockDatabase implements HighscoreProvider {
    List<Highscore> highscores = new ArrayList<>();

    public MockDatabase() {
    }

    public MockDatabase(List<Highscore> highscores) {
        this.highscores = highscores;
    }

    // Set all highscores
    @Override
    public void setAllHighScores(List<Highscore> ListHighscores) {
        clearList();
        highscores = ListHighscores;
    }

    // Return all highscores
    @Override
    public List<Highscore> retrieveAllHighScores() {
        return highscores;
    }

    public void clearList(){
        highscores.clear();
    }

    // method for checking if records are stored
    public List<Highscore> returnStoredHighscores(){
        return this.highscores;
    }
}
