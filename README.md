Test Demoblaze Web Page And API On Gorest / Java-Cucumber-Selenium
===============================
Selenium-cucumber : Automation Testing Using Java

Selenium-Cucumber is a testing approach that supports Behavior Driven Development (BDD). It describes the behavior of the application in simple English text using the Gherkin language. It is cross-platform, open source and free. Automate your test cases with minimal coding

Technology Used
-------------------
   1. Java: The programming language used for writing test scripts.
   2. Cucumber: A BDD tool that allows writing tests in plain English using Gherkin syntax.
   3. Selenium: A web automation tool that interacts with web browsers to perform tests.
   4. Gradle: A build automation tool that manages project dependencies and builds.

Prerequisites
-------------------
   1. Java Development Kit (JDK) 8 or higher
   2. Gradle 6.0 or higher
   3. A compatible web browser (e.g., Chrome, Edge) and its corresponding WebDriver

Resume :
--------
- To verify the testing of web-based applications runs as expected, Selenium WebDriver is used.


**Example Scenario :**

**- First Scenario**
  
   1. Scenario: Test SignUp web random username and password
   2. Given open web Demoblaze
   3. And user click button sign up
   4. Then user should see a Sign Up modal
   5. And user input signup random username
   6. And user input signup random password
   7. And user click button sign up button on modal
   8. Then verify user will se popup message "Sign up successful."

**- Second Scenario**
   1. Scenario: Test Get list user
   2. Given Url valid for "GET_LIST_USER"
   3. And Hit api get list users
   4. Then Status code should be 200
   5. Then Validation response body get list data
   6. Then Validation response json with JSONSchema "get_list_user_normal.json"

-------------------------
To run the test cases
-------------------------
   1. Open command line
   2. Run
      apiTest command for API testing

    ./gradlew apiTest

   3. Run cucumber command for Web testing

    ./gradlew cucumber
  




