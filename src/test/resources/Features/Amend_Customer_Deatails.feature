

Feature: Amend Customer Details

  Scenario: Email confirmation sent to Customer to confirm changes


    Given I am on Lumastore Admin Dashboard
    When I click on 'Customer'
    And I click on action now
    And I Click on Amend details
    And I Amend the details of the Customer
    And I click on save button
Then Customer Amendment page is displayed with a an email confirmation sent to the customer to confirm the changes