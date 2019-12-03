Feature: make inquiry in google search
  As user I want perform to google search

  Scenario: make inquiry in google search
    Given Mateo wants to start search
    When Mateo perform a google search
    Then Mateo should see the result of search