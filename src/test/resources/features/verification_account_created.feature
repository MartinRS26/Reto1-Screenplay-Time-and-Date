Feature: Verification of account created
  It will be verified that a new account has been created by validating the text of the welcome offer
  Scenario Outline: Account registration verification
    Given I enter the registration page
    When input registration data
      | name   | email   | password   |
      | <name> | <email> | <password> |
    Then the text of the welcome offer would be
      #|textBienvenido  |
      #|<textBienvenido>|
    Examples:
      | name      | email                 | password     |
      | Martin    | m210martin@gmail.com   | MartinAdmin  |
    #  | Alejandro | a105alejo@gmail.com    | AlejoAdmin   |
     # | Pedro     | p105pedro@gmail.com    | PedroAdmin   |
