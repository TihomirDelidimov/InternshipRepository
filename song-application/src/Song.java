/**
 * This class represents song
 */
public class Song {
    /**
     * This class has 4 fields.
     * title which is the title of the song, genre and timing of the song. And lyrics which is the content.
     */
    String title;
    String genre;
    double timing;
    String lyrics;

    /**
     * Constructor to generate Song's object
     *
     * @param title
     * @param genre
     * @param timing
     * @param lyrics
     */
    public Song(String title, String genre, double timing, String lyrics) {
        if (!title.isEmpty() && !genre.isEmpty() && !lyrics.isEmpty() && timing != 0.0) {
            this.title = title;
            this.genre = genre;
            this.timing = timing;
            this.lyrics = lyrics;
        }
    }

    /**
     * Method to get class's characteristics in a String format
     *
     * @return class's characteristics in a string format
     */
    public String toString() {
        return "\nTitle: " + title + "\n" +
                "Genre: " + genre + "\n" +
                "Timing " + timing + "\n" +
                "Lyrics" + lyrics + "\n";
    }

    /**
     * This method prints the class's characteristics to the console
     */
    public void printSongs() {
        System.out.println(toString());
    }

    /**
     * Method to get the song's title
     *
     * @return song's title in String format
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method compares two genres and return true if the genres are equals and false if they are not
     *
     * @param genre this param is the genre of the song
     * @return true or false
     */
    public boolean compareGenre(String genre) {
        if(genre == null || genre.isEmpty()) {
            return false;
        }
        return genre.equalsIgnoreCase(this.genre);
    }

    /**
     * This method prints song's timing in the console
     */
    public void printSongTiming() {
        System.out.println("Song's timing: " + timing);
    }

    /**
     * This method prints song's text
     */
    public void printSongText() {
        System.out.println("Song's text: " + lyrics);
    }
}
