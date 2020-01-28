package thomas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoundTest {

    Player playerA = new Player();
    Player playerB = new Player();
    Game gameTester = new Game(playerA, playerB);

    @Test
    public void roundNumbers(){
        gameTester.playGame(10);
        assertEquals(10, gameTester.numberOfRounds, "10 Rounds played" );
    }

}
