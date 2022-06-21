Feature: Web table user order feature

  #Day17_WebTable_Task2


  #@wip
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



     #Day18_WebTable_Task2
  #Scenario Outline <==> Scenario Template ayni
  #--> bunu ilk yazinca alti krimit´zi oluyor hata veriyor cünkü en altaki examples 'i istiyor

  #@wip
  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters costumer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user enters credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expirty date "<expirtyDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table


    @femaleScientists
    Examples: Famous female scientists
      | productType | quantity | customerName       | street    | city   | state   | zipcode | cardType | cardNumber       | expirtyDate | expectedName       |
      | MoneyCog    | 2        | Marie Curie        | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Marie Curie        |
      | Familybea   | 3        | Rosalind Franklin  | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Rosalind Franklin  |
      | Screenable  | 4        | List MEiter        | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | List MEiter        |
      | MoneyCog    | 5        | Chien-Shiing Wu    | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Chien-Shiing Wu    |
      | MoneyCog    | 6        | Barbara McClintock | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Barbara McClintock |


    @maleScientists
    Examples: Famous male scientists
      | productType | quantity | customerName          | street    | city   | state   | zipcode | cardType | cardNumber       | expirtyDate | expectedName          |
      | MoneyCog    | 2        | Charles Darwin        | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Charles Darwin        |
      | Familybea   | 3        | Albert Einstein       | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Albert Einstein       |
      | Screenable  | 4        | CV Raman              | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | CV Raman              |
      | MoneyCog    | 5        | Galileo               | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Galileo               |
      | MoneyCog    | 6        | Arnold Schwarzenegger | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24       | Arnold Schwarzenegger |
