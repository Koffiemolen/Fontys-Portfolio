package data.providers;

import dataprovider.interfaces.HighscoreProvider;
import logic.entities.Highscore;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HighscoreStore implements HighscoreProvider {
    private List<Highscore> highscoreList= new ArrayList<>();
     private final File file = new File("highscore.dat");
//    private final File file = new File("/data.resources/highscore.dat");


    public HighscoreStore() {
        checkIfHighscoreFileIsPresent();
    }

    @Override
    public void setAllHighScores(List<Highscore> ListHighscores) {
        FileWriter writeFile;
        BufferedWriter writer = null;
        try {
            writeFile = new FileWriter(file);
            writer = new BufferedWriter(writeFile);

            for(Highscore highscore : ListHighscores) {
                writer.write(highscore.getName().replaceAll("[^A-Za-z0-9 ]", "") + ":" + highscore.getPoints());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // return all highscores as list<Highscore>
    @Override
    public List<Highscore> retrieveAllHighScores(){
        for (String highscore : getStringsFromFile()) {
            highscoreList.add(convertStringToHighscore(highscore));
        }
        return highscoreList;
    }

    private void checkIfHighscoreFileIsPresent(){

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException event){
                event.printStackTrace();
            }
        }
    }

    private List<String> getStringsFromFile(){
        List<String> rawData = new ArrayList<>();
        FileReader readFile;
        BufferedReader reader = null;

        try {
            readFile = new FileReader(file);
            reader = new BufferedReader(readFile);
            rawData = reader.lines().collect(Collectors.toList());

        } catch (Exception exception) {
            // file does not exist or inaccessible
            return rawData;
        } finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return rawData;
    }

    private Highscore convertStringToHighscore(String text){
        // format: <user>:<score>
        // format: Bigfoot:125320
        Highscore highscore = new Highscore();
        if(text.contains(":")) {
            String[] dataArray = text.split(":");

            String name = dataArray[0];
            int score = Integer.parseInt(dataArray[1]);

            highscore.setName(name);
            highscore.setPoints(score);
        } else{
            highscore.setName("");
            highscore.setPoints(0);
        }
        return highscore;
    }



}
