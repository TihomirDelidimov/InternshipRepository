import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Song highWayToHell = new Song("highWayToHell", Genre.CLASSIC, 5.45, "Text goes here..");

        Author george = new Author("George", 45, highWayToHell);

        Song thunderstruck = new Song("thunderstruck", Genre.ELECTRONIC, 6.10, "Text goes here..");
        george.add(thunderstruck);

        List<Author> authorList = new ArrayList<>();
        authorList.add(george);

        for (Author author : authorList) {
            System.out.print(author.getSongs());
        }


    }
}
