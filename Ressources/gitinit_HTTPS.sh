#!/bin/bash
# Version utilisant la connection type HTTPS
# Attention! Modifiez username par votre utilisateur. Vous devrez rentrer votre mdp à l'exécution.
# https://github.com/settings/tokens pour générer un token
USER='<USERNAME>'
# Stocker le nom du répertoire courant dans une variable
DEPOT=${PWD##*/}
# Création du dépôt distant via l'API Github
curl -u "${USER}" --request POST 'https://api.github.com/user/repos' -d '{"name":"'"$DEPOT"'", "private": true}' && \
# Initialiser le dépôt local
git init && \
# Lier au dépôt distant
git remote add origin "https://github.com/${USER}/${DEPOT}.git" && \
# Ajouter les fichiers du répertoires si présent
if [ ! -z "$(ls)" ]; then
    git add . && git commit -m "Commit initial" && git push -u origin master
fi
