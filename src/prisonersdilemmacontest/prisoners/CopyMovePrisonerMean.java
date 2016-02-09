/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 * This prisoner simply copies the previous move. If forced to move first, he
 * plays mean.
 *
 * @author simon
 */
public class CopyMovePrisonerMean extends PrisonerPlayer {

    /**
     * Start mean.
     */
    private boolean nextMove = false;

    @Override
    public boolean nextMove() {
        return this.nextMove;
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        this.nextMove = oppMove;
    }

}
