import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AfficherListe {

    public static void afficherFichier (String chemin) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader(chemin));
        String ligne;
        while ((ligne = br.readLine()) != null) {
            System.out.println(ligne);
        }
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
