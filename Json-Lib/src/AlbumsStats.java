import java.io.IOException;
import java.util.ArrayList;

public class AlbumsStats {
    public static void main(String[] args) {

        String filename = "collection.json";
        try {
            ArrayList<Album> albums = JsonParser.jsonFileToAlbums(filename);
            printStats(albums);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printStats(ArrayList<Album> albums) {
        int nbAlbums = 0;
        int nbSingles = 0;
        int nbDepuis2003 = 0;
        int nbNoteCinq = 0;

        for(Album album : albums){
            if (album.getType().equals("album"))
                ++nbAlbums;
            else
                ++nbSingles;
            if (album.getPublication() >= 2003)
                ++nbDepuis2003;
            if (album.getNote() == 5)
                ++nbNoteCinq;
        }
        System.out.printf("Nombre albums : %d%nNombre singles : %d" +
                "%nNombre depuis 2003 : %d%nNombre note 5 : %d%n",
                nbAlbums, nbSingles, nbDepuis2003, nbNoteCinq);
    }
}
