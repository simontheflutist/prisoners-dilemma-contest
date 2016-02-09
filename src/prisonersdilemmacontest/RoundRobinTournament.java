/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonersdilemmacontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Play a round-robin tournament among many prisoners, scoring sets of multiple
 * games.
 *
 * @author simon
 */
public class RoundRobinTournament {

    protected static class ScoredPrisoner {

        private final PrisonerPlayer prisoner;
        private double score;

        public ScoredPrisoner(PrisonerPlayer prisoner) {
            this.prisoner = prisoner;
            this.score = 0;
        }

        public void addToScore(double dscore) {
            this.score += dscore;
        }

        public double getScore() {
            return this.score;
        }

        public PrisonerPlayer getPrisoner() {
            return this.prisoner;
        }

    }

    public static int GAMES_PER_SET = 10;

    private final List<ScoredPrisoner> prisoners;

    public RoundRobinTournament(PrisonerPlayer... prisoners) {
        this.prisoners = new ArrayList<>();
        for (final PrisonerPlayer prisoner : prisoners) {
            ScoredPrisoner sp = new ScoredPrisoner(prisoner);
            this.prisoners.add(sp);
        }
    }

    public void runTournament() {
        final int len = prisoners.size();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                double[] account = new double[]{0, 0};

                ScoredPrisoner ScoredPrisoner1 = prisoners.get(i);
                ScoredPrisoner ScoredPrisoner2 = prisoners.get(j);

                for (int k = 0; k < GAMES_PER_SET; k++) {
                    ScoredPrisoner1.getPrisoner().reset();
                    ScoredPrisoner2.getPrisoner().reset();
                    TwoPlayerGame game = new TwoPlayerGame(ScoredPrisoner1.getPrisoner(), ScoredPrisoner2.getPrisoner());

                    double[] gameScore = game.play();

                    account[0] += gameScore[0];
                    account[1] += gameScore[1];
                }

                System.out.println(
                        ScoredPrisoner1.getPrisoner().getClass().getName()
                        + " vs. "
                        + ScoredPrisoner2.getPrisoner().getClass().getName()
                        + ": "
                        + Arrays.toString(account));

                ScoredPrisoner1.addToScore(account[0]);
                ScoredPrisoner2.addToScore(account[1]);
            }
        }

        // now print the results
        System.out.println("\nRESULTS:");
        for (ScoredPrisoner sp : prisoners) {
            System.out.println(sp.getPrisoner().getClass().getName() + " " + sp.getScore());
        }
    }

}
