# Révision examen intra INF2050


## Introduction

- Les outils sont les logiciels que nous utilisons pour nous aider à mieux développer d'autres logiciels.
- Le processus de développement correspond à l'ensemble des pratiques utilisées par une équipe de développement. Ce processus est généralement documenté et réspecté pour garantir un résultat uniforme.

-- Vulgairement: le génie logiciel est comment développer un logiciel avec un processus en suivant des normes normalisées.

- Le développement de logiciels est l'ensemble des activités nécessaires à la création d'un logiciel, allant de l'idée originale jusqu'au déploiement.
	Le processus de développement est l'ensemble des pratiques et la séquence à laquelle ils sont faits.
	Le développement de logiciels est `généralement` un travail d'équipe.

#####  Cycle de vie d'un logiciel :
##### Analyse des exigences : 

Comprendre les exigences pour pouvoir développer un logiciel qui va les satisfaire.

##### Conception :

`Comment` on va développer le logiciel (classes, méthodes..).

##### Réalisation :

Rédiger/ produire le code source.  

##### Test : 

Vérifier que tout marche correctement.
Contrôle de qualité (une pratique servant à detecter les erreurs dans le logiciel).

##### Déploiement :

L'ensemble des activités qui mettent le logiciel à disposition.

##### Maintenance :

Mises à jour, adaptation et correction des bogues.

#### Logiciel de qualité :

Un logiciel qui répond aux attentes de ses utilisateurs.

#### Code de qualité :

- Code facile à lire, à comprendre (lisibilité) et à modifier (maintenabilité).
Donc une mauvaise programmation (code mal structuré) engendre plus de couts de maintenance.

=> Vulgairement : La qualité du logiciel est relié à la satisfaction utilisateur alors que la qualité du code facilite la vie du programmeur et a un impact sur les coûts.

- Plus le développement est rapide et efficace meilleure est la productivité, on ne doit jamais sacrifier la qualité afin d'améliorer la productivité; les deux sont améliorées simultanément.
Exemple: Si on n'est pas productifs c'est qu'on passe beaucoup de temps à "nettoyer" il faut donc améliorer la productivité.

## Normes de codification:

#### Style :

Le style peut être : 
	 La mise en page des commentaires.
	 La position des déclarations des variables.
	 L'indentation.
     L'aération horizontale. 
	 La nomenclature ..
	 => Tout ce qui peut toucher à l'esthétique du code source.
	 
- L'aération horizontale (placement des espaces) améliore la lisibilité.
-  Les espaces permettent de mettre en évidence les opérateurs, les variables .. 
- En Java, comme en Python l'indentation prend 4 espaces. (norme préetablie)
- La lisibilité du code est grandement affectée par le style; différents styles dans un même projet vont nuire é la lecture et à la lisibilité donc à la maintenance.
- Les membres d'une équipe doivent faire "une entente" leur permettant d'uniformiser le code; ça devient une norme de codification ou un standard de programmation.

#### L'élément primordiale dans un code source est son uniformité.
#### RQ:

Peu importe le style utilisé, tant que `TOUTE` l'équipe suit la même norme.

#### Nomenclature :

L'élément le plus important du style.

- Un nom significatif d'une variable va décrire à quoi elle va servir, non son contenu.
Ça évite de mettre des commentaires.

### La casse : (normes préétablies)

- #### Java :

camelCase : méthodes (commencent par un verbe) et variables.
PascaleCase : classes (commencent par un nom).
UPPER_SNAKE_CASE : contantes.

- #### Python :

snake_case : fonctions et variables.

- #### Javascript : `(généralement)`

hyphen-case : variables et constantes.

- #### RQ :

Il faut garder les normes simples et courtes, sinon elles seront difficiles à mémoriser donc à appliquer.

- Mise en forme automatique : Beautifier
- Verification automatique du style : checkstyle
 Sont ou peuvent être integrés à l'IDE (environnement de développement intégré).

#### Conclusion :

Autant que possible, suivez les standards du langages, sinon documentez votre norme de codification de façon courte et simple.
Le développeur doit se concentrer sur autre chose que le style durant son travail. 
  
## Gestion de sources :

Un logiciel qui gére le code source permet :
- Les modifications
- Plusieurs versions
- Modifications concurrentes
 2 personnes qui modifient le même fichier en même temps

- Imputabilité des changements 
 `qui` a modifié quoi à quel moment.

- Historique des modifications
 `a quel moment` les modifications ont été faites, par qui et sur quel fichier.

- Pas de possibilité d'écraser le travail de quelqu'un d'autre.
- Les gestionnaires de source sont faits pour favoriser le travail dans une équipe de développeurs.

Un gestionnaire de source permet :
- mises à jour des sources
- retours en arrière 
- consulter les anciennes versions d'un fichier

#### Qualités :

- Simplicité d'utlisation
Productivité du développeur
Documentation pertinente 
- Flexibilité
- Rapidité

#### RQ :

On ne doit pas inclure le code généré (exemple : .iml) , les binaires (ne passent pas à l'épreuve du temps , exemple : .class ), les documents d'analyse et les diagrammes UML.
=> Tout ça va dans le .gitignore.

Il existe deux types de gestionnaires de source:
- Centralisé (SVN)
communication via réseau
**Gros inconvénient** : Si je commit un code qui ne compile pas ça va bousiller le programme chez `tout le monde`.

- Décentralisé : (Git)
 Local repository + remote repository
 **Avantage** : Si je commit un code qui ne compile pas ça ne fera rien tant que je *NE PUSH PAS*

![Processus git décentralisé](git_depot_decentralisé.png)

### Commandes :
- `git init` : Crée un dépôt local pour un nouveau projet.
- `git clone <url>` : Crée un dépôt local en téléchargeant un dépot distant déjà existant.
- `git add <fichier>` : Ajoute un fichier modifié à l'index.
- `git checkout <fichier>` : Prend le fichier tel que dans l'index et le remt dans mon working tree.
- `git rm` : Supprime du working tree + ajoute l'option de suppression de l'historique (tant que je ne push pas le fichier/répertoire n'est pas supprimé du dépôt distant ni du dépôt local il est juste supprimé de l'index).
- `git diff <fichier>` : Présente les  les modifications faites dans un fichier.
- `git commit` : Les modifications passent de l'index au local repository.
- `git reset <fichier>` : Retire les modifications d'un fichier de l'index (avant un commit).
- `git commit -a` = `git add .` + `git commit .`
- `git commit -m <message>` : Commit en spécifiant une description, facilite la recherche de commits dans l'historique.
- `git reset -hard HEAD` : Ça écrase l'index et le répértoire local pour remettre tout à la dernière version qui est sur le dépôt distant.
HEAD : Contient le dernier commit 

- `git clean -df`: Efface tout ce qui n'est pas dans l'index.
- `git log` :  Affiche l'historique des commits.
- `git blame <fichier>` : Affiche *qui* a modifié chaque ligne du fichier.
- `git push` : Du dépot local vers le dépot local vers le dépot distant.
- `git pull` : Du dépot distant vers le dépot local (des conflits peuvent survenir lors de cette opération).
- `git revert <commit>` : Crée un nouveau commit qui supprime les modifications de l'acien.
**Ne supprime pas l'ancien commit et ne l'annule pas.**
**RQ : Les commandes des questions bonus ont été vues en lab.**

### Conflicts:
- Les conflicts surviennent quand deux personnes ont modifié la même ligne de code.
- Git vous de mandera laquelle conserver.
=> Il faut résoudre un conflit avec un nouveau commit.

### Conclusion:
Un gestionnaire de source est indispensable en toute situation pour un développeur, seul ou en équipe, peu importe la taille de l'équipe et peu importe la taille du projet.
**Il faut l'utiliser toujours et en tout temps.**


## Environnement de développement 
*Un livrable* est ce qu'on doit livrer au client.
Ça peut-être :
- Le code source  
- Les tests  
- Les fichiers connexes (JAR, SQL, ant, etc.) 
- Les versions du logiciel  
- Les dépendances et leurs versions  
- Projet construit (déployé)
- La documentation
 - - Pour développeurs
 - - Pour opérateurs
 - - Pour gestionnaires 
 - - Pour utilisateurs
 - - Wiki

*RQ:* Diagrammes servent à la communication dans l'équipe et non à la documentation du logiciel.

*Ècosystème de développement* : 
Le coffre d'outils d'un développeur, plusieurs outils logiciels qui cohabitent  ensemble
- Editeur de text + Shell ou CLI (puissance)
 _CLI = Command Line Interface_
- IDE (convivialité)
- Gestionnaire de source
- Outils de qualité (beautifier, test..) 
- Outils de construction

Dépendement de la puissance des outils et de leur maitrise par les développeurs, un écosystème peut améliorer grandement la productivité d'une équipe de développement.

## Construction automatisée :
*Le livrable le plus important est le logiciel exécutable.*
Si le logiciel ne fonctionne pas, la documentation ne sert à rien.

**Étapes possibles de la construction de logiciel:**
- Génération du code
- Vérification du style
- Compilation
- Édition des liens (en C/C++)
- Génération du bytecode (.class en Java)
- Compilation et génération de la documentation (exp: Javadoc)
- Création des librairies (.jar)
- Création des répertoires, copie des fichiers
- Modification des permissions (fichiers et répertoires)
- Execution des tests

**Outils de build**
Les instructions servant à la construction du logiciel peuvent être faites manuellement, mais ce travail manuel est répétitif et sujet aux erreurs et oublis.

Il existe des outils permettant l'automatisation de build
- Les Makefile par exemple (faits avec l'outils make) nous permettent d'automatiser toutes les manipulations qui touchent à la production du logiciel.

*Outils Connus*:
- make : syntaxe cible dépendance (chaque morceau est une cible: compiler, generer la javadoc..)
- Ant : pour l'interportabilité pas pour la simplicité de syntaxe
Le script doit etre placé à la racine du projet et le fichier doit s'appeller build.xml, ainsi la plupart des IDE vont le supporter directement
- Maven : Construction plus évoluée due Ant.
Convention over configuration (en suivant les régles préetablies il n'y a presque pas de configuration àfaire pour le faire fonctionner)
*Convontions: règles, façons de faire*
- Buildr (avec Ruby)
- Gradle (avec Groovy)
*RQ: Ce qui execute Ant c'est du code Java, pas Shell comme pour make.
`task`: les taches Ant qu'on veut créer/réaliser.*

**Maven** :
Permet
- La gestion de dépendences (.jar)
- La construction  
- Le déploiement  
- L'exécution des tests

Le fichier POM doit contenir :
- Le nom du programme
-  Comment je dois le packagé
- Configurations supplémentaires
- Spécification des dépendances
*RQ: Maven ajoute automatiquement les dépendances de nos dépendances. -> dépendances transitives*

Maven s'utilise à la ligne de commande ou s'intègre à l'IDE.






## Test :
*L'outils le plus important à maitriser : git.*

*Le deuxième : les tests unitaires.*

 **RQ** : Un bon test unitaire  doit être 
 pertinant.
 court.
 avec une seule assertion.
Si il y a 2 assertions par test, il se peut que la première soit en echec, la deuxième ne passera donc pas et on pensera que le test ne marche pas.
  
 indépendant des autres tests.

- **Test unitaire** : Sert à vérifier une toute petite partie du code.
- **Test de régression** : Toujours automatisés, qu'on garde durant toute la durée de vie du logiciel.
- **Test fonctionnel** : Vérifie une fonctionnalité du système; peut être fait à partir de l'interface utilisateur.
*RQ* : Un test unitaire est un test de régression. Un test fonctionnel automatisé est un test de régression.
- **Test de charge** :  Pour les applications web (exemple: 5000 utilisateurs pendant 1h qu'est ce que ça va engendrer).
- **Test d'integration** :  Ces tests sont faits à la fin du déploiement. On crée un environnement identique auquel le logicel va etre déployé. 
- **Test d'acceptation** : Le logiciel va-t-il satisfaire aux attentes du client?
C'est pour ça qu'il faut demandé au client quels sont ses critères de satisfaction.
**Toutes les formes de tests sont recommandées dans un projet de développement logiciel.**

**RQ**:
Un test unitaire ne doit pas :
- Manipuler un fichier  
- Traiter avec une base de données  
- Effectuer une communication sur un réseau Dépendre d'un environnement de test Communiquer avec le système d'exploitation.
=> Se baser sur quelque chose de l'environnement extérieur génère encore plus d'erreurs. 

**Bonnes pratiques**

- Entretenir le code de test comme si c'était du code de production.
	Éliminer la duplication.  
	Faire du refactoring.
	Appliquer des patrons de test.
- Essayer de n'avoir qu'une assertion par test.
- Avoir une bonne couverture de tests.
- Exécuter nos tests après chaque modification du code.

**Bogues**

*Un bogue est un test oublié!*
Lorsqu'on détecte un nouveau bogue, on tente de l'isoler dans un test unitaire.
Ce test nous assure qu'on ne réinjectera pas le bogue une deuxième fois dans le code.

**Annotations**:
- Les méthodes de test doivent avoir l'annotation `@Test` et doivent contenir un exemple concret de l'utilisation d'une méthode .
- `@Ignore` Sert à ignorer un test.
Quand on sait que *temporairement* un test n'est pas cohérent. Si ce n'est pas temporaire c'est qu'il ne fallait pas écrire ce test.
- `@Test(timeout=10)` Sert à faire échouer un test (après 10 sec dans cet exemple) si la méthode est trop longue à s'exécuter.
- `@Before` indique que la méthode sera exécutée avant chaque test, habituellement nommée setUp
- `@After` indique que la méthode sera exécutée après chaque test, habituellement nommée tearDown
-`@BeforeClass` exécutera la méthode une seule fois avant l'ensemble des tests de la classe
- `@AfterClass` exécutera la méthode une seule fois après l'ensemble des tests de la classe
 Question Bonus : A partir de JUnit5 l'annotation `@Before` est remplacée par `@BeforeEach`, `@After` par `@AfterEach`, `@BeforeClass` par `@BeforeAll` et `@AfterClass` par `@AfterAll`.

**Assertions**
Une assertion est une condition qui doit etre vraie et qui sert à verifier que le test et la méthode testée marchent comme souhaité.
(voir notes de cours)
- `assertSame` : même pointeur + même adresse mémoire.
- `assertThrows` : vérifie les exceptions lancées (voir l'exemple du laboratoire 5)

### Conclusion : Améliorer un code -> Écrire un code facile à tester.

