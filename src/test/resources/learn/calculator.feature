Feature: Calculator test
  Scenario: Sum of two numbers
    Given that there is two numbers 2 and 2
    When we sum up them
    Then the result should be 4

  Scenario: Sum of two numbers - 1
    Given that there is two numbers 5 and 5
    When we sum up them
    Then the result should be 10
