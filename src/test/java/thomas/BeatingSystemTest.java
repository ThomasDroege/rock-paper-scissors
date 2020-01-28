package thomas;

import org.junit.jupiter.api.Test;
import thomas.Game;
import thomas.Player;
import thomas.pieces.Paper;
import thomas.pieces.Rock;
import thomas.pieces.Scissors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeatingSystemTest {
    Player playerRock = new Player(new Rock());
    Player playerPaper = new Player(new Paper());
    Player playerScissors = new Player(new Scissors());

    @Test
    public void rockVsPaper(){
        Game game = new Game(playerRock, playerPaper);
        game.playGame(1);
        assertEquals(0, playerRock.getScore(), "Rock get beaten by Paper" );
        assertEquals(1, playerPaper.getScore(), "Paper beats Rock" );
    }

    @Test
    public void rockVsScissors(){
        Game game = new Game(playerRock, playerScissors);
        game.playGame(1);
        assertEquals(1, playerRock.getScore(), "Rock beats Scissors" );
        assertEquals(0, playerScissors.getScore(), "Scissors get beaten by Rock" );
    }

    @Test
    public void paperVsScissors(){
        Game game = new Game(playerPaper, playerScissors);
        game.playGame(1);
        assertEquals(0, playerPaper.getScore(), "Paper get beaten by Scissors" );
        assertEquals(1, playerScissors.getScore(), "Scissors beats Paper" );
    }

    @Test
    public void draw(){
        Game game = new Game(playerPaper, playerPaper);
        game.playGame(1);
        assertEquals(0, playerPaper.getScore(), "Draw" );
        assertEquals(0, playerPaper.getScore(), "Draw" );
        assertEquals(1, game.getNumberOfDraws(), "Draw" );
    }
}
