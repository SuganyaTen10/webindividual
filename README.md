# webindividual - Serenity BDD for LogIn

Project Name - WebIndividual

Feature files  - src/test/java/net/serenity/bdd/navigation
  WhenUserLogin - Login Feature with 2 scnarios (tests) -

Scenario Test 1 - shouldBeAbleToNavigateToLogIn - To find the LogIn link on HomePage
Scenario Test 2 - userShouldBeAbleToLogIn - To login with user and password

Step Files - src/test/java/net/serenity/bdd/steps
    NavigatingUserSteps - Step file for WhenUserLogin feature

Page Objects - src/test/java/net/serenity/bdd/ui

StudentHomePage - HomePage of WebIndividual
UserLoginPage - Login Page for Users

enums - src/test/java/net/serenity/bdd/model
Category - LogIn Link

pom.xml - Maven & Serenity Dependencies

Serenity Properties - For the report properties & Chrome driver.

Execute - Maven run
Ouput report - index.html in target/serenity/site folder on project root.
