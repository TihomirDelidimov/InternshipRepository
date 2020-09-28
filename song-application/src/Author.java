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
    int age;
    Song song;

    /**
     * Default constructor for initializing the Author object with values
     */
    public Author() {
        name = "George";
        age = 45;
        song = new Song();
    }

    /**
     * Constructor to initialize class's fields
     * @param name used to initialize field name
     * @param age used to initialize field age
     * @param song used to initialize field song
     */
    public Author(String name, int age, Song song) {
        this.name = name;
        this.age = age;
        this.song = song;
    }

    /**
     * Method to get class's characteristics in a String format
     * @return class's characteristics in a string format
     */
    public String toString() {
        return  "Author's name: " + name + "\n" +
                "Author's age: " + age + "\n" +
                song.toString();
    }

    /**
     * This method is used to print author's name and age
     */
    public void printAuthorNameAndAge() {
        System.out.printf("Author's name: %s \n Author's age: %d ",name,age);
    }

    /**
     * This method is used to print author and his song
     */
    public void printAuthorAndSong() {
        System.out.printf("Song's title: %s \n Authors info: %s \n",song.getTitle(), toString());
    }
}
