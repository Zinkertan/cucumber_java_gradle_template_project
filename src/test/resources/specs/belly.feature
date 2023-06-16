Feature: Belly

  @my
  Scenario: a few cukes
    Given Make request


  Scenario Outline: a few cukes a
    Given I have <n1> cukes in my belly
    Given I have <n2> cukes in my belly
    Given I have <n3> cukes in my belly

    Examples:
      | n1 | n2 | n3 |
      | 21 | 22 | 32 |
      | 41 | 12 | 45 |
      | 41 | 12 | 45 |
      | 41 | 12 | 45 |
      | 41 | 12 | 45 |
      | 41 | 12 | 45 |

