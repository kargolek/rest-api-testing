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

  #Needs to add another account and put account name to Perform search member
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

  @CreateBoard
  Scenario: Update board by changing membership field
    Given Set user "userautoapitest2" as member type "admin" to the board
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/memberships'
    Given Set base path membership id: requested index 1
    Given Set query parameter 'type' and value 'normal'
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "member.username" is "userautoapitest2"
    And Response body key "member.fullName" is "trelloautoapitest2"
    And Response body key "memberType" is "normal"

  @CreateBoard
  Scenario: Update board by change preference email position on top
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/myPrefs/emailPosition'
    Given Set query parameter 'value' and value 'top'
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "emailPosition" is "top"

  @CreateBoard
  Scenario: Update board by put id Email list
    Given Set email key for the board
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/myPrefs/idEmailList'
    Given Set query param idEmailList
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "idEmailList" is not null

  @CreateBoard
  Scenario: Update board by my pref show list guide
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/myPrefs/showListGuide'
    Given Set query parameter "value" and value "true"
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "showListGuide" is boolean "true"

  @CreateBoard
  Scenario: Update board by my pref show sidebar
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/myPrefs/showSidebar'
    Given Set query parameter "value" and value "false"
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "showSidebar" is boolean "false"

  @CreateBoard
  Scenario: Update board by my pref show sidebar activity
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/myPrefs/showSidebarActivity'
    Given Set query parameter "value" and value "false"
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "showSidebarActivity" is boolean "false"

  @CreateBoard
  Scenario: Update board by my pref show sidebar board actions
    Given Set base URI 'https://api.trello.com/1'
    Given Set base path '/boards'
    Given Set base path board id
    Given Set base path '/myPrefs/showSidebarMembers'
    Given Set query parameter "value" and value "false"
    Given Set key and token
    When Send put request
    Then Status code should be 200
    And Content type should be 'application/json; charset=utf-8'
    And Status line should be 'HTTP/1.1 200 OK'
    And Response body key "showSidebarMembers" is boolean "false"