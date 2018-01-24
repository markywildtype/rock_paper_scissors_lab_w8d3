package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/01/2018.
 */

public class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors;
    RockPaperScissors rockPaperScissors2;
    RockPaperScissors rockPaperScissors3;

    @Before
    public void before(){
        rockPaperScissors = new RockPaperScissors("rock");
        rockPaperScissors2 = new RockPaperScissors("rock");
        rockPaperScissors3 = new RockPaperScissors("scissors");
    }

    @Test
    public void paperBeatsRock(){
        assertEquals("Paper beats rock, computer wins!", rockPaperScissors.play());
    }

    @Test
    public void scissorsBeatsPaper(){
        assertEquals("Scissors beats paper, player 1 wins!", rockPaperScissors3.play());
    }

    @Test
    public void canDraw(){
        assertEquals("It's a draw!", rockPaperScissors2.play());
    }

    @Test
    public void gameIsWon(){
        rockPaperScissors.play();
        assertEquals(true, rockPaperScissors.gameIsWon());
    }

//    @Test
//    public void computerScoreStartsAtZero(){
//        assertEquals(0, rockPaperScissors.getComputerScore());
//    }
//
//    @Test
//    public void playerScoreStartsAtZero(){
//        assertEquals(0, rockPaperScissors.getPlayerScore());
//    }
//
//    @Test
//    public void winIncrementsScore(){
//        rockPaperScissors.play();
//        assertEquals(1, rockPaperScissors.getComputerScore());
//    }
}
