import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.IOException;
import java.util.ArrayList;

public class JsonParser {

    public static ArrayList<Album> jsonFileToAlbums (String filename) throws IOException {
        ArrayList<Album> albums = new ArrayList<>();
        String jsonString = DiskFile.loadFileIntoString(filename);
        JSONObject object = (JSONObject) JSONSerializer.toJSON(jsonString);
        JSONArray albumData =  object.getJSONArray("collection");
        jsonToAlbum(albums, albumData);
        return albums;
    }

    private static void jsonToAlbum (ArrayList<Album> albums, JSONArray data) {
        for (int i = 0; i < data.size(); ++i){
            JSONObject album = data.getJSONObject(i);
            albums.add((new Album(
                    album.getString("type"),
                    album.getString("artist"),
                    album.getString("title"),
                    album.getInt("publication"),
                    album.getInt("rating")
            )));
        }
    }
}
