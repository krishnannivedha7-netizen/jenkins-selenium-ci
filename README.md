# Continuous Integration with Jenkins for Automated Tests

## Project Overview
This project demonstrates Continuous Integration (CI) using Jenkins to automatically execute Selenium WebDriver tests whenever code changes are detected in the repository.

## Tools & Technologies
- Jenkins (CI Server)
- Java (JDK)
- Maven
- Selenium WebDriver
- TestNG
- Git & GitHub

## Project Structure
- Selenium TestNG tests for web application login
- Jenkins Pipeline configured to:
  - Checkout code from GitHub
  - Build project using Maven
  - Execute automated tests
  - Publish test reports

## Jenkins Pipeline Flow
1. Code pushed to GitHub
2. Jenkins pulls latest code
3. Maven executes `mvn clean test`
4. Test results are generated and published
5. Build marked SUCCESS or FAILURE

## Execution Instructions
1. Install Java, Maven, and Jenkins
2. Clone the repository
3. Configure Jenkins job with pipeline
4. Run the pipeline manually or on code change

## Outcome
- Automated CI pipeline implemented successfully
- Selenium tests executed without manual intervention
- Test results visible in Jenkins dashboard

## Notes
For CI stability, Selenium TestNG tests are executed as part of the pipeline.
