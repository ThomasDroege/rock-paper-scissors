package thomas;

import org.junit.jupiter.api.Test;
import thomas.pieces.Paper;
import thomas.pieces.Rock;
import thomas.pieces.Scissors;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class RandomPieceVsSelectedPieceTest {
    Player playerA = new Player();
    Player playerB = new Player(new Paper());
    Player playerC = new Player(new Rock());
    Player playerD = new Player(new Scissors());

    @Test
    public void randomPiece(){
        playerA.choosePiece();
        assertThat(playerA.getPieceChoice(), instanceOf(Piece.class));
    }

    @Test
    public void selectedPiece(){
        assertThat(playerB.getPieceChoice(), instanceOf(Paper.class));
        assertThat(playerC.getPieceChoice(), instanceOf(Rock.class));
        assertThat(playerD.getPieceChoice(), instanceOf(Scissors.class));
    }

}
