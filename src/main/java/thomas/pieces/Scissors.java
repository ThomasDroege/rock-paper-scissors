package thomas.pieces;

import thomas.Piece;

public class Scissors extends Piece {

    public Scissors() {
        this.type = "Scissors";
        this.canBeat.add("Paper");
    }

}