package UsingMethods.CollectionsProject.Set.Execute;

import UsingMethods.CollectionsProject.Set.Domain.SecondSetSessionDomain;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondSetSession {
    public static void main(String[] args) {
        System.out.println("Criando uma lista com valores aleatórios utilizando HashSet");

        Set<SecondSetSessionDomain> myShows = new HashSet<>() {{
       add(new SecondSetSessionDomain("Breaking Bad", "Drama", 62));
       add(new SecondSetSessionDomain("The Office", "Comedy", 60));
       add(new SecondSetSessionDomain("Dark", "Fantasy", 46));
        }};

        for(SecondSetSessionDomain series : myShows){
            System.out.println("Show name: "+series.getNameShow()+", \nGenre: "+series.getGenre()+", \nAverage time per episode: "+series.getEpisodeTime()+"\n================");
        }

        System.out.println("Natural Order below, but remember, elements that are equals won't appear on the exit");
        Set<SecondSetSessionDomain> myShowsInOrder = new TreeSet<>(myShows);
        System.out.println("=======================================");

        for(SecondSetSessionDomain seriesInOrder : myShowsInOrder){
            System.out.println("Show name: "+seriesInOrder.getNameShow()+", \nGenre: "+seriesInOrder.getGenre()+", \nAverage time per episode: "+seriesInOrder.getEpisodeTime()+"\n================");
        }
    }
}
