package prisonersdilemmacontest;

public class PrisonersDilemmaContest {

    public static void main(String[] args) {

    }

    private final class RandomPlayer extends PrisonerPlayer {

        @Override
        public boolean nextMove() {
            return random.nextBoolean();
        }

        @Override
        public void processOpponentMove() {
            // Opponent's move doesn't matter
        }

    }
}
