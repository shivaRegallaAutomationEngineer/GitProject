Feature: Health Coverage
@smoke
Scenario: User able to buy a healthe Coverage 
Given User navigative to the application
And   User should HomePage
And   User click ShopPlan
And   User scroll down
When  User click on individual and family
And   User click learn more
And   User click view ours plan
When  User Click geta Qutoe
And   User enter zipcode
Then  User select country