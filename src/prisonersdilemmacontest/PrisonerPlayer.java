/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest;

import java.security.SecureRandom;
import java.util.Random;

public abstract class PrisonerPlayer {

    protected static final Random random = new SecureRandom();

    public abstract boolean nextMove();

    public abstract void processOpponentMove();
}
