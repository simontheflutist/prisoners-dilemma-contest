/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest.prisoners;

import prisonersdilemmacontest.PrisonerPlayer;

/**
 * This player is essentially keeping track of points. If it is ahead or behind
 * in points for this match, it will be mean. If it is equal in points, it will
 * be nice. Always stars nice: 0 == 0.
 *
 * @author Maya
 */
public class MayaPrisoner extends PrisonerPlayer {

    /**
     * Start nice.
     */
    private boolean nextMove = true;
    private int myPoints = 0, oppPoints = 0, roundCount = 0;

    @Override
    public boolean nextMove() {
        if (roundCount == 9) {
            this.nextMove = false;              //If program is on tenth round, be mean.
        } else if (myPoints == oppPoints) {
            this.nextMove = true;    //If points for match are the same, be nice.
        } else {
            this.nextMove = false;                             //If points for the match aren't the same, be mean.
        }
        return this.nextMove;
    }

    @Override
    public void processOpponentMove(boolean oppMove) {
        if (this.nextMove == true && oppMove == true) {
            myPoints += 2;
            oppPoints += 2;
        } //If both are nice, each get 2 points.
        else if (this.nextMove == true && oppMove == false) {
            oppPoints += 5;
        } //If I am nice and opp. is mean, they get 5 points.
        else if (this.nextMove == false && oppMove == true) {
            myPoints += 5;
        }             //If I am mean and opp. is nice, I get 5 points.
        //If both are mean, nothing changes (both get 0).
        roundCount++;
    }

    @Override
    public void reset() {
        myPoints = 0;           //Reset point values.
        oppPoints = 0;
    }
}
