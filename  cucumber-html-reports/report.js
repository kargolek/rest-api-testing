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
  "location": "api.cucumber_test.BoardsStepsDefinition.createBoard(java.lang.String)"
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
  "name": "Set key and token queries parameters",
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
  "location": "api.cucumber_test.BoardsStepsDefinition.sendRequest(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be \u0027200\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body for key \u0027name\u0027 has item \u0027new name\u0027",
  "keyword": "Then "
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
  "keyword": "Scenario"
});
formatter.step({
  "name": "Remove all boards",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.removeBoards()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Register text plain parser",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.registerTextParser()"
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
  "name": "Set key and token queries parameters",
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
  "location": "api.cucumber_test.BoardsStepsDefinition.sendRequest(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be \u0027200\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body text \u0027id\u0027 is empty",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsEmpty(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update board name to update name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Create one board name \u0027new name\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.createBoard(java.lang.String)"
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
  "name": "Set key and token queries parameters",
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
  "location": "api.cucumber_test.BoardsStepsDefinition.sendPutRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be \u0027200\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseCode(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status line should be \u0027HTTP/1.1 200 OK\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateStatusLine(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response body for key \u0027name\u0027 is \u0027updated name\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "api.cucumber_test.BoardsStepsDefinition.validateResponseBodyIsValue(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});