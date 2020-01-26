Feature: Trello boards api features

  Scenario: Retrieving boards list
    Given Create one board name 'new name'
    Given Set base URI 'https://api.trello.com/1'
    Given Set key and token queries parameters
    When Send get request to endpoint '/members/me/boards'
    Then Status code should be '200'
    Then Status line should be 'HTTP/1.1 200 OK'
    Then Response body for key 'name' has item 'new name'

  Scenario: Retrieving boards list when boards list is empty
    Given Remove all boards
    Given Register text plain parser
    Given Set base URI 'https://api.trello.com/1'
    Given Set key and token queries parameters
    When Send get request to endpoint '/members/me/boards'
    Then Status code should be '200'
    Then Status line should be 'HTTP/1.1 200 OK'
    Then Response body text 'id' is empty

  Scenario: Update board name to update name
    Given Create one board name 'new name'
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set query parameter 'name' and value 'updated name'
    Given Set key and token queries parameters
    When Send put request
    Then Status code should be '200'
    Then Status line should be 'HTTP/1.1 200 OK'
    Then Response body for key 'name' is 'updated name'