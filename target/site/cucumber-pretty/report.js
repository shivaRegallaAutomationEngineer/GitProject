$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/sprint2.feature");
formatter.feature({
  "line": 1,
  "name": "Health Coverage",
  "description": "",
  "id": "health-coverage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User able to buy a healthe Coverage",
  "description": "",
  "id": "health-coverage;user-able-to-buy-a-healthe-coverage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User navigative to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User should HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User click ShopPlan",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User scroll down",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on individual and family",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click learn more",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click view ours plan",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Click geta Qutoe",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User select country",
  "keyword": "Then "
});
formatter.match({
  "location": "HealthCoverageSteps.user_navigative_to_the_application()"
});
formatter.result({
  "duration": 16095114800,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_should_HomePage()"
});
formatter.result({
  "duration": 185206300,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_ShopPlan()"
});
formatter.result({
  "duration": 4066286800,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_scroll_down()"
});
formatter.result({
  "duration": 164554500,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_on_individual_and_family()"
});
formatter.result({
  "duration": 340837200,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_learn_more()"
});
formatter.result({
  "duration": 8138272600,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_click_view_ours_plan()"
});
formatter.result({
  "duration": 5497912300,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_Click_geta_Qutoe()"
});
formatter.result({
  "duration": 33500,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_enter_zipcode()"
});
formatter.result({
  "duration": 5421409300,
  "status": "passed"
});
formatter.match({
  "location": "HealthCoverageSteps.user_select_country()"
});
formatter.result({
  "duration": 5195758700,
  "status": "passed"
});
});