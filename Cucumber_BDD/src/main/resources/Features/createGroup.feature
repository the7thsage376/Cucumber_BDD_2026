Feature: Login an group creation

  Scenario Outline: As a user I want to login, create a group and verify that the group is created
    Given I am on the login page
     And I enter email <email>
    And I enter password <password>
    When I click the login button
    Then I should be logged in successfully
    And I click on the logged in user
    And I click on the admin panel
    And I click on the groups tab
    And I click on the create group button
    And I enter group name <groupName>
    And I enter group description <groupDescription>
    And I enter year <year>
    And I enter max capacity <maxCapacity>
    And I enter start date <startDate>
    And I enter end date <endDate>
    When I click on the create group button
    Then I should see the group created successfully

    Examples:
    | email                | password      | groupName  |  groupDescription    | year | maxCapacity | startDate  | endDate    |
    | testing007@gmail.com | @password1234 |Cohort 2027 | The best of the SDET | 2027 | 100         | 0005182026 | 0005182027 |