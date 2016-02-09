package prisonersdilemmacontest;

import java.util.Arrays;
import prisonersdilemmacontest.prisoners.RandomPrisoner;

public class PrisonersDilemmaContest {

    public static void main(String[] args) {
        TwoPlayerGame game = new TwoPlayerGame(new RandomPrisoner(), new RandomPrisoner());
        System.out.println(Arrays.toString(game.play()));
    }
}
