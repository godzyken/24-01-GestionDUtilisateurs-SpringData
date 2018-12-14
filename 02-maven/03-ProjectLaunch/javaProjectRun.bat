

REM ****************************************************************************
REM * DEMARRER LA JVM (JAVA VIRTUAL MACHINE) EN LUI FOURNISSANT LES ARGUMENTS SUIVANTS :
REM *
REM * ->L'EMPLACEMENT ET LE NOM DU FICHIER EXECUTABLE DU PROJET.
REM * ->LE NOM DE LA CLASSE PRINCIPALE DU PROJET (CLASSE QUI CONTIENT LA FONCTION 'main').
REM ****************************************************************************
java -verbose ^
 -jar ^
 ./target/GestionBancaire.jar ^
 afpa.cdi.banque.BanqueApplication ^
 > .\logLaunch\JavaLaunch--%date:~6,4%.%date:~3,2%.%date:~0,2%--%time:~0,2%.%time:~3,2%.%time:~6,2%.log

java -verbose ^
 -jar  ^
 ./target/GestionDUtilisateurs-Quickstart.jar ^
 afpa.cdi.GestionDUtilisateurs ^
 > .\logLaunch\JavaLaunch--%date:~6,4%.%date:~3,2%.%date:~0,2%--0%time:~1,1%.%time:~3,2%.%time:~6,2%.log
 
java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-Quickstart.jar ^
 afpa.cdi.GestionDUtilisateurs ^
 > .\logLaunch\JavaLaunch--%date:~6,4%.%date:~3,2%.%date:~0,2%--%time:~0,2%.%time:~3,2%.%time:~6,2%.log


java -verbose ^
 -classpath ^
 ./target/GestionDUtilisateurs-Quickstart.jar ^
 afpa.cdi.App ^
 > .\logLaunch\JavaLaunch--%date:~6,4%.%date:~3,2%.%date:~0,2%--0%time:~1,1%.%time:~3,2%.%time:~6,2%.log
 
java -verbose ^
 -classpath ^
 ./target/GestionDUtilisateurs-Quickstart.jar ^
 afpa.cdi.App ^
 > .\logLaunch\JavaLaunch--%date:~6,4%.%date:~3,2%.%date:~0,2%--%time:~0,2%.%time:~3,2%.%time:~6,2%.log
 

java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-00.jar ^
 > .\logExecute\Java--%date:~6,4%.%date:~3,2%.%date:~0,2%--0%time:~1,1%.%time:~3,2%.%time:~6,2%.log
 
java -verbose ^
 -jar ^
 ./target/GestionDUtilisateurs-00.jar ^
 > .\logExecute\Java--%date:~6,4%.%date:~3,2%.%date:~0,2%--%time:~0,2%.%time:~3,2%.%time:~6,2%.log
 
