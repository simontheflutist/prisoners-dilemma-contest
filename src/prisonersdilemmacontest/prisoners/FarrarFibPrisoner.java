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
public class FarrarFibPrisoner extends PrisonerPlayer {

    private int roundCount = 0;

    @Override
    public boolean nextMove() {
        roundCount++;
        if (roundCount == 1 || roundCount == 2 || roundCount == 3 || roundCount == 5 || roundCount == 8) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
    }

}
