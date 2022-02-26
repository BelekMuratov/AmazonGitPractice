@Smoke
Feature: Data Table practice


  Scenario: Order Kimchi from Arrigato
    Given User is on namba food
    Then User clicks on foods
    Then User should see "250 Cafes"
    Then User should find Sushi category
    And User click on Sushi
    Then User should see list of cafes
    Then User shoul scroll down to Arrigato cafe
    When User click on Arrigato
    Then User should see Arrigato menu
    And User shoul find Kimchi
    Then User should increase amount to 3
    And User should click on order button
    Then On the cart user should see "450"
@Regression
    Scenario: Verify following tabs displayed on Amazon
      Given User is on https://www.amazon.com/
      Then following menu bar should be displayed on the Home page
        | All | Today's Deal | Customer service | Registry | Gift Card | Sell |
@Regression
  Scenario: Cars model
    Given When user is on cars.kg
    Then Following cars should be displayed
      | Audi | BMW | Mersedes    | Toyota  | Lexus | Lada  |
      | S4   | 525 | E320        | Windom  | ES300 | 2109  |
      | 100  | 745 | S Class     | Camry   | GS300 | Niva  |
      | Q7   | M5  | Gelendwagen | Corolla | RX350 | Sedan |

