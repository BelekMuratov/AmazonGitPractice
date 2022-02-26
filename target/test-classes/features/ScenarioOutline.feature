@Smoke
Feature: Scenario outline demo

  Scenario Outline: Multiple tests
    Given user is on Facebook
    When user enters "<email>"
    And user enter "<password>"
    And user clicks on login button
    Then user should see "<message>"
    Examples:
      | email            | password      | message           |
      | nurs@gmail.com   | Qwery123      | Successful        |
      | adik@mail.ru     | Hello312      | Successful        |
      | marsel@yahoo.com | 123Sdsad      | Account not found |
      | rus@bk.ru        | dasdasdasd123 | Account not found |
      | eru@bk.ru        | 12233sdsddsd  | Account not found |

    @E2E
    Scenario: dfffsdf
      Given fddd
      Then fgfg
