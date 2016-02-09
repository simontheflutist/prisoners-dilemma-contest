/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest;

import java.util.ArrayList;
import java.util.List;

/**
 * Play a round-robin tournament among many prisoners, scoring sets of multiple
 * games.
 *
 * @author simon
 */
public class RoundRobinTournament {

    class ScoredPrisoner {

        private final PrisonerPlayer prisoner;
        private double score;

        public ScoredPrisoner(PrisonerPlayer prisoner) {
            this.prisoner = prisoner;
            this.score = 0;

        }

        public boolean nextMove() {
            return prisoner.nextMove();
        }

        public void processOpponentMove(boolean oppMove) {
            prisoner.processOpponentMove(oppMove);
        }

    }

    public static int GAMES_PER_SET = 100;

    private final List<ScoredPrisoner> prisoners;

    public RoundRobinTournament(List<PrisonerPlayer> prisoners) {
        this.prisoners = new ArrayList<>();
        for (final PrisonerPlayer prisoner : prisoners) {
            ScoredPrisoner sp = new ScoredPrisoner(prisoner);
            this.prisoners.add(sp);
        }
    }

}
