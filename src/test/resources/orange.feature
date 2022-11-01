Feature: Login

  Scenario: Login to the site by entering user id and password
    Given User Launch Chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then Verify user is redirected to OrangeHRM page and title should be Login

    When  User clicks on Username
    And  User clicks on Password
    Then Clicks on Login

    Then Verify  Page title should be Employee Information

    When User clicks on Add

    Then User verify the title should be "Add Employee"
    And User clicks on FirstName
    And User clicks on LastName
#    And User clicks on EmployeeCode

    When User click on Save button
    Then User verify the page should  be "Personal Details"

    When User clicks on PaulB Manoj Collings
    And Clicks on Logout option

    Then Verify user redirected to the Login Page and title should be "Login"


