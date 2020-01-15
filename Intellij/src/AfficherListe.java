import java.io.BufferedReader;
import java.io.FileReader;

public class AfficherListe {

    public static void afficherFichier (String chemin){
        try {
            BufferedReader br = new BufferedReader( new FileReader(chemin));
            String ligne;
            while ((ligne = br.readLine()) != null){
                System.out.println(ligne);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        if (args.length > 0){
            afficherFichier(args[0]);
        }else {
            System.out.println("Aucun chemin en argument");
        }
    }
}
