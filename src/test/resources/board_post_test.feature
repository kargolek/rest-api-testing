Feature: Trello post board api

  @CreateBoard
  Scenario: Enable voting plugin on board
    Given Set base URI 'https://api.trello.com/1'
    Given Set request content type text
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/boardPlugins'
    Given Set query parameter voting plugin id
    Given Set key and token
    When Send post request
    Then Status code should be 200
    And Status line should be 'HTTP/1.1 200 OK'
    And Content type should be 'application/json; charset=utf-8'
    And Response body key "idPlugin" is not null
    And Response body key "idBoard" is not null
