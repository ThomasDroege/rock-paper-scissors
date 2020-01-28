package thomas.pieces;

import thomas.Piece;

public class Rock extends Piece {

    public Rock() {
        this.type = "Rock";
        this.canBeat.add("Scissors");
    }

}