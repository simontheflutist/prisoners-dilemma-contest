package prisonersdilemmacontest;

import prisonersdilemmacontest.prisoners.BiasedRandomPrisoner;
import prisonersdilemmacontest.prisoners.CopyMovePrisonerMean;
import prisonersdilemmacontest.prisoners.CopyMovePrisonerNice;
import prisonersdilemmacontest.prisoners.FarrarFibPrisoner;
import prisonersdilemmacontest.prisoners.MayaPrisoner;
import prisonersdilemmacontest.prisoners.MeanPrisoner;
import prisonersdilemmacontest.prisoners.MichaelPrisoner;
import prisonersdilemmacontest.prisoners.NicePrisoner;
import prisonersdilemmacontest.prisoners.RandomLastMeanPrisoner;
import prisonersdilemmacontest.prisoners.RandomPrisoner;
import prisonersdilemmacontest.prisoners.SimonBayesPrisoner;

public class PrisonersDilemmaContest {

    public static void main(String[] args) {
//        TwoPlayerGame game = new TwoPlayerGame(new RandomPrisoner(), new CopyMovePrisonerMean());
//        System.out.println(Arrays.toString(game.play()));
        RoundRobinTournament rrt = new RoundRobinTournament(new RandomPrisoner(), new BiasedRandomPrisoner(0.3), new BiasedRandomPrisoner(0.7), new RandomLastMeanPrisoner(), new MeanPrisoner(), new NicePrisoner(), new CopyMovePrisonerMean(), new CopyMovePrisonerNice(), new SimonBayesPrisoner(), new FarrarFibPrisoner(), new MichaelPrisoner(), new MayaPrisoner());
        rrt.runTournament();
    }
}
