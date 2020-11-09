@stories
Feature: UTest Plataform
	As a user, I want to join UTest 
	@scenario1
   Scenario: Create a new user in Utest
   Given than Fanny wants to join to UTest
    When she creates a new user on the UTest platform
    | firstName | lastName	| email        | month|day	|year |post	|password  |confirm   |
    | SaraSofia	| Zapata	| a2@gmail.com | June |17	|1980 |00000|Faz2020.20|Faz2020.20|
    Then she finish 
	@scenario1
   Scenario: Log in with a new user in Utest
   Given than Fanny wants to join to UTest
    When she login with the new user
    | user		  |password  |
    | a1@gmail.com|Faz2020.20|
     
  	Then  she confirms successful creation of the new user
  	| user		  |
    | a1@gmail.com|
  	 