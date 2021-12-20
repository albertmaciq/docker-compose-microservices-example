# Docker-compose-microservices

## ✏️Descripción general
 Repositorio simple para el uso y despliegue de servicios a través de ***docker-compose***.
En principio sólo tendremos un endpoint **`/`** que contendrá el mensaje `"Hello World!"`.

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
Se debe tener `Docker-Desktop` en el ordenador, puesto que se va a crear un contenedor de la app (`docker-compose-microservices-example`)
que contendrá los siguientes servicios:
- servicio con grafana (`docker-grafana`: [http://localhost:3000](http://localhost:3000))
- servicio con pgAdmin (`docker-pgadmin_container`: [http://localhost:5050](http://localhost:5050)) (Ver apartado `Configuración pgAdmin`)
- servicio con la app (`docker-example`: [http://localhost:8080](http://localhost:8080))
- servicio con cadvisor (`docker-cadvisor`: [http://localhost:8090](http://localhost:8090))
- servicio con prometheus (`docker-prometheus`: [http://localhost:9090](http://localhost:9090))

> ***NOTA***: Actualmente se tiene a los servicios de `grafana` y `pgAdmin` sin ninguna configuración previa, es
> decir se puede acceder a ellos, pero no presentan datos. Se puede añadir en posteriores iteraciones en caso de 
> que se desee.

