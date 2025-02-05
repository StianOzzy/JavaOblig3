import Unrunable.Episode;
import Unrunable.TVSeries;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Oppgave 2.2 - Opprette objekter
        // Creating a TVSeries object
        TVSeries GameOfThrones = new TVSeries("Game of Thrones", "A great show", LocalDate.of(2011,4,17));

        // Testing the TVSeries object in a print
        System.out.println("\n" + GameOfThrones);
        System.out.println("\n(TVSeries object has no episodes)");

        // Oppgave 2.4 - Hente episoder i sesong
        // Loops for adding episodes
        int seasonCounter = 1;
        while (seasonCounter < 6) {
            int epCounter = 1;
            while (epCounter < 11) {
                String currentEpisodeName = "GoT_S" + seasonCounter + "E" + epCounter;
                Episode ep = new Episode(currentEpisodeName,epCounter,seasonCounter,60);
                GameOfThrones.addEpisode(ep);
                epCounter++;
            }
            seasonCounter++;
        }

        // Testing the Episode Objects, to see if they were added to the TVSeries object
        System.out.println("\n" + GameOfThrones);
        System.out.println("\n(TVSeries object now has episodes)");

        // Testing the Episode Objects in a separate print, to see if naming was done correctly.
        System.out.println("\n" + GameOfThrones.getEpisodes());

        // Oppgave 2.3 - Utskrift og toString()
        // Testing @Override toString() functionality
        System.out.println(GameOfThrones.toString());
        System.out.println(GameOfThrones.getEpisodes().get(0).toString());

    }

}
