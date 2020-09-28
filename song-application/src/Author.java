import java.util.ArrayList;
import java.util.List;

/**
 * <h1> Author class </h1>
 * The Author class represents an author of songs
 */

public class Author {
    /**
     * This class has two fields called "name" and "age". The first one represents
     * author's first name and the second one represents author's age;
     * The class has one more field called "song" which is reference to instance of Song class, it represent
     * song associated to the author.
     */
    String name;
    List<Song> songs;
    int age;

    /**
     * Constructor for initializing the Author object with values
     */
    public Author(String name, int age, Song song) {
        this.name = name;
        this.age = age;
        songs = new ArrayList<Song>();
        songs.add(song);
    }

    /**
     * This method add new song the author
     *
     * @param song this parameter represents the actual song of the author
     */
    public void addSong(Song song) {
        songs.add(song);
    }

    /**
     * This method prints author's name and age
     */
    public void printAuthor() {
        System.out.println("Author's name is: " + name + "\n" + "Author's age is: " + age);
    }

    /**
     * This method is used to print author and his songs
     */
    public void printAuthorSongs() {
        System.out.println("Songs:");
        for (Song song : songs)
            System.out.print(song.toString());
        System.out.print("The author of those songs is:" + name);
    }
}
