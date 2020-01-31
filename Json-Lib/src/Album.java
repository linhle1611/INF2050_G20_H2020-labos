public class Album {

    private String type;
    private String artiste;
    private String titre;
    private int publication;
    private int note;

    public Album(String type, String artiste,
                 String titre, int publication,
                 int note) {
        this.type = type;
        this.artiste = artiste;
        this.titre = titre;
        this.publication = publication;
        this.note = note;
    }
    public String getType() {
        return type;
    }
    public String getArtiste() {
        return artiste;
    }
    public String getTitre() {
        return titre;
    }
    public int getPublication() {
        return publication;
    }
    public int getNote() {
        return note;
    }
}
