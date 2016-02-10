/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 * This prisoner acts randomly.
 *
 * @author Maya
 */
public class RandomLastMeanPrisoner extends PrisonerPlayer {

    private int roundCount = 0;

    @Override
    public boolean nextMove() {
        roundCount++;
        if (roundCount == 10) {
            return false;
        } else {
            return random.nextBoolean();
        }
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        // Opponent's move doesn't matter
    }

    public void reset() {
        roundCount = 0;
    }

}
