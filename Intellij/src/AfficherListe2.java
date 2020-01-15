public class AfficherListe2 {

    public static void afficherFichier (String chemin){
        try {
            System.out.println(Utf8File.loadFileIntoString(chemin));
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
