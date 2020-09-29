/**
 * This class represents song
 * This class has 4 fields - title, genre and timing of the song and lyrics which is the content.
 */
public class Song {
    String title;
    Genre genre;
    double timing;
    String lyrics;

    /**
     * Constructor to generate Song's object
     *
     * @param title  - this parameter represent the title of the song
     * @param genre  - this parameter represent the genre of the song
     * @param timing - this parameter represent the timing of the song
     * @param lyrics - this parameter represent the lyrics of the song
     */
    public Song(String title, Genre genre, double timing, String lyrics) {
        if (title != null && genre != null && lyrics != null &&
                !title.isEmpty() && !lyrics.isEmpty() && timing > 0.0) {
            this.title = title;
            this.genre = genre;
            this.timing = timing;
            this.lyrics = lyrics;
        }
    }

    public String getSongLyrics() {
        return lyrics;
    }

    public double getSongTiming() {
        return timing;
    }

    /**
     * Method to get the song's title
     *
     * @return String - song's title in String format
     */
    public String getSongTitle() {
        return title;
    }

    /**
     * Method to get class's characteristics in a String format
     *
     * @return Strnig -  class's characteristics in a string format
     */
    public String toString() {
        return "\nTitle: " + title + "\n" +
                "Genre: " + genre.toString() + "\n" +
                "Timing " + timing + "\n" +
                "Lyrics" + lyrics + "\n";
    }

    /**
     * This method compares two genres and return true if the genres are equals and false if they are not
     *
     * @param genre -  this param is the genre of the song
     * @return boolean - this method return true if the genre parameter is equal to the genre of the object, else it return false
     */
    public boolean compareGenre(String genre) {
        if (genre == null || genre.isEmpty()) {
            return false;
        }
        return genre.equalsIgnoreCase(this.genre.toString());
    }
}
