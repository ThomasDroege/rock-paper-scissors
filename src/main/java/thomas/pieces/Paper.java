package thomas.pieces;

import thomas.Piece;

public class Paper extends Piece {

    public Paper() {
        this.type = "Paper";
        this.canBeat.add("Rock");
        this.canBeat.add("Fountain");
    }

}