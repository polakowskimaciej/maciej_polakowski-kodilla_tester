# new feature
# Tags: optional

Feature: FizzBuzz Game

  Scenario Outline: Int is divisible by 3 and/or divisible by 5
    Given <int>
    When I ask if it's divisible by three and/or divisible by five
    Then I should get <answer>
    Examples:
    | int | answer |
    | 3   | "Fizz" |
    | 5   | "Buzz" |
    | 15  | "FizzBuzz" |
    | 8   | "Nope"     |