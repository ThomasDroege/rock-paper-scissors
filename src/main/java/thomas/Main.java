package thomas;

import java.util.List;

public class Main {

    public static void main(String[] args){

        Player playerOne = new Player();
        Game game = new Game();
        game.playGame(100);

        System.out.print(game);
    }
}
