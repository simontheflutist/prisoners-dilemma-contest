package prisonersdilemmacontest;

/**
 * Represents a fully-player game between two prisoners.
 *
 * @author simon
 */
public final class TwoPlayerGame {

    public static final short NUMBER_OF_ROUNDS = 10;
    public static final double[][][] ROUND_OUTCOMES = new double[][][]{
        {{2, 2}, {0, 5}},
        {{5, 0}, {0, 0}}};

    private final PrisonerPlayer player1, player2;

    public TwoPlayerGame(final PrisonerPlayer player1, final PrisonerPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * Play a game of the Prisoner's Dilemma.
     *
     * @return the score account where the first number is player1's score and
     * the second number is player2's score
     */
    public double[] play() {
        final double[] tally = new double[]{0, 0};

        int roundCount = 0;
        do {
            boolean currentMoveA = player1.nextMove();
            boolean currentMoveB = player2.nextMove();

            player1.processOpponentMove(currentMoveB);
            player2.processOpponentMove(currentMoveA);

            // if true, then NICE
            double[] d_score = ROUND_OUTCOMES[currentMoveA ? 0 : 1][currentMoveB ? 0 : 1];

            tally[0] += d_score[0];
            tally[1] += d_score[1];

            roundCount++;
        } while (roundCount < NUMBER_OF_ROUNDS);

        return tally;
    }
}
