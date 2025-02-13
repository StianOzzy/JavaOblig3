package Unrunable;

public class Production {
    private String title;           // Episodens tittel
    private int runtime;            // Episodens spilletid i minutter



    // CONSTRUCTORS

    public Production(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    public Production(String title) {
        this.title = title;
    }

    // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
