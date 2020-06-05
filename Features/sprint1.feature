Feature: Login Fucntionality
Background:
Given User navigates to the login pages
@smoke
Scenario: Successful login with valid credentials
When  User enter the valid userName "shivaregalla99@gmail.com " 
When  User enter the valid passowrd "abcd@123"
And   USer clicked on the login button
Then  User should be able to login into the application

@smoke34
Scenario: Successful login with valid credentials
When  User enter the valid userName "shivaregalla99@gmail.com " 
When  User enter the valid passowrd "abcd@123"
And   USer clicked on the login button
And   User clicked on the one Way radio button
And   USer Clicked on the continue button
And   USer shoud validate is in depart page
And   USer Clicked on the continue button
And   USer shoud validate is in book flight page
And   USer enter the "shiva" and "regalla" details
And   USer Clicked on the SecurePurchase button
Then  User should verify the confirmation of flight booking


