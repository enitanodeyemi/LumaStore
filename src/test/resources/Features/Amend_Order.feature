



  Feature: Amend Order

  Scenario: Amendment to Trigger Refund if item total less than Original Price

    Given the customer on Account dashboard page
    When the Customer clicks on My Order tab
    And the Customer searches for Above order number 1234
    And clicks to Amend the order 1234 above
    Then the Amendment confirmation page is displayed with confirmation reference link sent to the Customer’s email address successfully
