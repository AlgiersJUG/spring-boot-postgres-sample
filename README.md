# Welcome to spring-boot-postgres Sample project

## Pre requisities
Java 8
Maven 3.1.x
Postgresql instance

## Postgres Instance Configuration
In order to use your instance please update the [ Database Configuration Section ] section in ```src/main/resources/dev/application.properties```
```properties
#
# [ Database Configuration Section ]
#
spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
#spring.database.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/blood
spring.datasource.username=postgres
spring.datasource.password=postgres
#
# [ Other Configuration Attributes ]
#
```

## Run Application Locally
```mvn spring-boot:run```

## Run Integration Tests
```mvn test -DhsqldbIntegrationTest=true```

## Load Sample Data
schema and data are initialized using ```schema-${platform}.sql``` and ```data-${platform}.sql```

## Invoke Application

### through browser
to make POST requests from your browser use tools like : https://chrome.google.com/webstore/detail/rest-console/cokgbflfommojglbmbpenpphppikmonn


to add a user make a POST like this example : ```http://localhost:9095/user/Yazid Cherfi```
to list all application users : ```http://localhost:9095/user```

### Add a user
```curl -X POST "http://localhost:9095/user/Abderrazak%20BOUADMA"```
running the above POST request will result to an 200 Ok HTTP response and JSON Content-Type of Application/json of the new created object.
the url must be URL_ENCODED before making the request (notice the %20 which encodes the white space character).

### List All Users
```curl "http://localhost:9095/user"```
running the above GET request will result to an 200 Ok HTTP response and JSON Content-Type of Application/json and a list (maybe empty) of all users in DB

