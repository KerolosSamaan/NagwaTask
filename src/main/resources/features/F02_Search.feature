@smoke
Feature:user search about lessons
  Scenario:user search about lesson
    Given user click on language list
    When user choose the language
    And user click on search icon
    And user write the lesson name in search text box
    Then user click on search submit

