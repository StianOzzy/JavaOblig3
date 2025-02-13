package Unrunable;

public class Episode extends Production {

    private int episodeNumber;   // Episodens nummer i sesongen
    private int seasonNumber;    // Nummeret på sesongen episoden er fra



    // CONSTRUCTORS

    public Episode(String title, int runtime, int episodeNumber, int seasonNumber) {
        super(title, runtime);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;

    }

    public Episode(String title, int episodeNumber, int seasonNumber) {
        super(title);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }



    // METHODS

    @Override
    public String toString() {
        return "\n--Episode info--" +
                "\nTitle: " + this.getTitle() +
                "\nEpisode Number: " + episodeNumber +
                "\nSeason Number: " + seasonNumber +
                "\nRuntime: " + this.getRuntime() +
                "\n";
    }



    // GETTERS AND SETTERS

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

}
