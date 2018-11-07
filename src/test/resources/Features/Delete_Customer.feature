
  Feature: Delete Customer

    Scenario: Deleted Customer should not be able to access their Account

      Given I am on Lumastore Admin Dashboard
      And I click on 'customer'
      And I click on 'Actions'
      And I click on 'Delete'
      And I click on 'yes' to the pop up message "Are you sure you want to delete selected customer"
      Then the customer details is deleted Successfully

