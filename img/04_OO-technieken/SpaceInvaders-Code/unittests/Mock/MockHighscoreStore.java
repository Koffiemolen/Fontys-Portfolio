package Mock;

import logic.entities.Highscore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;
import java.util.List;

// deze moet data terug geven
class MockHighscoreStore {
    private Highscore emptyHighscore;                   // user: ""             : score: 0
    private Highscore correctUserAndScoreHighscore;     // user: Berta          : score: 22000
    private Highscore incorrectUserNameHighscore;       // user: Ingrid:100000  : score: 1000
    private Highscore tooLowHighscore;                  // user: Henk           : score: 900 Will be compared with a higher highscore
    private Highscore highscoreMax;                     // user: Venom          : score: 999999
    private List<Highscore> inputHighscoresList;
    private List<Highscore> resultHighscoresList;
    private List<Highscore> tempHighscoreList;
    private MockDatabase mockDatabase = new MockDatabase();


    @BeforeEach
    void setUp() {
        mockDatabase.clearList();
        emptyHighscore = new Highscore("",0);
        correctUserAndScoreHighscore = new Highscore("Berta",22000);
        incorrectUserNameHighscore = new Highscore("Ingrid:100000",1000);
        tooLowHighscore = new Highscore("Henk",900);
        highscoreMax = new Highscore("Venom",999999);
        inputHighscoresList = new ArrayList<>();
        tempHighscoreList = new ArrayList<>();
    }

    @Test
    void setHighscoreWithEmptyUserAndScoreAndIsPresent() {
        // Arrange: Set up a test environment
        inputHighscoresList.add(emptyHighscore);

        // Act: Act out the test scenario's
        mockDatabase.setAllHighScores(inputHighscoresList);

        // Assert: Verify the result from the test
        assertTrue(mockDatabase.returnStoredHighscores().contains(emptyHighscore));
    }

    @Test
    void setHighscoreWithEmptyUserAndScoreAndTestWithRetrieveAllMethod() {
        // Arrange: Set up a test environment
        boolean returnValue = false;
        inputHighscoresList.add(emptyHighscore);

        // Act: Act out the test scenario's
        mockDatabase.setAllHighScores(inputHighscoresList);
        if(mockDatabase.retrieveAllHighScores().get(0).getName() == emptyHighscore.getName() && mockDatabase.retrieveAllHighScores().get(0).getPoints() == emptyHighscore.getPoints()){
            returnValue = true;
        }

        // Assert: Verify the result from the test
        assertTrue(returnValue);
    }

    @Test
    void setHighscoreWithIncorrectUserAndScoreAndTestUser() {
        // Arrange: Set up a test environment
        boolean returnValue = false;
        inputHighscoresList.add(incorrectUserNameHighscore);

        // Act: Act out the test scenario's
        mockDatabase.setAllHighScores(inputHighscoresList);
        if(!mockDatabase.retrieveAllHighScores().get(0).getName().contains(":")){
            returnValue = true;
        }

        // Assert: Verify the result from the test
        assertTrue(returnValue);
    }

    @Test
    void setHigscoreListAndAddMulitpleHighscoresVerifySizeList() {
        // Arrange: Set up a test environment
        inputHighscoresList.add(emptyHighscore);
        inputHighscoresList.add(correctUserAndScoreHighscore);
        inputHighscoresList.add(incorrectUserNameHighscore);
        inputHighscoresList.add(tooLowHighscore);
        inputHighscoresList.add(highscoreMax);

        // Act: Act out the test scenario's
        mockDatabase.setAllHighScores(inputHighscoresList);


        // Assert: Verify the result from the test
        assertEquals(mockDatabase.retrieveAllHighScores().size(),inputHighscoresList.size());
    }


}