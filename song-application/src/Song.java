/**
 * This class represents song
 */
public class Song {
    String title;
    String genre;
    double timing;
    String lyrics;

    public Song() {
        title = "High way to Hell";
        genre = "rock";
        timing = 3.54;
        lyrics = "Song's text here...";
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
