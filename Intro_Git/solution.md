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

        ```sh
        $ git config --global user.name "username"
        $ git config --global user.email "email@domaine.ext"
        $ git config --global core.editor "vim|nano"
        $ git config --global color.ui auto
        $ git config --global push.default simple
        ```

    * Comment garder en mémoire le mot de passe une fois entré?

        ```sh
        $ git config --global credential.helper 'cache --timeout=3600'
        ```

    * Comment lister les configurations? Afficher le fichier gitconfig?

        ```sh
        $ git config --list
        $ cat ~/.gitconfig
        ```

1. Créez un dépôt local vide et un dépôt distant. Ajoutez au local un fichier `readme.txt` avec votre nom à l'intérieur. Faites un `commit` de ce fichier et un `push` sur votre dépôt distant.

    * Comment créer le dépôt distant et le lier au dépôt local?

        - Pour créer le dépôt distant : plateforme github
        - Pour le lier au dépôt local 

        ```sh
        $ git remote add origin "<url>"
        ```

    * Comment afficher l'état du dépôt git?
        
        ```sh
        $ git status
        ```

    * Pour réaliser l'énoncé

        ```sh
        $ echo "<Nom>" > readme.txt
        $ git add readme.txt
        $ git commit -m "Ajout readme"
        $ git push -u origin master # ou : git push --set-upstream origin master
        ```

2. Modifiez le fichier `readme.txt` pour y ajouter le sigle du cours. Poussez (`push`) vos changements sur le dépôt distant.

    * Pour réaliser l'énoncé

        ```sh
        $ echo "INF2050" >> readme.txt
        $ git add readme.txt
        $ git commit -m "Ajout sigle"
        $ git push
        ```

3. Supprimez complètement le répertoire contenant votre projet de votre ordinateur. Clônez le dépôt distant sur votre poste.

    * Pour réaliser l'énoncé

        ```sh
        $ cd ../
        $ rm -r "<depot>"
        $ git clone "<url>"
        ```

4. Ajoutez un programme Java dans votre dépôt. Votre programme doit être un
   FizzBuzz ([détails de FizzBuzz](https://www.jeuweb.org/showthread.php?tid=6596)).
   Faites votre FizzBuzz pour aller de 1 à 100. Poussez votre programme sur le
   dépôt distant. Assurez-vous de ne pas pousser le fichier `.class` sur le
   dépôt distant.

5. Ajoutez un fichier `.gitignore` pour ignorer les fichiers `.class`.

    * Pour réaliser l'énoncé

        ```sh
        $ echo '*.class' > .gitignore
        $ git add .gitignore
        $ git commit -m "Ajout .class au gitignore"
        $ git push
        ```

    * Quels sont les types de fichier à ignorer dans un .gitignore?

        Tous les exécutables produits par le code source et les fichiers de configurations locaux (ex : workspace.iml)

6. Modifiez votre programme pour faire le FizzBuzz de 1 à n où n est passé en paramètre au programme.

7. Partagez votre dépôt avec un collègue de classe. Votre collègue doit clôner le dépôt, y ajouter un commentaire (au début du fichier) et pousser ses changements.

    * Pour réaliser l'énoncé

        ```sh
        $ git clone "<url>"
        $ cd "<depot>"
        $ [vim | nano] FizzBuzz.java
        $ git status
        $ git commit -am "Ajout commentaire inutile"
        $ git push
        ```

8. Faites une modification sur votre dépôt ensuite en ajoutant aussi un commentaire (mais à la fin du fichier). Poussez vos changements. Le `push` devrait échouer parce que vos sources ne sont pas à jour avec le dépôt distant. Mettez vos sources à jour avec un `pull` et poussez vos changements à nouveau.

    * Pour réaliser l'énoncé

        ```sh
        $ [vim | nano] FizzBuzz.java
        $ git add FizzBuzz.java
        $ git commit -m "Ajout modification"
        $ git push # Erreur!
        $ git pull
        $ git push
        ```


9. Provoquez un conflit en modifiant tous les deux la même portion de code.
   Réglez le conflit.

    * Pour réaliser l'énoncé

        ```sh
        $ [vim | nano] FizzBuzz.java
        $ git add FizzBuzz.java
        $ git commit -m "Ajout modification"
        $ git push # Erreur, conflit!!
        $ [vim | nano] FizzBuzz.java 
        # On corrige le code selon les besoins
        $ git add FizzBuzz.java
        $ git commit -m "Fix conflit"
        $ git push
        ```

10. Faites un changement dans le code (introduisez un bogue par exemple). Faites
    le `commit` du bogue. Annulez la modification (`revert`) et replacez votre
    dépôt local comme il l'était avant l'introduction du bogue.

    * Pour réaliser l'énoncé

        ```sh
        $ [vim | nano] FizzBuzz.java
        $ git add FizzBuzz.java
        $ git commit -m "Ajout bug"
        $ git push 
        $ [vim | nano] FizzBuzz.java
        $ git add FizzBuzz.java
        $ git log # Permet de trouver le numéro du commit
        $ git revert <#commit>
        $ git push 
        ```

11. Pratiquez d'autres commandes utiles.

    * Comment désindexer des modifications?

        ```sh
        $ git reset HEAD "<fichier>"
        ```
    * Comment annuler des modifications non mises à l'index?

        ```sh
        $ git checkout "<fichier>"
        ```
    * Comment remettre le dépôt local dans l'état du dépot distant (et annuler les commits locaux)

        ```sh
        $ git reset --hard HEAD # Efface les modifications
        $ git reset --soft HEAD # Garde les modifications
        ```

    * Comment trouver le coupable d'un bug?

        ```sh
        $ git blame "<fichier>"
        ```

12. Comment utiliser git dans Intellij?

    * [Documentation Intellij pour git](https://www.jetbrains.com/help/idea/set-up-a-git-repository.html)

13. Bonus 

    * Comment lier une clé ssh à votre user Github/lab?

        ```sh
        $ ssh-keygen
        # Suivre les indications. Si la clé existe déjà, utiliser la vieille.

        $ cat ~/.ssh/id_rsa.pub
        # Afficher la cle publique et la copier
        ```

    - Ensuite : github.com -> settings -> SSH and GPG keys -> new ssh key

    * Comment créer un dépôt github distant via la ligne de commande?

        Voir script gitinit ([Générer un token github](https://github.com/settings/tokens))

