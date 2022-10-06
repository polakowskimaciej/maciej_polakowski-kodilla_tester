# new feature
# Tags: optional

Feature: Cash Withdrawal
  Scenario: Succesful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario Outline: Unsuccesful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request wrong <amount>
    Then I should b`e told null
    Examples:
    | amount |
    | 0 |
    | 230 |
    | -20 |
