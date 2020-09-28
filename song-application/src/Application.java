public class Application {
    public static void main(String[] args) {

        Song highWayToHell = new Song("highWayToHell", "Rock", 5.45, "Text goes here..");

        Author george = new Author("george", 45, highWayToHell);

        Song thunderstruck = new Song("thunderstruck", "Rock", 6.10, "Text goes here..");
        george.addSong(thunderstruck);

        george.printAuthorSongs();
    }
}
