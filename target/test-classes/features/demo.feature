Feature: Google search page

  Scenario Outline: Search with multiple
    Given I am on google search page
    When I enter "<Searchkeyword>" in search field and hit enter
    Then I page title starts with "<Searchkeyword>"

    Examples:
      | Searchkeyword    |
      | selenium         |
      | seleniumwithjava |
      | testNG           |
