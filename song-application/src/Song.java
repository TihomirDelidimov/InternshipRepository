/**
 * This class represents song
 */
public class Song {
    String title;
    String genre;
    double timing;
    String lyrics;

    /**
     * Constructor to generate Song's object
     * @param title
     * @param genre
     * @param timing
     * @param lyrics
     */
    public Song(String title, String genre, double timing, String lyrics) {
        if(!title.isEmpty() && !genre.isEmpty() && !lyrics.isEmpty() && timing!=0.0) {
            this.title = title;
            this.genre = genre;
            this.timing = timing;
            this.lyrics = lyrics;
        }
    }



    /**
     * Method to get class's characteristics in a String format
     * @return class's characteristics in a string format
     */
    public String toString() {
        return "\nTitle: " + title + "\n"+
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
     * @return song's title in String format
     */
    public String getTitle() {
        return title;
    }

    public boolean compareGenre(String genre) {
        if(this.genre.equalsIgnoreCase(genre))
            return true;
        else
            return false;
    }

    public void printSongTiming() {
        System.out.println("Song's timing: " + timing);
    }

    public void printSongText(){
        System.out.println("Song's text: " + lyrics);
    }
}
