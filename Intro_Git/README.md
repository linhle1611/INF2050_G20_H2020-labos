Git
===

Dans cet atelier, vous serez initié à l'utilisation de git à la ligne de
commande. Aucune solution ne sera fournie pour les exercices mais les
manipulations nécessaires à leur réalisation seront présentées par les moniteurs
durant l'atelier.

Vous devez avoir un compte [GitHub](https://github.com/) pour réaliser cet
atelier.

Objectifs
---------

* Manipuler les fonctionnalités principales de git à la ligne de commande.
* Manipuler un dépôt distant.

Exercices
---------

0. Configurez votre environnement git

    * Comment configurer les informations de compte sur votre git local?
    * Comment garder en mémoire le mot de passe une fois entré?
    * Comment lister les configurations? Afficher le fichier gitconfig?

1. Créez un dépôt local vide et un dépôt distant. Ajoutez au local un fichier `readme.txt` avec votre nom à l'intérieur. Faites un `commit` de ce fichier et un `push` sur votre dépôt distant.

    * Comment créer le dépôt distant et le lier au dépôt local?
    * Comment afficher l'état du dépôt git?

2. Modifiez le fichier `readme.txt` pour y ajouter le signe du cours. Poussez
   (`push`) vos changements sur le dépôt distant.

3. Supprimez complètement le répertoire contenant votre projet de votre
   ordinateur. Clônez le dépôt distant sur votre poste.

4. Ajoutez un programme Java dans votre dépôt. Votre programme doit être un
   FizzBuzz ([détails de FizzBuzz](https://www.jeuweb.org/showthread.php?tid=6596)].
   Faites votre FizzBuzz pour aller de 1 à 100. Poussez votre programme sur le
   dépôt distant. Assurez-vous de ne pas pousser le fichier `.class` sur le
   dépôt distant.

5. Ajoutez un fichier `.gitignore` pour ignorer les fichiers `.class`.

    * Quels sont les types de fichier à ignorer dans un .gitignore?

6. Modifiez votre programme pour faire le FizzBuzz de 1 à n où n est passé en paramètre au programme.

7. Partagez votre dépôt avec un collègue de classe. Votre collègue doit clôner
   le dépôt, y ajouter un commentaire (au début du fichier) et pousser ses 
   changements.

8. Faites une modification sur votre dépôt ensuite en ajoutant aussi un
   commentaire (mais à la fin du fichier). Poussez vos changements. Le `push`
   devrait échouer parce que vos sources ne sont pas à jour avec le dépôt
   distant. Mettez vos sources à jour avec un `pull` et poussez vos changements
   à nouveau.

9. Provoquez un conflit en modifiant tous les deux la même portion de code.
   Réglez le conflit.

10. Faites un changement dans le code (introduisez un bogue par exemple). Faites
    le `commit` du bogue. Annulez la modification (`revert`) et replacez votre
    dépôt local comme il l'était avant l'introduction du bogue.

11. Pratiquez d'autres commandes utiles.

    * Comment désindexer des modifications?
    * Comment annuler des modifications non mises à l'index?
    * Comment remettre le dépôt local dans l'état du dépot distant (et annuler les commits locaux)
    * Comment trouver le coupable d'un bug?

12. Comment utiliser git dans Intellij?

13. Bonus 

    * Comment lier une clé ssh à votre user Github/lab?
    * Comment créer un dépôt github distant via la ligne de commande?

