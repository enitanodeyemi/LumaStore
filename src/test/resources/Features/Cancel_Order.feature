


Feature: Cancel Order

  Scenario: Cancellation Fees should be applied


    Given the Customer on My account dashboard
    And the Customer clicks on My Order
    And the Customer clicks on Active order 2345
    And the Customer clicks on Cancel Order
    Then message confirming Order cancelled with cancellation reference no. is sent to the Customer’s email address



