Feature: Application Login 

Scenario: Home page default Login
Given User is in on Landing page
When use login the application with username and password
Then Home page is populated
And cards are displayed