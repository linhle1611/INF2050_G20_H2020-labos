Introduction à IntelliJ
=======================

IntelliJ est l'outil de développement intégré qui sera utilisé durant la
session. Les fonctionnalités élémentaires d'IntelliJ seront présentés durant
l'atelier.

Objectifs
---------

* Apprendre à utiliser IntelliJ.
* Construire, compiler et exécuter un premier programme Java.
* Ajouter un jar à un projet.

Exercices
---------

1. Faire un Hello World!

    * File -> New -> Project
    * Choisir Java et JDK approprié
    * Create from template -> HelloWorld
    * Définir répertoire

2. Créer une classe et dans le main, permutez les valeurs de deux variables de type int.

    * src -> new class
    * Configurations -> edit configurations -> `+` -> Application

3. Ajoutez un fichier texte à votre projet contenant une liste de vos livres
   préférés (un titre par ligne).

    * new -> file
    * Ou :

      ```
        touch livres.txt
        nanon | vim livres.txt
      ```

4. Ajoutez une classe à votre projet ayant la responsabilité de lire le fichier
   texte et afficher son contenu à la console (un titre par ligne). Invoquez
   cette nouvelle classe dans votre main. 

    * Comment passer le nom du fichier en argument?

5. Créez un nouveau projet IntelliJ. Téléchargez la librairie [Apache Commons IO](https://commons.apache.org/proper/commons-io/download_io.cgi)
   et ajoutez le jar à votre projet. Ajoutez la classe
   [Utf8File.java](Utf8File.java) (vous pouvez la modifier) et votre fichier
   texte de l'exercice #3 à votre projet. Refaite l'exercice #4 en utilisant la
   classe Utf8File.

   * Télécharger la librairie Apache Commons IO : 
   
        ```
        wget http://apache.mirror.globo.tech//commons/io/binaries/commons-io-2.6-bin.tar.gz
        tar -xvf commons-io-2.6-bin.tar.g
        cp commons-io-2.6/commons-io-2.6.jar <path>
        ```

        Puis File->Project Structures -> Modules -> `+` -> Jar or directories


   * Inclure la classe Utf8File.java

        ```
        wget https://raw.githubusercontent.com/jacquesberger/exemplesINF2050/master/ateliers/IntelliJ/Utf8File.java
        mv Utf8File.java src/
        ```

