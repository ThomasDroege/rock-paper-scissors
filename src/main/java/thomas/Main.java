package thomas;

import thomas.pieces.Paper;

public class Main {
    public static void main(String[] args){

        Player playerA = new Player();
        Player playerB = new Player(new Paper());
        Game game = new Game(playerA, playerB);
        game.playGame(100);
        System.out.println(game);

    }
}
