/**
 * This class represents song which has 4 attributes
 * This class has 4 fields - title, genre and timing of the song and lyrics which is the content.
 */
public class Song {
    private String title;
    private Genre genre;
    private String lyrics;
    private double timing;

    /**
     * Constructor to generate Song's object
     *
     * @param title  - this parameter represent the title of the song
     * @param genre  - this parameter represent the genre of the song
     * @param timing - this parameter represent the timing of the song
     * @param lyrics - this parameter represent the lyrics of the song
     */
    public Song(String title, Genre genre, double timing, String lyrics) {
        if (isValid(title, genre, timing, lyrics)) {
            this.title = title;
            this.genre = genre;
            this.timing = timing;
            this.lyrics = lyrics;
        }
    }

    /**
     * This methods checks for valid Song parameters
     *
     * @param title  - this parameter is the title of the song
     * @param genre  - this parameter is the genre of the song
     * @param timing - this parameter is the timing of the song
     * @param lyrics - this parameter is content(text) of the song
     * @return - This method return true if the parameters are valid and false if they are not
     */
    private boolean isValid(String title, Genre genre, double timing, String lyrics) {
        if (title != null && genre != null && lyrics != null &&
                !title.isEmpty() && !lyrics.isEmpty() && timing > 0.0) {
            return true;
        }
        return false;
    }

    public String getLyrics() {
        return lyrics;
    }

    public double getTiming() {
        return timing;
    }

    /**
     * Method to get the song's title
     *
     * @return String - song's title in String format
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to get class's characteristics in a String format
     *
     * @return Strnig -  class's characteristics in a string format
     */
    @Override
    public String toString() {
        return "\nTitle: " + title + "\n" +
                "Genre: " + genre + "\n" +
                "Timing: " + timing + "\n" +
                "Lyrics" + lyrics + "\n";
    }

    /**
     * This method compares two genres and return true if the genres are equals and false if they are not.
     *
     * @param genre -  this param is the genre of the song
     * @return boolean - this method return true if the genre parameter is equal to the genre of the object, else it return false
     */
    public boolean compareGenre(Genre genre) {
        if (genre != null && genre == this.genre) {
            return true;
        }
        return false;
    }
}
