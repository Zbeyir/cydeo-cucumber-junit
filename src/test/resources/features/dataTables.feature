Feature: Examples of Cucumber data table implementations

  #DAY_16
  #@wip
  Scenario: List of fruits I like
    Then user shoul see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

    # to beatify the pipes above
  # cmmand + option + l


  #day_17-Task06
  #@wip
  Scenario:  User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

