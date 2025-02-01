package Unrunable;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {

    private String title;           // TV-seriens tittel
    private String description;     // En beskrivelse av TV-serien
    private LocalDate releaseDate;  // TV-seriens utgivelsesdato
    private ArrayList<Episode> episodes = new ArrayList<>();     // epiosder i serien



    // CONSTRUCTORS

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }



    // METHODS

    @Override
    public String toString() {
        return "\n--TVSeries info--" +
                "\nTitle: " + title +
                "\nDescription: " + description +
                "\nRelease Date: " + releaseDate +
                "\nEpisodes: " + episodes.size();
    }


    public void addEpisode(Episode episode) {
        this.episodes.add(episode);
    }


    // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisode(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }
}
