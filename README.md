# Docker-compose-microservices

## ✏️Descripción general
 Repositorio simple para el uso y despliegue de servicios a través de ***docker-compose***.

 Dicho repositorio muestra también como funciona, de una manera muy simple, la comunicación entre módulos. 
Por un lado tendremos un endpoint `/` que contiene el mensaje del `module-a` (`"Hello"`) y por otro lado 
tendremos el endpoint `/moduleB` que contendrá el mensaje referente al `module-b` (`"module-b!""`).

Posteriormente se ha utilizado un `RestTemplate` para favorecer dicha comunicación entre módulos
y dar lugar a un mensaje en conjunto a través del endpoint (`/`) de `module-a`: `Hello module-b!`.
En otras palabras, `module-a` llama a `module-b`.

## ️ ⚙️ Ejecución ️y configuración
Para iniciar la aplicación, debemos correr los siguientes comandos:
```
mvn clean package
```
```
docker-compose build --no-cache app
```
```
docker-compose up --build
```
Se debe tener `Docker-Desktop` en el ordenador, puesto que se va a crear un contenedor de la app (`modulea-compose-microservices-example`)
que contendrá los siguientes servicios:
- servicio con la app principal (`module-a`: [http://localhost:8080](http://localhost:8080))
- servicio con module-b (este servicio sólo es accesible a través de `module-a`)

## 🔗  Acceso a API's
>`Module a`: https://module-a.52.209.128.30.nip.io

>`Module b`: https://module-b.52.209.128.30.nip.io/moduleB

## Google Java Format
```
mvn com.coveo:fmt-maven-plugin:format
```
```
mvn com.coveo:fmt-maven-plugin:check
```

## Docker
```
mvn clean spring-boot:build-image -pl module-a
```
```
mvn clean spring-boot:build-image -pl module-b
```
```
kubectl delete service/module-a -n vass-radar-app
```
```
kubectl delete service/module-b -n vass-radar-app
```
```
kubectl delete deployment.apps/module-a -n vass-radar-app
```
```
kubectl delete deployment.apps/module-b -n vass-radar-app
```
```
kubectl apply -f service.yml
```
```
kubectl apply -f deployment.yml
```


