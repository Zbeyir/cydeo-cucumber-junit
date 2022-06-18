Feature: Web table user order feature

  #Day17_WebTable_Task2


  @wip
  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters costumer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user enters credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expirty date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table
