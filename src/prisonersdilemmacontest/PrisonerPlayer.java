package prisonersdilemmacontest;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Represents a single prisoner playing in our game.
 *
 * @author simon
 */
public abstract class PrisonerPlayer {

    /**
     * You will use this Random instance if you need a random boolean/double,
     * etc.
     */
    protected static final Random random = new SecureRandom();

    /**
     * Compute the next move that you want your prisoner to make.
     *
     * @return the move that the prisoner submits: 1 is nice and 0 is mean
     */
    public abstract boolean nextMove();

    /**
     * Process the opponent's move (e.g. keep a history for stats or for move
     * copying)
     *
     * @param oppMove
     */
    public abstract void processOpponentMove(boolean oppMove);

    /**
     * Resets the state of the prisoner.
     */
    public void reset() {
    }

}
