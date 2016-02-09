/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 *
 * @author simon
 */
public class RandomPrisoner extends PrisonerPlayer {

    @Override
    public boolean nextMove() {
        return random.nextBoolean();
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        // Opponent's move doesn't matter
    }

}
