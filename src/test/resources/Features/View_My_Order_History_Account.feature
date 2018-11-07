

  Feature: View My Order History Account

    Scenario: Active Orders

      Given the Customer on 'My Account' Page
      When the Customer navigates to 'My Account' Dashboard
      And the Customer clicks on 'My Orders'
      Then all 'Active Orders' is displayed Successfully
