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
modulea-compose build --no-cache app
```
```
modulea-compose up --build
```
Se debe tener `Docker-Desktop` en el ordenador, puesto que se va a crear un contenedor de la app (`modulea-compose-microservices-example`)
que contendrá los siguientes servicios:
- servicio con grafana (`docker-grafana`: [http://localhost:3000](http://localhost:3000))
- servicio con pgAdmin (`docker-pgadmin_container`: [http://localhost:5050](http://localhost:5050))
- servicio con la app principal (`module-a`: [http://localhost:8080](http://localhost:8080))
- servicio con module-b (este servicio sólo es accesible a través de `module-a`)
- servicio con cadvisor (`modulea-cadvisor`: [http://localhost:8090](http://localhost:8090))
- servicio con prometheus (`docker-prometheus`: [http://localhost:9090](http://localhost:9090))

> ***NOTA***: Actualmente se tiene a los servicios de `grafana` y `pgAdmin` sin ninguna configuración previa, es
> decir se puede acceder a ellos, pero no presentan datos. Se puede añadir en posteriores iteraciones en caso de 
> que se desee.

## Google Java Format
```
mvn com.coveo:fmt-maven-plugin:format
```
```
mvn com.coveo:fmt-maven-plugin:check
```

