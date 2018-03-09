# WebIndividual & WebIndividualAPI - Serenity BDD

Project Name - WebIndividual

Feature files  - src/test/java/net/serenity/bdd/navigation
1. WhenUserLogin - Login Feature with 2 scnarios (tests) -

Scenario Test 1 - shouldBeAbleToNavigateToLogIn - To find the LogIn link on HomePage
Scenario Test 2 - userShouldBeAbleToLogIn - To login with user and password

2. StudentApi - API Testing For WebIndividualAPI

Scenario Test 1 - getStudentApi - GET API for WebIndividualAPI
Scenario Test 2 - addNewStudent - POST API for WebIndividualAPI

Step Files - src/test/java/net/serenity/bdd/steps
 1.   NavigatingUserSteps - Step file for WhenUserLogin feature
 2.   StudentApi Steps - Step file for Get and Post API fucntions 
 
Page Objects - src/test/java/net/serenity/bdd/ui

StudentHomePage - HomePage of WebIndividual
UserLoginPage - Login Page for Users

enums - src/test/java/net/serenity/bdd/model
Category - LogIn Link

pom.xml - Maven & Serenity Dependencies

Serenity Properties - For the report properties & Chrome driver.

Execute - Maven run - clean verify serenity:aggregate
Ouput report - index.html in target/serenity/site folder on project root.
