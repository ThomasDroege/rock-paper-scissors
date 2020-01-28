package thomas.pieces;

import thomas.Piece;

public class Fountain  extends Piece {

    public Fountain() {
        this.type = "Fountain";
        this.canBeat.add("Rock");
        this.canBeat.add("Scissors");
    }

}