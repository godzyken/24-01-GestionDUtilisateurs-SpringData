
REM ****************************************************************************
REM * LANCER LE JAR DU MODULE 'PERSISTENCE'.
REM *
REM * POUR CELA, EFFECTUER LA PROCEDURE CI-DESSOUS :
REM *
REM ****************************************************************************
REM * (01.)SE PLACER DANS LE REPERTOIRE DU MODULE 'PERSISTENCE'.
REM *
REM ****************************************************************************
REM * (02.)DEMARRER LA JVM ('java') EN LUI FOURNISSANT LES ARGUMENTS SUIVANTS :
REM *
REM *      (02.01.)L'OPTION '-jar' 
REM *              PREREQUIS : LE JAR CONTIENT UN FICHIER 'MANIFEST.MF' AVEC LE 'FQN' DE LA CLASSE 'MAIN'.
REM *
REM *      (02.02.)LE CHEMIN ET LE NOM DU FICHIER EXECUTABLE ('JAR') DU PROJET.
REM * 
REM *      (02.03.)LE 'FQN' DE LA CLASSE PRINCIPALE DU PROJET (ICI C'EST OPTIONNEL !!!).
REM ****************************************************************************

cd GestionDUtilisateurs-03-persistence

java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-03-persistence.jar ^
 > .\logExecute\run--GestionDUtilisateurs-03-persistence--%date:~6,4%.%date:~3,2%.%date:~0,2%--0%time:~1,1%.%time:~3,2%.%time:~6,2%.log
 
java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-02-persistence.jar ^
 > .\logExecute\run--GestionDUtilisateurs-02-persistence--%date:~6,4%.%date:~3,2%.%date:~0,2%--%time:~0,2%.%time:~3,2%.%time:~6,2%.log
 
java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-03-persistence.jar ^
 > .\logExecute\run--GestionDUtilisateurs-03-persistence.log

 
REM ****************************************************************************
REM * LANCER LE JAR DU MODULE 'BUSINESS'.
REM *
REM * POUR CELA, EFFECTUER LA PROCEDURE CI-DESSOUS :
REM *
REM ****************************************************************************
REM * (01.)SE PLACER DANS LE REPERTOIRE DU MODULE 'BUSINESS'.
REM *
REM ****************************************************************************
REM * (02.)DEMARRER LA JVM ('java') EN LUI FOURNISSANT LES ARGUMENTS SUIVANTS :
REM *
REM *      (02.01.)L'OPTION '-jar' 
REM *              PREREQUIS : LE JAR CONTIENT UN FICHIER 'MANIFEST.MF' AVEC LE 'FQN' DE LA CLASSE 'MAIN'.
REM *
REM *      (02.02.)LE CHEMIN ET LE NOM DU FICHIER EXECUTABLE ('JAR') DU PROJET.
REM * 
REM *      (02.03.)LE 'FQN' DE LA CLASSE PRINCIPALE DU PROJET (ICI C'EST OPTIONNEL !!!).
REM ****************************************************************************

cd GestionDUtilisateurs-03-business

java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-03-business.jar ^
 > .\logExecute\run--GestionDUtilisateurs-03-business--%date:~6,4%.%date:~3,2%.%date:~0,2%--0%time:~1,1%.%time:~3,2%.%time:~6,2%.log
 
java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-02-business.jar ^
 > .\logExecute\run--GestionDUtilisateurs-02-business--%date:~6,4%.%date:~3,2%.%date:~0,2%--%time:~0,2%.%time:~3,2%.%time:~6,2%.log
 
java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-03-business.jar ^
 > .\logExecute\run--GestionDUtilisateurs-03-business.log
 