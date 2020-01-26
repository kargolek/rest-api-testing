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
});