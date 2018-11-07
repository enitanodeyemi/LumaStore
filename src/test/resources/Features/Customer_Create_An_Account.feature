# Author : Enitan
# Title: Customer Create an Account

@CreateAccount
Feature: Customer Create an Account


Scenario: Valid Email Address

  Given Customer on Create new customer Page
  When I enter "Ode" as Last Name
  And I enter "eny@yahoo.com" as Valid Email
  And I enter “abraca” as Password
  And I enter  “abraca” as Confirm Password
  And I click on Create an Account
  Then My Account Page is Displayed Successfully



