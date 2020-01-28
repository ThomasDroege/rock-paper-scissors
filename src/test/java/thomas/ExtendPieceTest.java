package thomas;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import thomas.pieces.Fountain;
import thomas.pieces.Paper;
import thomas.pieces.Rock;
import thomas.pieces.Scissors;

/*The ability of beating more than one piece is introduced with the extension of the piece "fountain".
 It is able to beat the scissors and the rock. It will be beaten by paper. Therefore paper and fountain are a kind of "superclass".
 It is unbalanced by only adding one piece and is only an example of extension. */
public class ExtendPieceTest {

    @Test
    public void createFountainClass(){
        Fountain fountain = new Fountain();
        assertThat(fountain, instanceOf(Piece.class));
        assertThat(fountain, instanceOf(Fountain.class));
    }

    @Test
    public void fountainBeatingSystem(){
        Player playerFountainA = new Player(new Fountain());
        Player playerFountainB = new Player(new Fountain());
        Player playerFountainC = new Player(new Fountain());
        Player playerScissors = new Player(new Scissors());
        Player playerRock = new Player(new Rock());
        Player playerPaper = new Player(new Paper());

        Game gameTesterA = new Game(playerFountainA, playerScissors);
        gameTesterA.playGame(1);
        assertEquals(1, playerFountainA.getScore(), "Fountain beats Scissors" );

        Game gameTesterB = new Game(playerFountainB, playerRock);
        gameTesterB.playGame(1);
        assertEquals(1, playerFountainB.getScore(), "Fountain beats Rock" );

        Game gameTesterC = new Game(playerFountainC, playerPaper);
        gameTesterC.playGame(1);
        assertEquals(0, playerFountainC.getScore(), "Fountain gets beaten by Paper");
        assertEquals(1, playerPaper.getScore(), "Paper beats Fountain ");
    }

}
