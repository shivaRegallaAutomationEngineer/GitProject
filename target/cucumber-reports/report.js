$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/sprint2.feature");
formatter.feature({
  "line": 1,
  "name": "Health Coverage",
  "description": "",
  "id": "health-coverage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User able to buy a healthe Coverage",
  "description": "",
  "id": "health-coverage;user-able-to-buy-a-healthe-coverage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User navigative to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User should HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "User click ShopPlan",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User scroll down",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on individual and family",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click learn more",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click view ours plan",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click geta Qutoe",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enter zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User select country",
  "keyword": "Then "
});
formatter.match({
  "location": "HealthCoverageSteps.user_navigative_to_the_application()"
});
formatter.result({
  "duration": 15983358000,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_should_HomePage()"
});
formatter.result({
  "duration": 70204000,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_ShopPlan()"
});
formatter.result({
  "duration": 1873800,
  "error_message": "java.lang.NullPointerException\r\n\tat com.infosys.FlightsApplication.stepsDefinitions.HealthCoverageSteps.user_click_ShopPlan(HealthCoverageSteps.java:29)\r\n\tat ✽.And User click ShopPlan(./Features/sprint2.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_scroll_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_on_individual_and_family()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_learn_more()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_view_ours_plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HealthCoverageSteps.user_Click_geta_Qutoe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HealthCoverageSteps.user_enter_zipcode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HealthCoverageSteps.user_select_country()"
});
formatter.result({
  "status": "skipped"
});
});