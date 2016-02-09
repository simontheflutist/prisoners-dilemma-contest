package prisonersdilemmacontest;

/**
 * Represents a fully-player game between two prisoners.
 *
 * @author simon
 */
public final class TwoPlayerGame {

    public static final short NUMBER_OF_ROUNDS = 10;
    public static final double[][][] ROUND_OUTCOMES = new double[][][]{{{2, 2}, {5, 0}}, {{0, 5}, {0, 0}}};

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
        boolean player1first = Math.random() < 0.5;
        PrisonerPlayer playerA = player1first ? player1 : player2;
        PrisonerPlayer playerB = player1first ? player2 : player1;

        final double[] tally = new double[]{0, 0};

        int roundCount = 0;
        do {
            boolean currentMoveA = playerA.nextMove();
            boolean currentMoveB = playerB.nextMove();

            playerA.processOpponentMove(currentMoveB);
            playerB.processOpponentMove(currentMoveA);

            double[] d_score = ROUND_OUTCOMES[currentMoveA ? 1 : 0][currentMoveB ? 1 : 0];

            tally[0] += d_score[0];
            tally[1] += d_score[1];

            roundCount++;
        } while (roundCount < NUMBER_OF_ROUNDS);

        return player1first ? tally : new double[]{tally[1], tally[0]};
    }
}
