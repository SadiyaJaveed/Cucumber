$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/Features/CucumberDataDriven.feature");
formatter.feature({
  "name": "Practice cucumber concepts using PHP Travels website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "ExampleTable",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ExampleTable"
    }
  ]
});
formatter.step({
  "name": "I click on Register button in login page",
  "keyword": "When "
});
formatter.step({
  "name": "enter the \"\u003cFirstName\u003e\" \"\u003cLastName\u003e\" \"\u003cEmailAddress\u003e\" \"\u003cPhoneNumber\u003e\" \"\u003cHouseNumber\u003e\" \"\u003cStreetAddress\u003e\" \"\u003cCity\u003e\" \"\u003cState\u003e\" \"\u003cPostcode\u003e\" \"\u003cCountry\u003e\" \"\u003cFindUs\u003e\" \"\u003cMobile\u003e\" \"\u003cPassword\u003e\" \"\u003cConfirmPassword\u003e\" in the register page",
  "keyword": "And "
});
formatter.step({
  "name": "click on im not a robot",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Register button after entering the details",
  "keyword": "When "
});
formatter.step({
  "name": "I successfully land in the dashboard page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "EmailAddress",
        "PhoneNumber",
        "HouseNumber",
        "StreetAddress",
        "City",
        "State",
        "Postcode",
        "Country",
        "FindUs",
        "Mobile",
        "Password",
        "ConfirmPassword"
      ]
    },
    {
      "cells": [
        "firstname2",
        "lastname2",
        "firstname2.lastname2@test.com",
        "9876545678",
        "2",
        "streetaddress2",
        "city2",
        "Karnataka",
        "987654",
        "India",
        "Google",
        "9876545678",
        "test@2",
        "test@2"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the PHP travels website \"https://phptravels.org/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.Steps.PHPLoginSteps.i_have_launched_the_PHP_travels_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ExampleTable",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ExampleTable"
    }
  ]
});
formatter.step({
  "name": "I click on Register button in login page",
  "keyword": "When "
});
formatter.match({
  "location": "com.Steps.PHPRegisterSteps.i_click_on_Register_button_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"firstname2\" \"lastname2\" \"firstname2.lastname2@test.com\" \"9876545678\" \"2\" \"streetaddress2\" \"city2\" \"Karnataka\" \"987654\" \"India\" \"Google\" \"9876545678\" \"test@2\" \"test@2\" in the register page",
  "keyword": "And "
});
formatter.match({
  "location": "com.Steps.PHPRegisterSteps.enter_the_in_the_register_page(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on im not a robot",
  "keyword": "And "
});
formatter.match({
  "location": "com.Steps.PHPRegisterSteps.click_on_im_not_a_robot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Register button after entering the details",
  "keyword": "When "
});
formatter.match({
  "location": "com.Steps.PHPRegisterSteps.i_click_on_Register_button_after_entering_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I successfully land in the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.Steps.PHPRegisterSteps.i_successfully_land_in_the_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});