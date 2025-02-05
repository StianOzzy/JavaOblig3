// Oppgave 2.1 - Modellklasser

package Unrunable;

public class Episode {

    private String title;           // Episodens tittel
    private int episodeNumber;   // Episodens nummer i sesongen
    private int seasonNumber;    // Nummeret på sesongen episoden er fra
    private int runtime;            // Episodens spilletid i minutter



    // CONSTRUCTORS

    public Episode (String title, int episodeNumber, int seasonNumber, int runtime) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtime = runtime;
    }

    public Episode (String title, int episodeNumber, int seasonNumber) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }



    // METHODS
    // Oppgave 2.3 - Utskrift og toString()

    @Override
    public String toString() {
        return "\n--Episode info--" +
                "\nTitle: " + title +
                "\nEpisode Number: " + episodeNumber +
                "\nSeason Number: " + seasonNumber +
                "\nRuntime: " + runtime +
                "\n";
    }



    // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
