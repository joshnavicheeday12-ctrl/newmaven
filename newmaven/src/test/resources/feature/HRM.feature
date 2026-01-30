#Author: Joshu
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login to HRM Application

Background: 
  Given User is on HRM Login page

  @tag1
  Scenario: Title of your scenario
    Given 
    And 
    When 
    And 
    And 
    Then 
    And 

  @tag2
  Scenario Outline: 
    Given 
    When 
    Then 
    
    Examples: 
      |  |   |   |
      |  |   |   |
      |  |   |   |
