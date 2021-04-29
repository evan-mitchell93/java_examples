public class SongFactory {
    public Song getSong(String songGenre){
        if(songGenre == null){
            return null;
        }
        else if(songGenre.equalsIgnoreCase("ROCK")){
            return new Rock();
        }
        else if(songGenre.equalsIgnoreCase("COUNTRY")){
            return new Country();
        }
        else if(songGenre.equalsIgnoreCase("CLASSICAL")){
            return new Classical();
        }

        return null;
    }
    
}
