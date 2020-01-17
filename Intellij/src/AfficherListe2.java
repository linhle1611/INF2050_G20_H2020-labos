import java.io.IOException;

public class AfficherListe2 {

    public static void afficherFichier (String chemin) throws IOException {
        System.out.println(Utf8File.loadFileIntoString(chemin));
    }

    public static void main(String[] args) {
        String nomFichier = args.length > 0 ? args[0] : "liste.txt.txt";
        try {
            afficherFichier(nomFichier);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
