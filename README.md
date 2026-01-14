# Automated Login Testing with Cucumber and Selenium

## Description
This project automates the testing of a login form using Selenium WebDriver, Cucumber, and Java. The automation validates different login scenarios to ensure the application behaves as expected.

## Application Under Test
- URL: https://the-internet.herokuapp.com/login
- Module: Login Functionality

## Test Scenarios
- Valid login with correct credentials
- Invalid login with incorrect credentials
- Login attempt with empty username and password
- Data-driven invalid login using multiple test data sets (Bonus)

## Bonus – Data-Driven Testing
Data-driven testing is implemented using Cucumber Scenario Outline and Examples.
The same login scenario is executed multiple times with different username and password combinations.

## Tools & Technologies
- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- Maven
- Google Chrome

## Project Structure
src/test/java
 ├── stepDefinitions
 └── runner

src/test/resources
 └── features

pom.xml
README.md

## How to Run
1. Import the project into Eclipse as a Maven project
2. Configure Java 11 in Eclipse
3. Open TestRunner.java
4. Run as JUnit Test

## Expected Result
- Chrome browser opens automatically
- All login scenarios including data-driven tests are executed
- Results are displayed in the JUnit console