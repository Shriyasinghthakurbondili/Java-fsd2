#In BDD, the test data will be put inthe feature file
#username: admin@gmail.com
#password: admin@123
#If you have a small test data to be passed to the feature step, then use :
#Example Keyword
#'<EmailId>' is a placHolder, it is like an object or variable which will store the test data for the step
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
Feature: Enter login Credentials on tutorialsNinja Page

  Scenario Outline: Test username and password for Login Page
    Given I am on tutorialsNinja Homepage
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click login button

    Examples: 
      | EmailId         | password  |
      | admin@gmail.com | admin@123 |
