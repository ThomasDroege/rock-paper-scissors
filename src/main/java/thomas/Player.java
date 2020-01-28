package thomas;

import java.util.Random;
import static thomas.Game.pieces;

public class Player {

    private Piece pieceChoice;
    private Random randomNumber;
    private Boolean randomPieceChoice;
    private int score;

    public Piece getPieceChoice() {
        return pieceChoice;
    }

    public Player(){
        this.randomPieceChoice = true;
        this.randomNumber = new Random();
        this.pieceChoice = null;
        this.score = 0;
    }

    public Player(Piece piece){
        this.randomPieceChoice = false;
        this.pieceChoice = piece;
        this.score = 0;
    }

    // This method checks whether a piece choice is preset or a random choice needs to be chosen
    public void choosePiece() {
        if (this.randomPieceChoice == true) {
            this.pieceChoice = pieces.get(randomNumber.nextInt(pieces.size()));
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

}