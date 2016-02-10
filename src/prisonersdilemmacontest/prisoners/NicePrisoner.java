/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 * This is a nice, nice prisoner who is nice all the time.
 *
 * @author simon
 */
public class NicePrisoner extends PrisonerPlayer {

    @Override
    public boolean nextMove() {
        return true;
        // TRUE IS NICE!
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        // opponent doesn't matter
    }

}
