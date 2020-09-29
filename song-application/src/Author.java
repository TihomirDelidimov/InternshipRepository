import java.util.ArrayList;
import java.util.List;

/**
 * <h1> Author class </h1>
 * The Author class represents an author of songs
 * This class has two fields called "name" and "age". The first one represents
 * author's first name and the second one represents author's age;
 * The class has one more field called "song" which is reference to instance of Song class, it represent
 * song associated to the author.
 */
public class Author {

    String name;
    List<Song> songs = new ArrayList<Song>();
    int age;

    /**
     * Constructor for initializing the Author object with values for the author.
     */
    public Author(String name, int age, Song song) {
        this.name = name;
        this.age = age;
        songs.add(song);
    }

    /**
     * Constructor for initializing the Author object with vales. It takes
     *
     * @param name  - this parameter is the name of the author
     * @param age   - this parameter is the age of the author
     * @param songs - this is list of the songs added to the author
     */
    public Author(String name, int age, ArrayList<Song> songs) {
        this.name = name;
        this.age = age;
        this.songs.addAll(songs);
    }

    /**
     * This method add new song the author. It checks if the song parameter is consistent and then
     * adds the new song to the list of songs.
     *
     * @param song - this parameter represents the actual song of the author
     * @return boolean - return true if the song parameter is added to the list, else return false
     */
    public boolean addSong(Song song) {
        if (song != null) {
            songs.add(song);
            return true;
        } else return false;
    }

    public String getAuthorName() {
        return name;
    }

    /**
     * Method go get the object fields as String
     *
     * @return - this methods returns String, which represent object fields
     */
    public String toString() {
        return "\n" + "Author's name is: " + name +
                "\n" + "Author's age is: " + age;
    }

    /**
     * This method is used to get the songs of the author and his name
     *
     * @return String - The returned string is formatted output of the songs for the current author
     */
    public String getAuthorSongs() {
        StringBuilder authorSongs = new StringBuilder();
        authorSongs.append("Songs: \n");
        for (Song song : songs) {
            authorSongs.append(song.toString());
        }
        authorSongs.append("\n Author of those songs is:" + getAuthorName());

        return authorSongs.toString();
    }
}
