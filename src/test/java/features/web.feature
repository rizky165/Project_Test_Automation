Feature: Test Automation on Demoblaze

  @web
  Scenario: Test SignUp web normal
    Given open web Demoblaze
    And user click button sign up
    Then user should see a Sign Up modal
    And user input signup username "rizky123"
    And user input signup password "pattaya123"
    And user click button sign up button on modal
    Then verify user will se popup message "This user already exist."


  @web
  Scenario: Test SignUp web random username and password
    Given open web Demoblaze
    And user click button sign up
    Then user should see a Sign Up modal
    And user input signup random username
    And user input signup random password
    And user click button sign up button on modal
    Then verify user will se popup message "Sign up successful."


  @web
  Scenario: Test login web normal
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"

  @web
  Scenario: Test logout web normal
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click logout button

  @web
  Scenario: Test login invalid password
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya321"
    And user click login button
    Then verify user will se popup message "Wrong password."

  @web
  Scenario: Test login invalid username
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky3124"
    And user input password "pattaya123"
    And user click login button
    Then verify user will se popup message "User does not exist."

  @web
   Scenario: Test next button on homepage
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click next button

  @web
  Scenario: Test previous  button on homepage
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click previous button


  @web
   Scenario: Test delete item on cart
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click item
    And user click button add to cart
    Then verify user will se popup message "Product added."
    And user click cart menu
    And user delete button

  @web
  Scenario: Filling the purchase form with the empty field
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click item
    And user click button add to cart
    Then verify user will se popup message "Product added."
    And user click cart menu
    Then verify total price item
    And user click button place order
    And user click purchase
    Then verify user will se popup message "Please fill out Name and Creditcard."

  @web
  Scenario: Filling the purchase form with only the name field filled
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click item
    And user click button add to cart
    Then verify user will se popup message "Product added."
    And user click cart menu
    Then verify total price item
    And user click button place order
    And user input name
    And user click purchase
    Then verify user will se popup message "Please fill out Name and Creditcard."

  @web
  Scenario: Filling the purchase form with only the credit card field filled
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click item
    And user click button add to cart
    Then verify user will se popup message "Product added."
    And user click cart menu
    Then verify total price item
    And user click button place order
    And user input credit card
    And user click purchase
    Then verify user will se popup message "Please fill out Name and Creditcard."

  @web
  Scenario: Test order item normal
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click item
    And user click button add to cart
    Then verify user will se popup message "Product added."
    And user click cart menu
    Then verify total price item
    And user click button place order
    And user input name
    And user input country
    And user input city
    And user input credit card
    And user input month
    And user input year
    And user click purchase
    Then user should see message success purchase "Thank you for your purchase!"

  @web
  Scenario: Test send message to contact
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click menu contact
    And user input contact email
    And user input contact name
    And user input message
    And user click send message button
    Then verify user will se popup message "Thanks for the message!!"

  @web
  Scenario: Test send message without fill the form
    Given open web Demoblaze
    And user click button login
    Then user should see a Sign Up modal
    And user input username "rizky123"
    And user input password "pattaya123"
    And user click login button
    Then user should see welcome message "Welcome rizky123"
    And user click menu contact
    And user click send message button
    Then verify user will se popup message "Thanks for the message!!"