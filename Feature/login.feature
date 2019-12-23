@tag
Feature: Login Action
	Test Login Functionality

@tag1
Scenario Outline: Successful login with valid credentials
	Given navigate to Home Page
	When user enters "<Username>" and "<Password>"
	Then Message Login Successful
	
	Examples: 
		| Username |  | Password |	
		| Lalitha |	| Password123 |
		| Rick |		| Rick123 |
		| Andrew |	| Andrew123 |
