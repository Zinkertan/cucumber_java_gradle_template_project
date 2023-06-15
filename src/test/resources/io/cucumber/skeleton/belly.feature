Feature: Belly


  Scenario: a few cukes
    Given I have 42 cukes in my belly
#    When I wait 1 hour
#    Then my belly should growl

  @my
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

#    When I wait 1 hour
#    Then my belly should growl
