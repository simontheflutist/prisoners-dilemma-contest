package prisonersdilemmacontest;

/**
 * Represents a fully-player game between two prisoners.
 *
 * @author simon
 */
public final class TwoPlayerGame {

    public static final short NUMBER_OF_ROUNDS = 10;

    private final PrisonerPlayer player1, player2;

    public TwoPlayerGame(final PrisonerPlayer player1, final PrisonerPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
}
