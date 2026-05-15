#!/bin/bash

echo -e "Building docker image...\n"
docker build -t estoque-de-produtos .

echo -e "Starting the program...\n"
docker run -it estoque-de-produtos
