Feature: Trello boards api features
  Scenario: Retrieving boards list
    Given Create one board name 'new name'
    Given Set base URI 'https://api.trello.com/1'
    Given Set key and token queries parameters
    When Send get request to endpoint '/members/me/boards'
    Then Status code should be '200'
    Then Status line should be 'HTTP/1.1 200 OK'
    Then Response body for key 'name' has item 'new name'