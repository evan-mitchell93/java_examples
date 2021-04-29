

public class FactoryPatternMain{
    public static void main(String[] args){
        SongFactory songFactory = new SongFactory();

        //get a song object of ROCK
        Song song1 = songFactory.getSong("ROCK");

        song1.play();

        //get a song object of CLASSICAL
        Song song2 = songFactory.getSong("CLASSICAL");

        song2.play();

        //get a song object of COUNTRY
        Song song3 = songFactory.getSong("COUNTRY");

        song3.play();
    }
}