/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 * This is a mean, mean prisoner who is mean all the time.
 *
 * @author simon
 */
public class MeanPrisoner extends PrisonerPlayer {

    @Override
    public boolean nextMove() {
        return false;
        // FALSE IS MEAN!
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        // opponent doesn't matter
    }

}
