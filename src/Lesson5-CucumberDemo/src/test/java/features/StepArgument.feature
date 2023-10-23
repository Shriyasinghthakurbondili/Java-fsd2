#""" (Doc Strings)
##this is used when we nhave to write 2 to 3 lines of text in the feature file
## instead of writing it in a single line, you can write it in multiple lines using Doc Strings
## Doc String is represent with """
Feature: Email page Test

Scenario: New file for docString demo
When I reset my password on the email
Then I should receive an email with following content
"""
Hello Shriya,
 please click on this to reset the password
Thanks,
Admin Team.
""" 