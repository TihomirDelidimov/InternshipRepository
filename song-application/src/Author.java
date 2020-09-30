import java.util.ArrayList;
import java.util.Arrays;
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

    private String name;
    private List<Song> songs = new ArrayList<>();
    private int age;

    /**
     * Constructor for initializing the Author object with values for the author and songs for him.
     * This constructor works with array of Song objects
     */
    public Author(String name, int age, Song... songs) {
        if (isValid(name, age, songs)) {
            this.name = name;
            this.age = age;
            this.songs = new ArrayList<>(Arrays.asList(songs));
        }
    }

    /**
     * This method checks for valid Author parameters
     *
     * @param name  - this parameter is the name of the author
     * @param age   - this parameter is the age of the author
     * @param songs - this parameter is the actual song or songs of the author
     * @return - this method returns true if the parameters are valid and else if they are not
     */
    private boolean isValid(String name, int age, Song... songs) {
        if (name != null && age > 0 && age < 125 && songs.length > 0 && !name.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * This method add new song the author. It checks if the song parameter is consistent and then
     * adds the new song to the list of songs.
     *
     * @param song - this parameter represents the actual song of the author
     * @return boolean - return true if the song parameter is added to the list, else return false
     */
    public boolean add(Song song) {
        if (song != null) {
            songs.add(song);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    /**
     * Method go get the object fields as String
     *
     * @return String - this methods returns String, which represent object fields
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
    public String getSongs() {
        StringBuilder authorSongs = new StringBuilder();
        authorSongs.append("Songs: \n")
                .append(songs)
                .append("\nAuthor of those songs is: ")
                .append(getName());

        return authorSongs.toString();
    }
}
