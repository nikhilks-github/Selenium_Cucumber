$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Demo.Feature");
formatter.feature({
  "line": 1,
  "name": "Testing demo webshop login Feature",
  "description": "",
  "id": "testing-demo-webshop-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enters Username and Password",
  "description": "",
  "id": "testing-demo-webshop-login-feature;user-enters-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters aravind.guggila57@gmail.com as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters aravind as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user wil click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "demo webshop home page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo1_stepDef.the_login_page_is_opened()"
});
formatter.result({
  "duration": 35728332001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "57",
      "offset": 27
    }
  ],
  "location": "Demo1_stepDef.user_enters_aravind_guggila_gmail_com_as_username(int)"
});
formatter.result({
  "duration": 442829401,
  "status": "passed"
});
formatter.match({
  "location": "Demo1_stepDef.user_enters_aravind_as_password()"
});
formatter.result({
  "duration": 308237700,
  "status": "passed"
});
formatter.match({
  "location": "Demo1_stepDef.user_wil_click_on_login_button()"
});
formatter.result({
  "duration": 1885132199,
  "status": "passed"
});
formatter.match({
  "location": "Demo1_stepDef.demo_webshop_home_page_appears()"
});
formatter.result({
  "duration": 20818300,
  "status": "passed"
});
formatter.uri("Feature/Register.Feature");
formatter.feature({
  "line": 1,
  "name": "Register to the System",
  "description": "",
  "id": "register-to-the-system",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User registers to the system successfully",
  "description": "",
  "id": "register-to-the-system;user-registers-to-the-system-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Register page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Clicks on the radio button male or female",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the firstname",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters the last name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters the email",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Registration complete should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Register_stepDef.register_page_is_opened()"
});
formatter.result({
  "duration": 29555367000,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.user_Clicks_on_the_radio_button_male_or_female()"
});
formatter.result({
  "duration": 72340699,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.user_enters_the_firstname()"
});
formatter.result({
  "duration": 167058900,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.user_enters_the_last_name()"
});
formatter.result({
  "duration": 100145200,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.user_enters_the_email()"
});
formatter.result({
  "duration": 221907100,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.user_enters_Password()"
});
formatter.result({
  "duration": 149255801,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.user_enters_confirm_password()"
});
formatter.result({
  "duration": 134872799,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 1428654001,
  "status": "passed"
});
formatter.match({
  "location": "Register_stepDef.registration_complete_should_be_displayed()"
});
formatter.result({
  "duration": 113601,
  "status": "passed"
});
});