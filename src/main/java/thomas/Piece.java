package thomas;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    public String type;
    public List<String> canBeat =  new ArrayList<String>();
    public Boolean checkMatch(Player player) {
      for(String piece: this.canBeat){
          if(piece.equals(player.getPieceChoice().type)) {
              return true;
          }
      }
          return false;
    }

}
