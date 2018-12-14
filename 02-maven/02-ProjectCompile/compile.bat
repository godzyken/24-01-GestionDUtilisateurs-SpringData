SET currentTime=%date:~-4,4%%date:~-10,2%%date:~-7,2%-%time:~0,2%%time:~3,2%%time:~6,2%

ECHO **********************************************************************************************************
ECHO * (01.)EFFECTUER LES OPERATIONS SUIVANTES :
ECHO *
ECHO *      - NETTOYER LE PROJET
ECHO *      - COMPILER LE PROJET (GENERER LES CLASSES EN BYTE-CODE).
ECHO *      - GENERER LE FICHIER EXECUTABLE DU PROJET.
ECHO *      - COPIER LE FICHIER EXECUTABLE DANS LE DEPOT MAVEN LOCAL.
ECHO **********************************************************************************************************
mvn clean install -e -X > logCompile\compile-project--%currentTime%.log
