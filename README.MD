# Short URL Maker
### by Adrian Angara

This is a repository containing my project assessment as part of IC Thrive's interview process.
It is an API that shortens long URLs by creating a unique identifier that will direct the request to the desired page. 

As such, this project utilizes the following technologies:
* Java 
* Spring Boot
* H2 virtual database 

## How to run locally

1. Clone repo into local machine
2. Run the following commands on a terminal:
    * mvn clean install
    * mvn spring-boot:run
    
3. Open a browser and go to > http://localhost:8080/api/ping to test if the application is functional

4. Create a short URL as described the section entitled "Endpoints" below

5. Copy the created short URL into a browser and enter


## Endpoints

Please use a client application such as Postman to utilize these endpoints.

### Endpoint 1: /api/ping

HTTP Method: GET

Sample response object:
    
        {"success":true}

### Endpoint 2: /api/

HTTP Method: POST

Sample request object:

        {"longURL":https://www.cbc.ca/sports/olympics/winter/young-canadian-olympians-poised-to-lead-way-italy-2026-winter-games-1.6358543}
    
Sample response object: 

        {"shortURL": "http://localhost:8080/sCmaOmCIoR"}

