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
public class BiasedRandomPrisoner extends PrisonerPlayer {

    private final double niceRatio;

    public BiasedRandomPrisoner(double niceRatio) {
        super();
        this.niceRatio = niceRatio;
    }

    @Override
    public boolean nextMove() {
        return random.nextDouble() < niceRatio;
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
    }

}
