$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/board_test.feature");
formatter.feature({
  "name": "Trello boards api features",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Retrieving boards list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Create one board name \u0027new name\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.createBoardGiveName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send get request to endpoint \u0027/members/me/boards\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendGetRequestAndGiveArg(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \u0027name\u0027 has item \u0027new name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyHasItemValue(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Retrieving boards list when boards list is empty",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RemoveAllBoards"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send get request to endpoint \u0027/members/me/boards\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendGetRequestAndGiveArg(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \u0027id\u0027 is empty",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyKeyIsEmpty(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Receive requested board\u0027s body field",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Create one board name \u0027new name\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.createBoardGiveName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boards\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path board id",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePathBoardId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/name\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send get request",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendGetRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \u0027_value\u0027 is \u0027new name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsValue(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get board actions and limit record to one",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateBoard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boards\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path board id",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePathBoardId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/actions/?limit\u003d1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send get request",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendGetRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \"id\" has size 1",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsNotNull(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get board plugins",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateBoard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boards\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path board id",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePathBoardId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boardPlugins\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send get request",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendGetRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \"idPlugin\" is not null",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsNotNull(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get information about board is starred",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateBoard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boards\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path board id",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePathBoardId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set query parameter \u0027fields\u0027 and value \u0027id\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setQueriesParam(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set query parameter \u0027boardStars\u0027 and value \u0027mine\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setQueriesParam(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send get request",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendGetRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \"boardStars\" is empty",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyKeyIsEmpty(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update board name to update name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateBoard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boards\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path board id",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePathBoardId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set query parameter \u0027name\u0027 and value \u0027updated name\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setQueriesParam(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send put request",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendPutTempRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \u0027name\u0027 is \u0027updated name\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsValue(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Make actions on the board when give wrong board id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateBoard"
    },
    {
      "name": "@RegisterTextParser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boards\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/anErrorId\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set query parameter \u0027name\u0027 and value \u0027updated name\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setQueriesParam(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send put request",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendPutTempRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 400",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 400 Bad Request\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027text/plain; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body text is \u0027invalid id\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Enable voting plugin on board",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateBoard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set base URI \u0027https://api.trello.com/1\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBaseURI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set request content type text",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setContentTypeText()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boards\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path board id",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePathBoardId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set base path \u0027/boardPlugins\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setBasePath(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set query parameter voting plugin id",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setVotingPluginIdBasePath()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set key and token",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.setKeyAndToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send post request",
  "keyword": "When "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.sendPostTempRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Content type should be \u0027application/json; charset\u003dutf-8\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateContentType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \"idPlugin\" is not null",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsNotNull(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body key \"idBoard\" is not null",
  "keyword": "And "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsNotNull(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});