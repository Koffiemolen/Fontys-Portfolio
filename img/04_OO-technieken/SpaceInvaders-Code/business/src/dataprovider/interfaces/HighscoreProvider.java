package dataprovider.interfaces;

import logic.entities.Highscore;

import java.util.List;

public interface HighscoreProvider {

//    void registerNewHighscore(String name, int score);
    void setAllHighScores(List<Highscore> ListHighscores);
    List<Highscore> retrieveAllHighScores();


}
