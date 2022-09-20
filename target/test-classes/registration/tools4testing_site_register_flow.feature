Feature: Tools4testing Site Register flow
  I want to use this template for my register flow

	Scenario Outline: Successful Register in Tools4testing site
    Given I open Chrome browser
    When I navigate to tools4testing page
    Then I click on Register button
    Then I provide <firstName> <lastName> <dateOfBirth> <email> <country> <phone> <Address> <gender> <occupation> <subscribeNewsletter>  <password> <confirmpassword>
    And I click on Submit button
    Then Success message is displayed "Thanks for registering!"
    Then I Close the browser
     Examples: 
      | firstName | lastName | dateOfBirth  | email | country | phone | Address | gender | occupation | subscribeNewsletter | password | confirmpassword |
      | "name1" | "lastName" | "11-09-1991" | "testsample7@gmail.com" | "India" | "9986258887" | "address" | "Male " | "STUDENT" | "no" | "pwd" | "pwd" |
      | "name1" | "lastName" | "11-09-1991" | "testsample8@gmail.com" | "India" | "9986258887" | "address" | "Male " | "STUDENT" | "no" | "pwd" | "pwd" |
