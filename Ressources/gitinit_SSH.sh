#!/bin/bash
# Version utilisant la connexion type SSH
# Attention! Modifiez username par votre utilisateur et token par le token généré via github
# https://github.com/settings/tokens pour générer un token
USER='MaxNicol'
TOKEN='<TOKEN>'
# Stocker le nom du répertoire courant dans une variable
DEPOT=${PWD##*/}
# Création du dépôt distant via l'API Github
curl -u "${USER}:${TOKEN}" --request POST 'https://api.github.com/user/repos' -d '{"name":"'"$DEPOT"'", "private": true}' && \
# Initialiser le dépôt local
git init && \
# Lier le dépôt local au dépôt distant
git remote add origin "git@github.com:${USER}/${DEPOT}.git" && \
# Ajouter les fichiers locaux si ils existent
if [ ! -z "$(ls)" ]; then
    git add . && git commit -m "Commit initial" && git push -u origin master
fi
