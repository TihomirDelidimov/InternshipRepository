public class Song {
    String title;
    String genre;
    double timing;
    String lyrics;

    Song(){

    }

    public void getSong(){
        System.out.println("Title of the song: " + title);
        System.out.println("Genre of the song:" + genre);
        System.out.println("Duration of the song:" + timing);
        System.out.println("Text of the song: " + lyrics);
    }

    public boolean compareGenre(String genre){
        if(this.genre.equalsIgnoreCase(genre))
            return true;
        else
            return false;
    }


}
