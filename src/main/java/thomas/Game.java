package thomas;

import thomas.pieces.Paper;
import thomas.pieces.Rock;
import thomas.pieces.Scissors;

import java.util.ArrayList;
import java.util.List;

public class Game {

     public static List<Piece> pieces = new ArrayList<Piece>();
     private Player playerOne;
     private Player playerTwo;

    public Game() {
        initializePieces();
        this.playerOne = new Player();
        this.playerTwo = new Player();
    }

    private void initializePieces(){
        pieces.add(new Paper());
        pieces.add(new Rock());
        pieces.add(new Scissors());
    }

    public void playGame(int numberOfRounds){
        for(int round = 0; round <100; round++){
            this.playerOne.getRandomPiece();
            this.playerTwo.getRandomPiece();
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "playerOne=" + playerOne +
                ", playerTwo=" + playerTwo +
                '}';
    }
}
