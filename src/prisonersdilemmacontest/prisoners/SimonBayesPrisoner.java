/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 * Play stochastically using Simon's curious method, in which you play nice as
 * often as the opponent plays mean.
 *
 * @author simon
 */
public class SimonBayesPrisoner extends PrisonerPlayer {

    private int n = 0, m = 0;

    @Override
    public void reset() {
        n = m = 0;
    }

    @Override
    public boolean nextMove() {
        double u = (m + 1) / (n + m + 2);
        return random.nextDouble() < u;
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        if (oppMove) { // if nice
            n++;
        } else {
            m++;
        }
    }

}
