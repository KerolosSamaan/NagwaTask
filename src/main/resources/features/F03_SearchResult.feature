@smoke
Feature:user choose second lesson
  Scenario:user choose second lesson
    Given user click on language list
    When user choose the language
    And user click on search icon
    And user write the lesson name in search text box
    And user click on search submit
    Then user click on 2nd lesson