Feature: Trello put boards api

  @CreateBoard
  Scenario: Update board name
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set query parameter 'name' and value 'updated name'
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key 'name' is 'updated name'

  @CreateBoard @RegisterTextParser
  Scenario: Update board name when give wrong ID
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path '/anErrorId'
    Given Set query parameter 'name' and value 'updated name'
    Given Set key and token
    When Send put request
    Then Status code should be 400
    And Status line should be 'HTTP/1.1 400 Bad Request'
    And Content type should be 'text/plain; charset=utf-8'
    And Response body text is 'invalid id'

  @CreateBoard
  Scenario: Update board by add member email
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/members'
    Given Set query parameter 'email' and value 'newUserAddedByTestAPI2020@1111111.com'
    Given Set query parameter 'type' and value 'normal'
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "members.fullName" has item "newUserAddedByTestAPI2020"

  #Must add another account and put account name to Perform search member
  @CreateBoard
  Scenario: Update board by add member by his id
    Given Perform search member "userautoapitest2" set his id
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/members'
    Given Set base path found member id
    Given Set query parameter 'type' and value 'admin'
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'