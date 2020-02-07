Maven
=====

Maven est un outil de _build_ très connu dans l'univers du développement Java.
Il propose une structure de projet et une gestion des dépendances plutôt
intéressantes. Aucune solution ne sera fournie pour les exercices mais les
manipulations nécessaires à leur réalisation seront présentées par les
monitrices durant l'atelier.

Objectifs
---------

* Créer un projet Maven.
* Manipuler les dépendances d'un projet avec le fichier `POM.xml`.
* Tenter la transition d'un projet IntelliJ vers un projet Maven.

Exercices
---------

1. Créez un projet Maven dans IntelliJ utilisant Java 11. Placez-y des classes que vous avez déjà
   fait dans un autre projet/TP/atelier, sans dépendance vers une librairie
   externe (jar).

   Assurez-vous que vous compilez et que vous exécutez le code avec Java 11.

   * Ajouter maven-compiler-plugin (voir [exemple](/solutions/maven-compiler.xml)

2. Ajoutez une dépendance vers la librairie `json-lib` dans le fichier `POM`.

   Voici le code à placer dans le `POM` :
   ```
   <dependencies>
     <dependency>
       <groupId>net.sf.json-lib</groupId>
       <artifactId>json-lib</artifactId>
       <version>2.4</version>
       <classifier>jdk15</classifier>
     </dependency>
   </dependencies>
   ```

   Ajoutez un petit bout de code qui utilise cette librairie pour vérifier que
   ça fonctionne correctement.

3. Allez sur le site [https://mvnrepository.com/](https://mvnrepository.com/).
   Trouvez la librairie Apache Commons Logging 1.2. Ajoutez cette dépendance à
   votre projet en utilisant Maven.

    * Voir [exemple](/solutions/apache-commons-logging.xml)

   Ajoutez un petit bout de code qui utilise cette librairie pour vérifier que
   ça fonctionne correctement. Le site web possède un lien vers la documentation
   de la librairie.

    * Voir [exemple](/solutions/ExampleLogging.java)

4. Prenez un projet IntelliJ classique et effectuez la transition vers un projet
   Maven. N'hésitez pas à faire des manipulations à la ligne de commande.

    Dans IntelliJ : 
        
    * Projet tool -> Add Framework support
    * Choisir Maven
    * Intellij créera la structure de dossiers et le pom.xml
    * Ouvrir pom.xml et spécifier groupID, artifactID et version

    Via ligne de commande : 

        ```sh
            mkdir -p main/java
            mkdir -p test/java
            <vim | nano> pom.xml
            # Personaliser ensuite le pom.xml
        ```

    On peut aussi utiliser la commande 

        ```sh
            mvn archetype:generate -DgroupId=<groupID> -DartifactId=<artifactId> -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false            
        ```

    Ensuite : 

    * S'assurer d'inclure le code à l'intérieur de la structure (main et test)
    * Ajouter les dépendances nécessaires au pom.xml (au minimum maven-compiler)
    * Tester avec maven install et gérer les erreurs
