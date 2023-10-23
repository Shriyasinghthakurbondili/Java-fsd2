#you will create a data table
#rows and columns = table
#the data in the rows & columns = data table
#It is always created in feature file
Feature: Create account on wiki page

  Scenario: User creates account on wiki page using input from cucumber data table
    Given User is on Create Account Page
    Then User enters following details
      | Lokesh  | admin@123 | admin@123 | Lokesh@gmail.com  |
      | Shivani | admin@123 | admin@123 | Shivani@gmail.com |
      | Shreya  | admin@123 | admin@123 | Shreya@gmail.com  |
      | Shriya  | admin@123 | admin@123 | Shriya@gmail.com  |
      | Ananya  | admin@123 | admin@123 | Ananya@gmail.com  |
    Then Account creation is successfull

  Scenario: User creates account on wiki page using input from cucumber data table
    Given User is on Create Account Page
    Then User enters following details using column name
      | Username | Password  | Retype    | Email ID          |
      | Lokesh   | admin@123 | admin@123 | Lokesh@gmail.com  |
      | Shivani  | admin@123 | admin@123 | Shivani@gmail.com |
      | Shreya   | admin@123 | admin@123 | Shreya@gmail.com  |
      | Shriya   | admin@123 | admin@123 | Shriya@gmail.com  |
      | Ananya   | admin@123 | admin@123 | Ananya@gmail.com  |
