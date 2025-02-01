import Unrunable.Episode;
import Unrunable.TVSeries;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("---Test Objects---");

        TVSeries GameOfThrones = new TVSeries("Game of Thrones", "A great show", LocalDate.of(2011,4,17));
        System.out.println("\n" + GameOfThrones);

        Episode GameOfThrones_S1E1 = new Episode("Winter Is Coming", 1,1,62);
        Episode GameOfThrones_S1E2 = new Episode("The Kingsroad", 2,1,56);
        Episode GameOfThrones_S1E3 = new Episode("Lord Snow", 3,1,58);

        int seasonCounter = 1;
        while (seasonCounter < 6) {
            int epCounter = 1;
            while (epCounter < 11) {
                String CurrentEP = "GameOfThronesS" + seasonCounter + "E" + epCounter;
                System.out.println(CurrentEP);
                epCounter++;
            }
            seasonCounter++;
        }
        System.out.println("\n" + GameOfThrones_S1E1);
        System.out.println("\n" + GameOfThrones_S1E2);
        System.out.println("\n" + GameOfThrones_S1E3);

        GameOfThrones.addEpisode(GameOfThrones_S1E1);
        GameOfThrones.addEpisode(GameOfThrones_S1E2);
        GameOfThrones.addEpisode(GameOfThrones_S1E3);


        System.out.println("\n" + GameOfThrones);
        System.out.println("\n" + GameOfThrones.getEpisodes());

    }

}
