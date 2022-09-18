 #/bin/bash
mvn clean package
docker-compose build --no-cache app
docker-compose up --build

