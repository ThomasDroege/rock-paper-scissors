package thomas;

import thomas.pieces.Paper;
import thomas.pieces.Rock;
import thomas.pieces.Scissors;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Player playerA;
    private Player playerB;
    private int numberOfDraws;

    public static List<Piece> pieces = new ArrayList<Piece>();
    public int numberOfRounds;


    public Game(Player playerA, Player playerB) {
        initializePieces();
        this.playerA = playerA;
        this.playerB = playerB;
    }

    // This method initializes is needed for the random pick of pieces and need to be extended for further pieces.
    private void initializePieces(){
        pieces.add(new Paper());
        pieces.add(new Rock());
        pieces.add(new Scissors());
        //pieces.add(new Fountain());
    }

   /*  This method checks the pieces from both player and changes the score, if necessary (draw).
       This method needs to be refactored, the two responsibilities (checking match of pieces and score settings) need to be separated.*/
    public void setScore(){
        if (this.playerA.getPieceChoice().checkMatch(this.playerB) ){
            this.playerA.setScore(1);
        }
        else if (this.playerB.getPieceChoice().checkMatch(this.playerA) ){
            this.playerB.setScore(1);
        }
        else{
            this.numberOfDraws += 1;
        }
    }

    public void playGame(int numberOfRounds){
        this.numberOfRounds = numberOfRounds;
        for(int round = 0; round <numberOfRounds; round++){
            this.playerA.choosePiece();
            this.playerB.choosePiece();
            this.setScore();
        }
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    @Override
    public String toString() {
        return "Spieler A gewinnt " + this.playerA.getScore() + " von " + this.numberOfRounds + " Spielen" +
        "\nSpieler B gewinnt " + this.playerB.getScore() + " von " + this.numberOfRounds  + " Spielen" +
        "\nUnentschieden: " + this.getNumberOfDraws() + " von " + this.numberOfRounds + " Spielen";
    }

}