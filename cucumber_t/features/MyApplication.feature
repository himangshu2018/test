Feature: test fecebook smoke scenario

  Scenario: test login with valid credentials
    Given open chrome browser and start application
    When i enter valid "hzoadder@yahoo.com" and valid "3456789"
    Then user should be able login successfully
    
