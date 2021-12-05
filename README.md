
# Compte rendu #

## Description ##

Veuillez trouver sur ce répertoire github le projet spring. J'ai malheureusement rencontré des problèmes d'initialisation du projet vers docker. 

Pour le déploiement de l'application sur docker il faut executer les commandes suivantes

``` docker build -t rendu_mongodb_lespinasse . ```
Cette commande va permettre la création de notre image docker

``` docker run -d -p 8080:8080 rendu_mongodb_lespinasse ```
Cette commande permet l'execution du conteneur docker

