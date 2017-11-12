#Book store backend

This application serves as a book store data source.
It exposes :

  - books
  - authors
  
## Running the application

To run the application, use the following commands :

    mvn clean install -U
    cd book-store-webapp
    mvn spring-boot:run
    
This will expose a server at [http:localhost:8080](http:localhost:8080).

## Generating the APIs

The APIs are generated using [Swagger](https://swagger.io/).
Place your api definitions in **book-store-infrastructure/src/main/resources/api/api.yml**.
The sources are generated using the following command :

    mvn generate-sources
    
Generated files are available at **book-store-infrastructure/java-generated**.

## Mocking

The API is mocked using [WireMock](http://wiremock.org/).
Place your mock files in the **book-store-infrastructure/src/test/resources/mock** folder.
When packaging (mvn package) the application, the files are copied to the **target** folder.

To run a wiremock instance, use the following commands:

    mvn clean package
    cd book-store-infrastructure/target/mock
    java -jar wiremock-standalone.jar --port 8181
    
Mock will be available at [http://localhost:8181](http://localhost:8181).