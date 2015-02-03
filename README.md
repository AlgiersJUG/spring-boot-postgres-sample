# Welcome to spring-boot-postgres Sample project

## Pre requisities
Java 8
Maven 3.1.x
Postgresql instance

## Postgres Instance Configuration
In order to use your instance please update postgres.properties
```
spring.jpa.database=POSTGRESQL
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.database.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/blood
spring.datasource.username=postgres
spring.datasource.password=postgres
```

## Run Application Locally
```mvn spring-boot:run```

to add a user make a POST like this example : ```http://localhost:9095/user/Yazid Cherfi```

to list all application users : ```http://localhost:9095/user```

## Load Sample Rows
TODO Run this script to load some useful data

## Run & Test

```curl http://localhost:9095/user```
running the above line will result to an 200 Ok HTTP response and JSON Content-Type of X Objects.