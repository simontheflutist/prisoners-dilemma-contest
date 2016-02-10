/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 * Michael's prisoner class.
 *
 * @author simon
 */
public class MichaelPrisoner extends PrisonerPlayer {

    private boolean betrayed = false;

    @Override
    public boolean nextMove() {
        if (betrayed) {
            return false;
        }
        return true;
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        if (oppMove == false) {
            betrayed = true;
        }
    }

    public void reset() {
        betrayed = false;
    }
}
