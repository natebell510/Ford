Feature: Ford page ad-hoc test

  Background: user starts on same page
    When user is on "https://www.ford.com"
  #us1
  Scenario: user checks available models
    When user clicks on SUV & Crossovers
    Then  user should see 8 models
      | 2022 ECOSPORT        |
      | 2022 ESCAPE          |
      | 2022 BRONCO SPORT    |
      | 2022 BRONCO          |
      | 2022 EXPLORER        |
      | 2022 EDGE            |
      | 2022 MUSTANCH MACH-E |
      | 2022 EXPEDITION      |
 #2
  Scenario: user checks SUV & Crossovers
    When user clicks on SUV & Crossovers
    Then user should see 4 options on bottom
      | Explore All Vehicles |
      | See Special Offers   |
      | Certified Used       |
      | Explore Fuel Choices |


 #3
  Scenario: Explore All Vehicles from SUVs
    When user clicks on SUV & Crossovers
    Then user clicks on Explore All Vehicles
    And user checks Gas checkbox
    Then user should see text under Future Vehicles "Please reset to see Future Vehicles"

  #4
  Scenario: select Gas checkbox
    When user clicks on SUV & Crossovers
    Then  user click on Explore All Vehicles
    And user checks Gas checkbox
    Then Future Vehicles checkbox is disabled

 #5
  Scenario: MACH-E is under Electric
    When user clicks on SUV & Crossovers
    Then user click on Explore All Vehicles
    And user chooses Electric
    Then user should see 2022 MUSTANG MACH-E displayed

  #6
  Scenario: Search Inventory
    When user clicks on SUV & Crossovers
    And user clicks on Certified Used
    And user scrolls to the bottom of the page
    And user clicks on Search Inventory
    Then popup with text "To help you find your ideal certified" should be displayed

 #7
  Scenario: redirected to Ford Blue Advantage page
    When user clicks on SUV & Crossovers
    And user clicks on Certified Used
    And user scrolls to the bottom of the page
    And user clicks on Search Inventory
    And user clicks on Continue
    Then user should be redirected to new page with url "https://www.fordblueadvantage.com/cars-for-sale/all"
    And title should contain "Certified Used Cars for Sale"

  #8
  Scenario: check fuel choices
    When user clicks on SUV & Crossovers
    And user clicks on Explore Fuel Choices
    And user clicks on Fuel Choices dropdown
    Then user should see 6 options:
      | Overview         |
      | All-Electric     |
      | Plug-in Electric |
      | Hybrid Electric  |
      | EcoBoost         |
      | Diesel           |

  #9
  Scenario: check all available options for 2022 MUSTANG
    When user clicks Cars
    And user clicks on 2022 MUSTANG
    And user clicks on Explore 2022 Mustang
    And user clicks on Models & Specs
    Then user should see 10 options of Mustangs

  #10
  Scenario: correct title displayed for build page
    When user clicks Cars
    And user clicks on 2022 MUSTANG
    And user clicks on Explore 2022 Mustang
    And user clicks on Models & Specs
    And user clicks on 2022 FORD MUSTANG SHELBY GT500
    And user looks through photo gallery
    And user clicks on Build & Price
    Then title contains Build Your Mustang





