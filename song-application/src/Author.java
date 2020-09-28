import java.util.ArrayList;
import java.util.List;
/**
 * <h1> Author class </h1>
 * The Author class represents an author of songs
 */

public class Author {
    /**
     * This class has two fields called "name" and "age". The first one represents
     *      author's first name and the second one represents author's age;
     * The class has one more field called "song" which is reference to instance of Song class, it represent
     *      song associated to the author.
     */
    String name;
    List <Song> songs;
    int age;

    /**
     * Default constructor for initializing the Author object with values
     */
    public Author(String name, int age,Song song) {
        this.name = name;
        this.age = age;
        songs = new ArrayList<Song>();
        songs.add(song);
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    /**
     * Method to get class's characteristics in a String format
     * @return class's characteristics in a string format
     */
    public String toString() {
        return  "Author's name: " + name + "\n" +
                "Author's age: " + age + "\n";
    }

    /**
     * This method is used to print author's name and age
     */
    public void printAuthor() {
        System.out.printf("Author's name: %s \n Author's age: %d ",name,age);
    }

    /**
     * This method is used to print author and his songs
     */
    public void printAuthorSongs() {
        System.out.println("Songs:");
        for(Song song : songs)
            System.out.print(song.toString());
        System.out.print("The author of those songs is:" + name);
    }
}
