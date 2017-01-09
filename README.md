# Welcome to spring-boot-postgres Sample project

## Pre requisites
Java 8
Maven 3.3.x
PostGreSql running instance (H2 for dev profile)

## Postgres Instance Configuration
In order to use your instance please update the [ Database Configuration Section ] section in ```src/main/resources/application.yml```

```yaml
#
# [ Database Configuration Section ]
#
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/blood
    username: postgres
    password: postgres
    platform: POSTGRESQL
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
server:
  port: 9095
  
#
# [ Other Configuration Attributes ]
#
```

## Run Application Locally
```mvn -Dspring.profiles.active={dev-prod} spring-boot:run```

## Run Integration Tests
```mvn test```

## Load Sample Data
schema and data are initialized using ```schema-${platform}.sql``` and ```data-${platform}.sql```

## Invoke Application

### through browser
to make POST requests from your browser use tools like POSTMAN : https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop


to add a user make a POST like this example : ```http://localhost:9095/user/Tarik Ibn Ziad```
to list all application users : ```http://localhost:9095/user```

### Add a user
```curl -X POST "http://localhost:9095/user/Abderrazak%20BOUADMA"```
running the above POST request will result to an 200 Ok HTTP response and JSON Content-Type of Application/json of the new created object.
the url must be URL_ENCODED before making the request (notice the %20 which encodes the white space character).

### List All Users
```curl "http://localhost:9095/user"```
running the above GET request will result to an 200 Ok HTTP response and JSON Content-Type of Application/json and a list (maybe empty) of all users in DB

